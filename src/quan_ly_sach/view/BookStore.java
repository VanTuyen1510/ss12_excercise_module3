package quan_ly_sach.view;

import quan_ly_sach.controller.BookController;

public class BookStore {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.showMenu();
    }
}
