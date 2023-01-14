package JavaRecap;

import java.util.Scanner;

public class Recap1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter name and surname: ");
        String nameSurname = input.nextLine(); //.next() yerine .nextLine() kullandık çünkü sadece ilk kelimeden fazlası lazım.

        System.out.print("Please enter age: ");
        int age = input.nextInt();

        System.out.print("Please enter gender (M or F): ");
        char gender = input.next().charAt(0);

        System.out.print("Please enter your height: ");
        int height = input.nextInt();

        System.out.print("Please enter your weight: ");
        double weight = input.nextDouble();

        System.out.print("Are you willing to join to soccer club ?: ");
        boolean join = input.nextBoolean();

        if (join) {
            System.out.println("We can take you to exams.");
        } else {
            System.out.println("You can start to play table tennis.");
            System.exit(0); //Programın daha ileriye gitmemesi için bu komutu girdik. 0 programın başarılı bir şekilde sona erdiğini gösteriyor. Başka değer hata gösterir.
        }

        if (age >= 18) {
            System.out.println("You will join to team A");
            if (gender == 'M') {
                System.out.println("Male Football Team");
            } else if (gender == 'F') {
                System.out.println("Female Football Team");
            } else {
                System.out.println("We see that you entered an invalid gender. You should ask again.");
                while (gender != 'M' || gender != 'F') {
                    System.out.println("Please enter your gender again: ");
                    gender = input.next().charAt(0);
                    if (gender == 'M' || gender == 'F') {
                        break;
                    }
                }

            }
        } else {
            System.out.println("You will join to U18");
        }

        if (weight > 75) {
            System.out.println("You should lose weight to play.");
        } else {
            System.out.println("You can start to play.");
        }

    }
}
