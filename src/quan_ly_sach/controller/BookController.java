package quan_ly_sach.controller;


import quan_ly_sach.service.BookService;

import java.util.Scanner;

public class BookController {
    BookService bookService = new BookService();
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        WHILE_OUT: while (true) {
            System.out.print("----Quản lý sách----- \n" +
                    "1. Hiển thị danh sách sách \n" +
                    "2. Thêm mới sách \n" +
                    "3. Xoá sách \n" +
                    "4. Sửa sách \n" +
                    "5. Thoát \n" +
                    "Mời bạn chọn chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    // hien thi
                    bookService.displayBookList();
                    break;
                case "2":
                    // them moi
                    bookService.addNewBook();
                    break;
                case "3":
                    // xoa
                    break;
                case "5":
                    break WHILE_OUT;
                default:
                    System.out.println("Chức năng không hợp lệ");
            }
        }
    }
}
