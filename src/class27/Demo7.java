package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daria")); //We check if the Array List contains the name. - false

        names.remove("Savo"); //In array we cannot remove a member. We can only replace it but in Array List we can remove element. When we remove an element, the indexes will be shifted to left.
        System.out.println(names);

        names.set(0,"Umut"); //We replaced an element to index 0.
        System.out.println(names);

        System.out.println(names.indexOf("Urwa")); //Finding index of an element.

    }
}
