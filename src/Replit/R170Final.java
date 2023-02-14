package Replit;

public class R170Final {
    /*
    For you to do:

    Overload 2 final instance methods:

    Call them in main method

    **Expected Output:**

    Final method with boolean parameter
    Final method with String parameter

    */

    final void hungry(boolean hungry) {
        System.out.println("Final method with boolean parameter");
    }

    final void happy(String happy) {
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {
        R170Final newTest = new R170Final();
        newTest.hungry(true);

        newTest.happy("Hello !");
    }
}
