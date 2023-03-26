package check;

public class Test01 {
    // 구구단을 짝수만 출력하도록 프로그램을 만들기
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            if (i%2 != 0) continue;
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
        }

    }
}
