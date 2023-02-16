package JavaTopics;

public class RecursiveMethod {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int fib(int n) {
        //1 1 2 3 5 8 13... || n = (n -1) + (n -2)
        if (n >= 3) {
            return fib(n - 1) + fib(n - 2); //This is called recursive case.
        } else {
            return 1; //This is called base case.
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

        System.out.println(fib(7));
    }
}
