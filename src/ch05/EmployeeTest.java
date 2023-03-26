package ch05;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("지우");

//      System.out.println(employeeLee.serialNum); => 8번줄과 같은 의미 (static은 클래스 변수)
        System.out.println(Employee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("소현");
        employeeKim.serialNum++;

        System.out.println(employeeLee.serialNum);
        System.out.println(employeeKim.serialNum);

        System.out.println(employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeId());
    }
}
