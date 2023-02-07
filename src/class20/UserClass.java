package class20;

public class UserClass {

    /*
    Write program: userClass that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
    */

    String name;
    int phoneNumber;

    UserClass(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}

class SubInfo extends UserClass {

    String address;

    SubInfo(String name, int phoneNumber, String address) {
        super(name, phoneNumber);
        this.address = address;
    }

    void userDetails(){
        System.out.println("Name is " + name + ", phone number is " + phoneNumber + " and address is " + address);
    }

}

class Main{
    public static void main(String[] args) {

        SubInfo newUser = new SubInfo("umut",123456789,"lisbon portugal");
        newUser.userDetails();

    }
}
