package Replit;

public class R162Overloading {
    /*
    Overload static method and then execute both overloaded methods.

    **Expected Output:**

    static method without parameter
    static method with int parameter
     */

    static void displayNum(){
        System.out.println("static method without parameter");
    }

    static void displayNum(int num){
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        R162Overloading.displayNum();
        R162Overloading.displayNum(1);
    }
}