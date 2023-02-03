package class17.Class17Homework;

public class AccessLevel {

    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
     */

    String name;
    int age;
    int number;


    AccessLevel(String dName, int dInt) {
        name = dName;
        age = dInt;
    }

    public AccessLevel(String puName, int puInt, int puNum) {
        name = puName;
        age = puInt;
        number = puNum;
    }

    private AccessLevel(String piName) {
        name = piName;
    }

    protected AccessLevel(int proAge) {
        age = proAge;
    }

    public static void main(String[] args) {

        AccessLevel newMethod = new AccessLevel("umut"); //private

    }
}
