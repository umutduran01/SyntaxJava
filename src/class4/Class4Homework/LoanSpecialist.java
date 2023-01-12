package class4.Class4Homework;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of the loan: ");
        int loanAmount = input.nextInt();

        if (loanAmount <= 200000) {
            System.out.println("Loan approved.");
        }else {
            System.out.println("Loan rejected.");
        }

    }
}
