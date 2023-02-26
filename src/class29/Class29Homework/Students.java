package class29.Class29Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Students {

    String name;
    int studentID;

    public Students(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public static void main(String[] args) {

        /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order. Each student object should have name and studentID. Display name of each student.
        */

        Set<Students> students = new HashSet<>();

        Students students1 = new Students("Umut", 123);
        Students students2 = new Students("George", 456);
        Students students3 = new Students("Michael", 789);

        students.add(students1);
        students.add(students2);
        students.add(students3);

        for (Students student : students) {
            System.out.println(student.name + " " + student.studentID);
        }

    }
}
