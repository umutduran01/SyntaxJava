package class17.Class17Homework;

public class StudentsTester {
    public static void main(String[] args) {

        Students newStudent1 = new Students("Ali",45,96,24);
        Students newStudent2 = new Students("Ayşe",47,42,80);
        Students newStudent3 = new Students("Ahmet",60,26,84);
        Students newStudent4 = new Students("Fatma",28,92,43);
        Students newStudent5 = new Students("Mustafa",94,26,90);

        newStudent1.printAverage();
        newStudent2.printAverage();
        newStudent3.printAverage();
        newStudent4.printAverage();
        newStudent5.printAverage();

    }
}
