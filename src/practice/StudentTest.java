package practice;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1,"Lee");
//        studentLee.studentName = "Lee";
        studentLee.studentAddress = "seoul";

        Student studentKim = new Student(2,"Kim");
//        studentKim.studentName = "Kim";
        studentKim.studentAddress = "New York";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

    }
}
