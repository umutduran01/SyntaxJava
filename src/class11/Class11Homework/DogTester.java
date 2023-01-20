package class11.Class11Homework;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Linda";
        dog1.breed = "Husky";
        dog1.nice = true;

        Dog dog2 = new Dog();
        dog2.name = "Jack";
        dog2.breed = "Bulldog";
        dog2.weight = 14;
        dog2.height = 65;
        dog2.eats();

        Dog dog3 = new Dog();
        dog3.name = "George";
        dog3.breed = "Ladrador";

    }
}
