package class28.Class28Homework;

public class Card {

        /*
        Create a Card class that will have interest rate field and card type and a constructor that will initialize the fields.
        Create 3 objects of different card and store them into LinkedList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
        */

    int interestRate;
    String cardType;

    Card(int interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    void interestRateCard(){
        System.out.println(interestRate);
    }
}


