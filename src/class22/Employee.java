package class22;

public class Employee {
    String name;
    static int baseSalary = 3000;
    static int baseHolidays = 10;

    void printSalary() {
        System.out.println(baseSalary);
    }

    void printHolidays() {
        System.out.println(baseHolidays);
    }
}

class OfficeBoys extends Employee {
    @Override //We can use this expression to show that it is an override method. This is called annotation.
    void printSalary() {
        System.out.println(baseSalary - 500); //We kept the same method name and modified.
    }
}

class Manager extends Employee {
    void printSalary() {
        System.out.println(baseSalary * 4); //We kept the same method name and modified.
    }
}

class Testing {
    public static void main(String[] args) {

        Employee newEmployee1 = new Employee(); //We created a new employee.

        System.out.println(Employee.baseSalary); //We print static method by calling with class name.
        newEmployee1.printSalary(); //This can also do the same by using object and the method we created.


        System.out.println(Employee.baseHolidays); //We print static method by calling with class name.
        newEmployee1.printHolidays(); //This can also do the same by using object and the method we created.

        OfficeBoys newOfficeBoy1 = new OfficeBoys(); //We created a new office boy.

        newOfficeBoy1.name = "Mr. XYZ"; //This object is from OfficeBoys class and instance variable is called from parent class which is Employee.
        newOfficeBoy1.printSalary(); //This method is called from OfficeBoys class.


    }
}
