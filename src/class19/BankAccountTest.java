package class19;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.accountNumber = 7543563445234657l;
        ba.money = 1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("-----Creating an object from Checking class----");

        Checking check = new Checking();
        check.accountNumber = 1233; //instance variable from parent class
        check.money = 780; //from parent class
        check.interest = 0; //from subclass

        check.deposit(); //from parent class
        check.transfer(); //from subclass

        //methods defined in child class are not available for parent class.

        System.out.println("-----Creating an object from Savings class----");

        Savings savings = new Savings();
        savings.profit = 1234523; //from Savings class
        savings.takeProfit(); //from Savings class
        savings.accountNumber = 234578324; //from parent class
        savings.money = 1234; //from parent class

        //savings.interest; will not work because subclasses cannot see each other.

        System.out.println("-----Creating an object from SuperSavings class----");

        SuperSavings newSuperSavings = new SuperSavings();
        newSuperSavings.superSavings(); //from grandchild class
        newSuperSavings.profit = 1235; //from parent class
        newSuperSavings.accountNumber = 54672; //from the base class
    }
}
