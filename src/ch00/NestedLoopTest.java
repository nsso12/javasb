package ch00;

public class NestedLoopTest {
    public static void main(String[] args) {

        int x = 2;
        int y = 1;

        for(x=2; x<10; x++) {
            System.out.println();
            for(y=1; y<10; y++) {
                System.out.println( x + " * " + y + " = " + (x*y) );
            }
        }
    }
}
