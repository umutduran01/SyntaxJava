package class17;

public class StudentTester {
    public static void main(String[] args) {

        /*
        Student newStudent1 = new Student();
        newStudent1.id = 123;
        newStudent1.name = "George";
        newStudent1.age = 14;
        newStudent1.weight = 45.9;

        Student newStudent2 = new Student();
        newStudent2.id = 345;
        newStudent2.name = "Maria";
        newStudent2.age = 64;
        newStudent2.weight = 47.3;

        Student newStudent3 = new Student();
        newStudent3.id = 890;
        newStudent3.name = "Angela";
        newStudent3.age = 24;
        newStudent3.weight = 67.9;
        */

        Student newStudent1 = new Student(123, "George", 14, 45.9);
        Student newStudent2 = new Student(345, "Maria", 64, 47.3);
        Student newStudent3 = new Student(890, "Angela", 24, 67.9);

        //Tüm hepsini tek satırda yazdık.

        newStudent1.printInfo();
        newStudent2.printInfo();
        newStudent3.printInfo();
    }
}
