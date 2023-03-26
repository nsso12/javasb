package ch06;

public class School {

    private static School instance = new School();
    private School() {}

    public static School getInstance() {
        if(instance == null) {  //객체가 생성되지 않았다면
            instance = new School();
        }
        return instance;
    }
}
