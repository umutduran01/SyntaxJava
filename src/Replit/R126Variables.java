package Replit;

public class R126Variables {
    /*
    Create a variable that will hold the count of all instances of the Main class

    Create 3 Object of the class and print value of the count variable;

    **Expected Output:**

    3
    */

    static int count = 0;

    public static void main(String[] args) {

        R126Variables newTest1 = new R126Variables();
        newTest1.count++;

        R126Variables newTest2 = new R126Variables();
        newTest2.count++;

        R126Variables newTest3 = new R126Variables();
        newTest3.count++;

        System.out.println(R126Variables.count);
    }
}
