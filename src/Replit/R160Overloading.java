package Replit;

public class R160Overloading {
    /*
    For you to do:

    Overload instance method display by having different types of parameters

    Inside each method write the logic to print value of the parameter

    Call all methods inside your main method

    **Expected Output:**

    100

    Syntax Technologies

    100.09
    */

    void display(int num){
        System.out.println(num);
    }

    void display(String school){
        System.out.println(school);
    }

    void display(double speed){
        System.out.println(speed);
    }

    public static void main(String[] args) {
        R160Overloading newTest = new R160Overloading();
        newTest.display(100);
        newTest.display("Syntax Technologies");
        newTest.display(100.09);
    }
}