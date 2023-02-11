package class23;

public class StudentTesting {
    public static void main(String[] args) {

        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student student : students
        ) {
            student.readyForClass();
            student.studentOnBreak();
        }

    }
}
