package class15;

public class ReverseMethodTester {
    public static void main(String[] args) {

        ReverseMethod strToReverse = new ReverseMethod();

        String reversed = strToReverse.reverseStr("Sunday");
        System.out.println(reversed);


        String reversed2 = strToReverse.reverseStr2("Monday");
        System.out.println(reversed2);

        String reversed3 = strToReverse.reverseStr3("Friday");
        System.out.println(reversed3);

    }
}
