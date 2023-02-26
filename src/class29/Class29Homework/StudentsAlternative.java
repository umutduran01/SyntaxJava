package class29.Class29Homework;

import java.util.HashSet;
import java.util.Set;

public class StudentsAlternative {

    private String name;
    private int studentID;

    public StudentsAlternative(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public static void main(String[] args) {

        //HashSet<StudentsAlternative> students = new HashSet<>();
        Set<StudentsAlternative> students2 = new HashSet<>(); //We can achieve polymorphism here.
        students2.add(new StudentsAlternative("Ana A", 123));
        students2.add(new StudentsAlternative("Maya M", 456));
        students2.add(new StudentsAlternative("Sofia K", 789));

        for (StudentsAlternative studentsAlternative : students2) {
            System.out.println(studentsAlternative.getName());
        }

    }
}
