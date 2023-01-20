package class11;

public class CatTester {
    public static void main(String[] args) {

        //creating an object from Cat class
        Cat cat1 = new Cat();
        cat1.name="mia";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.color="Grey";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2 = new Cat();
        cat2.name="loki";
        cat2.breed="Domestic";
        cat2.age=3;
        cat2.color="White";
        cat2.speak();

        System.out.println(cat2.age);

    }
}
