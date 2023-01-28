package class15;

public class MethodsPracticeTester2 {
    public static void main(String[] args) {

        MethodsPractice number = new MethodsPractice();
        boolean result = number.oddEven(100);
        System.out.println(result);

        boolean result2 = number.oddEven(12);
        System.out.println(result2);

        boolean result3 = number.oddEven(20);
        System.out.println(result3);

        boolean result4 = number.oddEven(27);
        System.out.println(result4);
    }
}
