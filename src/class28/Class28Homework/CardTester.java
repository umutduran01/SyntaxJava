package class28.Class28Homework;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {

        Card newCard1 = new Card(20,"Visa");
        Card newCard2 = new Card(12,"MasterCard");
        Card newCard3 = new Card(18,"American Express");

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(newCard1);
        cards.add(newCard2);
        cards.add(newCard3);

        for (Card card : cards){
            card.interestRateCard();
        }

    }
}
