package ch00;

public class ForTest2 {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while(num <= 10) {
            sum += num;
            num ++;
        }
        System.out.println(sum);

        for(num=1, sum=0; num<=10; num++) {
            sum += num;
        }
            System.out.println(sum);
    }
}
