package class6;

public class WhileLoopDemo4 {
    public static void main(String[] args) {

        int number = 0;

        while (number <= 16) {

            if (number % 5 != 0) {
                System.out.println(number);
            }
            number++;
        }

    }
}
