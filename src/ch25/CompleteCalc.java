package ch25;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public void showInfo() {
        System.out.println("모두 구현하였습니다");
    }
}
