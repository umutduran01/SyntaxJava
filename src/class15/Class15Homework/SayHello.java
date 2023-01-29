package class15.Class15Homework;

public class SayHello {

    String sayHelloIn(String country){
        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Germany":
                System.out.println("Hallo");
                break;
            case "Italy":
                System.out.println("Ciao");
                break;
            case "Spain":
                System.out.println("Hola");
                break;
            default:
                System.out.println("Hello");
        }
        return country;
    }

    public static void main(String[] args) {

        //Create a method that will say Hello in different language based on the country that will passed when method is executed

        SayHello newSayHello = new SayHello();
        newSayHello.sayHelloIn("Germany");

    }
}
