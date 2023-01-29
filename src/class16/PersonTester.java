package class16;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {

        Person newPerson = new Person();
        //System.out.println(newPerson.bankBalance); - It has a private access.
        System.out.println(newPerson.name);
        System.out.println(newPerson.address);
        //newPerson.printPhonePass; - Private access.
        newPerson.printTikTokAccount();
        newPerson.printSNN();

        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
}
