package quan_ly_sach.service;



import quan_ly_sach.model.Book;
import quan_ly_sach.repository.BookRepository;

import java.util.List;
import java.util.Scanner;

public class BookService {
    BookRepository bookRepository = new BookRepository();

    public void displayBookList() {
        List<Book> bookList = bookRepository.getBookList();
        for (Book b :
                bookList) {
            System.out.println(b);
        }
        // hien thi
    }

    public void addNewBook() {
        /*Thu thap thong tin sach, khoi tao doi tuong*/
        // int bookID, String bookName, String author, String publisher
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id sách: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sách: ");
        String bookName = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = scanner.nextLine();
        System.out.print("Nhập NXB: ");
        String publisher = scanner.nextLine();
        Book newBook = new Book(id,bookName,author,publisher);
        /*Luu vao danh sach*/
        bookRepository.addBook(newBook);
    }
}
