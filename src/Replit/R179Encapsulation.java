package Replit;

public class R179Encapsulation {
    /*
    Create Class EncapsulationDemo2 that will have 2 variables empName and empAge;
    Create the getter/setter methods for each variable.

    In Main Class and main method

    Using setter methods assign the values as "Mario" and "32"

    Using getter methods print the values as below outputs.

     **Expected Output:**

    Employee Name: Mario
    Employee Age: 32
    */

    public static void main(String[] args) {

        EncapsulationDemo2 newTest = new EncapsulationDemo2();
        newTest.setEmpName("Mario");
        newTest.setEmpAge(32);
        System.out.println("Employee Name: " + newTest.getEmpName());
        System.out.println("Employee Age: " + newTest.getEmpAge());

    }
}

class EncapsulationDemo2 {

    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
