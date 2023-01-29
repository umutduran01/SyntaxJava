package class16;

public class StudentsTester {

    public static void main(String[] args) {

        Students student1 = new Students();
        student1.name = "ABC";
        student1.id = 123;
        student1.noOfStudents++;

        Students student2 = new Students();
        student2.name = "XYZ";
        student2.id = 890;
        student2.noOfStudents++;


        Students student3 = new Students();
        student3.name = "ASD";
        student3.id = 456;
        student3.noOfStudents++;

        System.out.println(Students.noOfStudents);



    }
}
