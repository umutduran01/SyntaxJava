package Replit;

public class R145This {
    /*
    Complete the Dog.java class:

    Create following class variables.

    dogName

    dogWeight

    static dogBreed=Mutt;

    For all methods and variables use proper naming convention.

    Create constructor to initialize instance variables

    2. In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.

    **Expected Output:**

    Tarzan Mutt 50.0
    Lucy Mutt 10.0
    */
    public static void main(String[] args) {

        Dog newTest1 = new Dog("Tarzan",50);
        Dog newTest2 = new Dog("Lucy",10);

        System.out.println(newTest1.dogName + " " + Dog.dogBreed + " " + newTest1.dogWeight);
        System.out.println(newTest2.dogName + " " + Dog.dogBreed + " " + newTest2.dogWeight);

    }
}

class Dog {

    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";

    Dog(String dogName,double dogWeight){
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

}
