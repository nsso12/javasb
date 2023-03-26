package ch08;

public class BookArrayTest {
    public static void main(String[] args) {
        Book library[] = new Book[5];

        library[0] = new Book("행관성", "김지영");
        library[1] = new Book("필피되", "김지영");
        library[2] = new Book("나왜참", "김지영");
        library[3] = new Book("내맘내싫", "김우석");
        library[4] = new Book("감자밭", "이미소");

        for(Book book : library) {
            book.showBookInfo();
            System.out.println(book);
        }
    }
}
