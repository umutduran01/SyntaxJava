package Replit;

public class R137Modifier {
    /*
    For you to do

    In main class please declare the variables using different access modifiers that will hold value for:

    - name
    - city
    - name of the school
    - batch number

    Create a method to display details in following format:

    My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_

    Assign values to the variables and execute method display

    **Expected Output:**

    My name is John and I live in Miami. I study at Syntax in batch 9
     */

    private String name = "John";
    protected String city = "Miami";
    String schoolName = "Syntax";
    public int batchNum = 9;

    void info() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + schoolName + " in batch " + batchNum);
    }

    public static void main(String[] args) {
        R137Modifier newTest = new R137Modifier();
        newTest.info();
    }
}
