package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter age: ");
        int age = input.nextInt();
        System.out.println(age);

        System.out.print("Please enter your weight: ");
        double weight = input.nextDouble();
        System.out.println(weight);

        System.out.print("Are you hungry ?: ");
        boolean hungry = input.nextBoolean();
        System.out.println(hungry);

        System.out.print("Please enter your gender: ");
        char gender = input.next().charAt(0);
        System.out.println(gender);

        System.out.println("What is your name ?: ");
        String name = input.next();
        //.next(); kullanıldığı zaman .nextLine(); kodunun aksine sadece ilk kelimeyi alır ve boşluktan sonraki yazıları almaz.
        System.out.println(name);

        input.nextLine();
        //.next(); kodunun ardından .nextLine(); kullanıldığı zaman herhangi bir işlem yapmaya izin vermeden ekrana yazıdılacaktır. Bunun için fazladan bir .nextLine(); kullanılır.
        System.out.println("Please enter your full name: ");
        String fullName = input.nextLine();
        System.out.println(fullName);

        input.close();
        //Daha fazla scanner almamak için bu kapatma kodu kullanılır.


    }
}
