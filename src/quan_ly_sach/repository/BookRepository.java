package quan_ly_sach.repository;



import quan_ly_sach.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    static List<Book> bookList = new ArrayList<>();

    static {
        // int bookID, String bookName, String author, String publisher
        Book book1 = new Book(1,"Rung nauy", "Haruki Murakami", "Nhã Nam");
        Book book2 = new Book(2, "Sách giáo khoa tiếng việt lớp 1", "Bộ Giáo Dục", "Kim Đồng");
        Book book3 = new Book(3, "Dịch Hạch", "Albert Camus", "Văn Hoá");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book newBook) {
        bookList.add(newBook);
        System.out.println("Thêm thành công sách: " + newBook.getBookName());
    }
}
