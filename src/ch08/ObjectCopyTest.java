package ch08;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];

        library[0] = new Book("행관성", "김지영");
        library[1] = new Book("필피되", "외서");
        library[2] = new Book("나왜참", "이시바라");
        library[3] = new Book("내맘내싫", "김우석");
        library[4] = new Book("감자밭", "이미소");

        for(int i=0; i<library.length; i++) {
            copylibrary[i] = new Book();
            copylibrary[i].setAuthor(library[i].getAuthor());
            copylibrary[i].setTitle(library[i].getTitle());
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
