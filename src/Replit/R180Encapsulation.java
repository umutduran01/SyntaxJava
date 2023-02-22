package Replit;

public class R180Encapsulation {
    /*
    Create Class EncapsulationDemo

    create two variable as shown below.

    private String empName=John;

    private int empAge=30;

    Create only getters methods for each variable.

    Print the values of each variable as shown below.

    **Expected Output:**

    Employee Name: John

    Employee Age: 30
    */

    public static void main(String[] args) {

        EncapsulationDemo3 newTest = new EncapsulationDemo3();
        System.out.println("Employee Name: " + newTest.getEmpName());
        System.out.println("Employee Age: " + newTest.getEmpAge());

    }
}

class EncapsulationDemo3 {

    private String empName = "John";

    private int empAge = 30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
}
