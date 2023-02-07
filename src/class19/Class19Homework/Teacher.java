package class19.Class19Homework;

//Write a Java program called Teacher. Identify features and 4 behaviour of that Class.
// Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes


public class Teacher {

    String name;
    int teacherId;
    int year;

    void teacherYear(int year) {
        this.year = year;
        System.out.println("Teacher for " + year);
    }

    void teacherName(String name) {
        this.name = name;
    }

    void id(int teacherId) {
        this.teacherId = teacherId;
        System.out.println(teacherId);
    }

    String teacherInfo(String name, int teacherId, int year) {
        this.name = name;
        this.teacherId = teacherId;
        this.year = year;

        return name + " is teacher for " + year + " and ID is " + teacherId;
    }
}

class MathTeacher extends Teacher {
    int experience;

    void MathExperience() {
        System.out.println(experience);
    }
}

class ChemistryTeacher extends Teacher {

    boolean married = false;

    void marriedStatus() {
        System.out.println(married);
    }
}

class PianoTeacher extends Teacher {

    double pianoTeacherMoney;

    void money() {
        System.out.println(pianoTeacherMoney);
    }
}

class Main {
    public static void main(String[] args) {

        Teacher newTeacher = new Teacher();
        newTeacher.teacherYear(15);

        MathTeacher newTeacher2 = new MathTeacher();
        newTeacher2.experience = 10;
        newTeacher2.MathExperience();

        PianoTeacher newTeacher3 = new PianoTeacher();
        String result = newTeacher3.teacherInfo("George", 123456, 20); //PianoTeacher class calls parent class method. Eğer method private olsaydı bu class içerisinde ulaşamaazdır.
        System.out.println(result);
    }
}