package ch02;

public class BirthdayTest {
    public static void main(String[] args) {
        BirthDay day = new BirthDay();
        day.setYear(2023);
        day.setMonth(12);
        day.setDay(24);

        System.out.println(day.isValid());

        System.out.println(day);
        day.printThis();
    }
}
