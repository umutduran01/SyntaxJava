package Replit;

import java.util.ArrayList;

public class R184List {
    /*
    Create an array list that will hold Integer Objects:

    Add below elements to it.

    111

    222

    333

    444

    555

    666

    Print first, third and fifth element from your array

    **Expected Output:**

    111
    333
    555

    */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(444);
        arrayList.add(555);
        arrayList.add(666);

        for (int i = 0; i < arrayList.size(); i+=2) {
            System.out.println(arrayList.get(i));
        }
    }
}
