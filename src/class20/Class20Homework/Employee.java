package class20.Class20Homework;

public class Employee {
    /*
    Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    Test your code!
    */

    String name;
    int age;

    void employeeName() {
        System.out.println("Employee name is " + name);
    }

    void employeeAge() {
        System.out.println("Employee age is " + age);
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class FullTime extends Employee {

    int workHour;

    void workHour() {
        System.out.println("Employee worked " + workHour + " hours");
    }

    FullTime(String name, int age, int workHour) {
        super(name, age);
        this.workHour = workHour;
    }
}

class PartTime extends Employee {

    String address;

    void workHour() {
        System.out.println("Employee address is " + address);
    }

    PartTime(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }
}

class EmployeeTester extends FullTime {

    int salary;

    EmployeeTester(String name, int age, int workHour, int salary) {
        super(name, age, workHour);
        this.salary = salary;
    }

    public static void main(String[] args) {
        EmployeeTester newEmployee = new EmployeeTester("Ali",46,160,3500);
        newEmployee.employeeAge();
        newEmployee.employeeName();
        newEmployee.workHour();

    }
}
