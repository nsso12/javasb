package ch10;

import ch08.Book;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("행관성","김지영"));
        list.add(new Book("행관성","김지영"));
        list.add(new Book("아몰돼","소효"));
        list.add(new Book("행관성","김지영"));
        list.add(new Book("내맘내싫","김우석"));

        for(int i=0; i<list.size(); i++) {
            list.get(i).showBookInfo();
        }
    }
}
