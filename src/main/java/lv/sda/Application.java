package lv.sda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Book bookItem1 = new Book(Math.round(Math.random()*10000), "Book1", "Author1", (int) Math.round(Math.random()*200));
        Book bookItem2 = new Book(Math.round(Math.random()*10000), "Book2", "Author1", (int) Math.round(Math.random()*300));
        Book bookItem3 = new Book(Math.round(Math.random()*10000), "Book1", "Author2", (int) Math.round(Math.random()*250));

        BookShelf bookShelf = new BookShelf();
        bookShelf.add(bookItem1);
        bookShelf.add(bookItem2);
        bookShelf.add(bookItem3);

        List<String> filteredBooks = bookShelf.getBooks().stream()
                .filter(item -> item.getPages() > 100)
                .map(item -> String.format("%s %s", item.getAuthor(), item.getTitle()))
                .collect(Collectors.toList());

        filteredBooks.forEach(log::info);
    }
}