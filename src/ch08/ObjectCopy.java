package ch08;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];

        library[0] = new Book("행관성", "김지영");
        library[1] = new Book("필피되", "김지영");
        library[2] = new Book("나왜참", "김지영");
        library[3] = new Book("내맘내싫", "김우석");
        library[4] = new Book("감자밭", "이미소");

        System.arraycopy(library,0, copylibrary,0,5);

        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("===========");

        for(Book book : copylibrary) {
            book.showBookInfo();
        }

        library[0].setAuthor("김상현");
        library[0].setTitle("내죽장");

        for(Book book : library) {
            book.showBookInfo();
        }

        System.out.println("===========");

        for(Book book : copylibrary) {
            book.showBookInfo();
        }
    }
}
