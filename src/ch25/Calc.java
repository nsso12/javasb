package ch25;

public interface Calc {

    double PI = 3.14;
    int Error = -999999;
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //public abstract 키워드를 쓰지 않아도 선언을 함으로써 나중에 프리 컴파일 될 때 저 키워드가 모두 들어감
    
}
