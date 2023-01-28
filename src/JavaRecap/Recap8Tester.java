package JavaRecap;

public class Recap8Tester {
    public static void main(String[] args) {

        Recap8 car1 = new Recap8();
        car1.make = "Steel";
        car1.brand = "BMW";
        car1.age = 4;
        car1.plate();

        int marketPrice = car1.price(2, 200);
        System.out.println(marketPrice + "€");
    }
}
