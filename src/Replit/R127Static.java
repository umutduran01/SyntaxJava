package Replit;

public class R127Static {
    /*
    Create two methods:

    The first method should be a non-static method that will print out the following message:

    "Programming is amazing."

    The second method should be a static method that will print out the following message:

    "Java is awesome."

    Execute both methods

    **Expected Output:**

    Programming is amazing.

    Java is awesome.
    */

    void print(){
        System.out.println("Programming is amazing.");
    }

    static void print2(){
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {

        R127Static homework = new R127Static();
        homework.print();

        R127Static.print2();
    }
}
