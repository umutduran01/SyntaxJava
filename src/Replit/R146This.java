package Replit;

public class R146This {
    /*
    1. Complete the Employee.java class:

    Include the following class variables:

    * name(String)
    * lastName(String)
    * employeeId(int)
    * startDate(String)
    * salary(int)

    Write two constructors:

    * non-argument constructor
    * parameterized constructor that will initialize all instance variables

    Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.

    Output:

    null null 0 null 0

    Joe Smith 12345 01/01/1970 35000
    */

    public static void main(String[] args) {

        Employee newTest1 = new Employee();
        Employee newTest2 = new Employee("Joe","Smith",12345,"01/01/1970",35000);

        System.out.println(newTest1.name + " " + newTest1.lastName + " " + newTest1.employeeId + " " + newTest1.startDate + " " + newTest1.salary);
        System.out.println(newTest2.name + " " + newTest2.lastName + " " + newTest2.employeeId + " " + newTest2.startDate + " " + newTest2.salary);

    }
}

class Employee {

    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    Employee() {

    }

    Employee(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }
}
