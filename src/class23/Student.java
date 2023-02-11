package class23;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
    */

    public void readyForClass() {
        System.out.println("Student is ready for class.");
    }

    void studentOnBreak() {
        System.out.println("Break time for student.");
    }
}

class SyntaxStudent extends Student {
    @Override
    public void readyForClass() {
        System.out.println("Student is ready for Java class.");
    }

    @Override
    public void studentOnBreak() {
        System.out.println("Student is ready for short break.");
    }

    void video() {
        System.out.println("Student need to do Selenium videos.");
    }
}

class CollegeStudent extends Student {
    @Override
    public void readyForClass() {
        System.out.println("Student is ready for Science class.");
    }

    @Override
    public void studentOnBreak() {
        System.out.println("Student is ready for long break.");
    }

    void party() {
        System.out.println("Student need to go to the weekend party.");
    }
}

class SchoolStudent extends Student {
    @Override
    public void readyForClass() {
        System.out.println("Student is ready for Grammar class.");
    }

    @Override
    public void studentOnBreak() {
        System.out.println("Student is ready for lunch break.");
    }

    void homework() {
        System.out.println("Student needs to do the homeworks.");
    }
}
