package ch29;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }


    // 선반에 있는 자료의 수가 몇개인지
    public int getCount() {
        return shelf.size();
    }
}
