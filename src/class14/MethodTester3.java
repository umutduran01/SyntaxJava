package class14;

public class MethodTester3 {
    public static void main(String[] args) {

        MethodsDemo3 numbers = new MethodsDemo3();
        numbers.sum(6, 7);
        numbers.mul(5, 5, 2);

        int result = numbers.divide(8, 2); //returns the value
        System.out.println(result);

    }
}
