package class22;

//Method Overriding

public class Animal {
    String name;
    String color;
    int age;
    double weight;

    void speak() {
        System.out.println("Animals can speak");
    }

    void eat() {
        System.out.println("All the animals eat");
    }
}

class Cat extends Animal {
    @Override //We are overriding speak method.
    void speak() {
        super.speak(); //Bu parent class'tan method çağırır.
        System.out.println("Meow meow..."); //Buraya aynı metodu tanımladığımız için ne zaman cat.speak'ı yazdırsak bu ifadeyi göreceğiz. Eğer bu ifade olmasaydı sonucu parant class'tan alırdık.
    }
}

class Dog extends Animal {

}

class Tester {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Mia";
        cat.speak(); //When we inherit from Animal class we see that we only print animals general behaviour. - Output is Animals can speak

        Dog dog = new Dog();
        dog.age = 4;
        dog.eat(); //The same issue here. That's why we may want to define cats' or dogs' specific behaviours in their own classes.
    }
}
