package class19;

public class BankAccount { //Parent Class or Super Class or Base Class
    long accountNumber;
    double money;

    void deposit() {
        System.out.println("Deposit from Bank Account class");
    }
}

class Checking extends BankAccount { //Child Class or Subclass or Derived Class

    double interest;

    void transfer() {
        System.out.println("Transfer from Checking class");
    }
}

class Savings extends BankAccount {

    double profit;

    void takeProfit() {
        System.out.println("Profit method from Savings class");
    }

}

class SuperSavings extends Savings {

    void superSavings() {
        System.out.println("Super Savings method from SuperSavings class");
    }

}
