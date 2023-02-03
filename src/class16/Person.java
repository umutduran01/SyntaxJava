package class16;

public class Person {
    private double bankBalance = 125; //Private instance variable. It only belongs to Person class.
    String address = "Street 123"; //Default access level is applied.
    public String name = "Jon Snow"; //Accessible from everywhere.

    private void printPhonePass() { //It is private because it is a private info.
        System.out.println("phone123");
    }

    void printSNN() { //Some people can know that becasuse it is not that important.
        System.out.println("123345567");
    }

    public void printTikTokAccount() { //Everyone can know about this.
        System.out.println("user123");
    }

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.name);
        System.out.println(person.address);
        person.printPhonePass();
        person.printSNN();
        person.printTikTokAccount();

    }
}
