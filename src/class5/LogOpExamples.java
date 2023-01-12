package class5;

public class LogOpExamples {
    public static void main(String[] args) {

        //EXAMPLE 1

        if (10 > 5 || 4 > 6) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        //EXAMPLE 2

        String name = "Adam";
        int age = 32;
        if (name.equals("Adam") && age == 30) {
            System.out.println("You are the one.");
        } else {
            System.out.println("Wrong person.");
        }

        //EXAMPLE 3

        boolean isTrue = false;
        if (!isTrue) {
            System.out.println("You got it.");
        }else {
            System.out.println("You need to practice.");
        }

    }
}
