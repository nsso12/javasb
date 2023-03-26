package practice;

public class Student {
    int studentId;
    String studentName;
    String studentAddress;

    public Student (int id, String name) {
        studentId = id;
        studentName = name;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + studentAddress);
    }

    public String getStudentName() {
        return studentName;
    }


}
