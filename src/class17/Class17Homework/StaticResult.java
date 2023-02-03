package class17.Class17Homework;

public class StaticResult {

    //Write program that have static constructor and observe result.

    static int age;

    static int StaticResult(int sAge) {
        age = sAge;
        return sAge * 10;
    }

    public static void main(String[] args) {
        int result = StaticResult(20);
        System.out.println(result);
    }

}
