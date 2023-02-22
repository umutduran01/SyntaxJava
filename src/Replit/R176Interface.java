package Replit;

interface ParentInterface {

    void parentMethod();
}

interface ChildInterface extends ParentInterface {

    void childMethod();

}

public class R176Interface implements ChildInterface {

    /*
    Step 1: Create Parent Interface as ParentInterface that will have undefined method parentMethod without parameters.

    Step 2: Create an Interface as ChildInterface that will be a child interface of Parent Interface and will have a method childMethod without parameters.

    Step 3: Inherit the Main class to Child Interface.

    Step 4: Execute both methods

    **Expected Output:**

    Parent Method-welcome to Syntax
    Child Method-hello Syntax
    */

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    public static void main(String[] args) {

        R176Interface newTest = new R176Interface();
        newTest.parentMethod();
        newTest.childMethod();

    }
}
