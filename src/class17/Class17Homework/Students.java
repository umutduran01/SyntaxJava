package class17.Class17Homework;

public class Students {

    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.
    NOTE: please use different names for instance and local variables.
    */

    String name;
    int history;
    int math;
    int coding;

    Students(String sName, int sHistory, int sMath, int sCoding) {
        name = sName;
        history = sHistory;
        math = sMath;
        coding = sCoding;
    }

    void printAverage() {
        System.out.println(name + "'s average mark is " + (history + math + coding)/3);
    }
}
