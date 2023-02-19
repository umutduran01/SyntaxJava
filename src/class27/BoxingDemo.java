package class27;

public class BoxingDemo {
    public static void main(String[] args) {

        int number = 15; //This is a primitive data type but in printData method we use wrapping classes.
        printData(number); //Java converts our primitive data type to wrapping class objects. It is called auto-boxing.

        Integer f = 10; //Auto-boxing
        int number2 = f;

    }

    public static void printData(Integer number) {
        System.out.println(number);
    }
}
