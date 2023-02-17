package class26;

public class Account {

    private double balance;
    private String accountNumber;
    private String type;
    private String accountTitle;

    //------------------------------------------------------------------------------------------------------------------


    public void setBalance(double balance) {
        //Sanitizing the input meaning checking the values before we can assign them.
        if (balance < 0) {
            System.out.println("Negative balance is not allowed in the current account.");
        } else {
            this.balance += balance; //private double balance is the same value + the value we insert.
        }
    }

    public double getBalance() {
        return balance; //This method will return the balance value.
    }

    //------------------------------------------------------------------------------------------------------------------

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() != 9) {
            System.out.println("Wrong account number."); //Sanitizing the input.
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    //------------------------------------------------------------------------------------------------------------------


    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }
}

class AccountTester {
    public static void main(String[] args) {

        Account account = new Account(-1000, "12353252341abc", "fadfgdfg", "fsdgdfhsghs");

        //The first idea of encapsulation is the idea of not writing all codes in main method. Organize your methods in classes.
        //The second idea of encapsulation is hide your variables from unnecessary methods. So it is better to make our variables private.

        //so...

        //account.balance=-566;

        //this is not in us anymore.

        account.setBalance(-1235); //Negative balance is not allowed in the current account.
        System.out.println(account.getBalance()); //-1000

        account.setAccountNumber("ABC123XYZ");
        System.out.println(account.getAccountNumber());

    }
}


