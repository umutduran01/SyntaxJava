package class19;

public class Donkey {

    String name;
    int age;

    void print() {
        System.out.println("Donkey's name is " + name + " and age is " + age);
    }

    /*
    Donkey(){
        System.out.println("This is a non argument constructor.");
    }
    */

    Donkey(String donkeyName, int donkeyAge) {
        name = donkeyName;
        age = donkeyAge;
    }
}
