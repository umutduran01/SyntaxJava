package class27;

public class Demo1 {
    public static void main(String[] args) {

        String name = "Zafar";
        String name2 = "Aiperi";
        String name3 = "Sarah";

        String[] names = {"Hiral", "Nima", "Laura", "Nat"};

        displayNames(names);
        System.out.println("---------");
        displayNames2(name,name2,name3);
    }

    public static void displayNames(String[] names) {
        for (String results : names) {
            System.out.println(results);
        }
    }

    public static void displayNames2(String name, String name2, String name3) {
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }

}
