package lv.sda;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private static List<Book> bookList = new ArrayList<>();

    public void add(Book book) {
        if(bookList.contains(book)) {
            throw new RuntimeException("Book already exists");
        } else {
            bookList.add(book);
        }
    }

    public void delete(Book book) {
        if(bookList.contains(book)) {
            bookList.remove(book);
        } else {
            throw new RuntimeException("Book not found");
        }
    }

    public List<Book> getBooks() {
        return bookList;
    }
}
