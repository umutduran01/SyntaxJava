package class6;

public class WhileLoopDemo3 {
    public static void main(String[] args) {

        int number = 2;
        while (number < 10) {
            if (number % 2 == 0) {
                System.out.println("Even " + number);
            }
            number++;
        }

    }
}
