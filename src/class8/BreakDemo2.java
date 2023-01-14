package class8;

public class BreakDemo2 {
    public static void main(String[] args) {

        boolean summer = true;
        int temp = 75;

        while (summer) {

            if (temp < 100) {
                System.out.println("We are good.");
            } else {
                System.out.println("It is very hot.");
                break;
            }

            System.out.println(temp);
            temp = temp + 5;

        }


    }
}
