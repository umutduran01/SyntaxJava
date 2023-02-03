package Replit;

public class R121Variables {
    /*
    declare 3 instance variables to hold an integer, double and char values.

    Create 2 instances of the class and assign values to variables and the print them

    **Expected Output:**

    10
    10.23
    a
    100
    100.23
    s
    */

    double d;
    int i;
    char c;

    public static void main(String[] args) {

        R121Variables newTest1 = new R121Variables();
        newTest1.d = 10.23;
        newTest1.i = 10;
        newTest1.c = 'a';

        System.out.println(newTest1.i);
        System.out.println(newTest1.d);
        System.out.println(newTest1.c);


        R121Variables newTest2 = new R121Variables();
        newTest2.d = 100.23;
        newTest2.i = 100;
        newTest2.c = 's';

        System.out.println(newTest2.i);
        System.out.println(newTest2.d);
        System.out.println(newTest2.c);

    }
}
