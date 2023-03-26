package check;

public class Test02 {
    public static void main(String[] args) {

        //구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보시오

        for(int i=2; i<=9; i++) {
            for(int j=1; j<=i; j++) {
                System.out.println(i+"X"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
