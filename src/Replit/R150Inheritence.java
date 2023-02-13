package Replit;

public class R150Inheritence {
    /*
    1. Create four classes (Person, Employee, Student, Retiree)

    * Have properties

    For Person: name(String)

    For Person: lastName(String)

    For Person: age(int)

    For Employee: salary(int)

    For Student: grade(int)

    For Retiree: seniorActivity(String)

    At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

    Create multilevel inheritance: Person --> Employee --> Student --> Retiree

    From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

    **Expected Output:**

    Joe Smith 35 35000
    Adam Smith 15 10
    Frank Smith 15 tour

    */
    public static void main(String[] args) {

        Employeee newTest = new Employeee();
        newTest.name = "Joe";
        newTest.lastName = "Smith";
        newTest.age = 35;
        newTest.salary = 35000;

        System.out.println(newTest.name + " " + newTest.lastName + " " + newTest.age + " " + newTest.salary);

        Student newTest2 = new Student();

        newTest2.name = "Adam";
        newTest2.lastName = "Smith";
        newTest2.age = 15;
        newTest2.grade = 10;

        System.out.println(newTest2.name + " " + newTest2.lastName + " " + newTest2.age + " " + newTest2.grade);

        Retiree newTest3 = new Retiree();

        newTest3.name = "Frank";
        newTest3.lastName = "Smith";
        newTest3.grade = 15;
        newTest3.seniorActivity = "tour";

        System.out.println(newTest3.name + " " + newTest3.lastName + " " + newTest3.grade + " " + newTest3.seniorActivity);

    }

}

class Person {

    String name;
    String lastName;
    int age;
}

class Employeee extends Person {

    int salary;
}

class Student extends Employeee {

    int grade;
}

class Retiree extends Student {

    String seniorActivity;
}