package Replit;

public class R110Methods {

    void newLine() {
        System.out.println("newLine method implementation");
    }

    void displayLine(){
        System.out.println("displayLine method implementation");
    }


    public static void main(String[] args) {


        /*
        1. Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"

        1. Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"

        3. Call both methods

        **Expected Output:**

        newLine method implementation
        displayLine method implementation

         */

        R110Methods newPrint = new R110Methods();
        newPrint.newLine();
        newPrint.displayLine();
    }
}

