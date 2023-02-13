package JavaRecap;

public class Recap12 {
    public static void main(String[] args) {

        ChildClass newTest = new ChildClass("Umut");

    }
}

class ParentClass {


    ParentClass() {
        System.out.println("Hello !");
    }

    ParentClass(String name) {
        System.out.println("Helloo " + name);
    }

}

class ChildClass extends ParentClass {

    ChildClass(String name) {
        super(name);
        System.out.println("Ola");
    }
}
