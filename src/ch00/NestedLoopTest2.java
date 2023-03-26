package ch00;

public class NestedLoopTest2 {
    public static void main(String[] args) {

        // for문 구구단
        int dan;
        int times;

        for (dan = 2; dan <= 9; dan++) {
            for (times = 1; times <= 9; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }

        // while문 구구단
        dan = 2;
        times = 1;
        while(dan <= 9) {
            times = 1;
            while(times <=9) {
                System.out.println(dan + "x" + times + "=" + dan*times);
                times ++;
            }
            dan++;
        }
    }
}
