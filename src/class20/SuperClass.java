package class20;

public class SuperClass {
    SuperClass() {
        System.out.println("I am a constructor from the parent class");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        super(); //makes a call to the parent class constructor. Always have to be the first like this().
        System.out.println("I am a child constructor.");
    }
}
