package ch29;

import ch08.Book;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("행관성");
        bookQueue.enQueue("나왜참");
        bookQueue.enQueue("필피되");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
