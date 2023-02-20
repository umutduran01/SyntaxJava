package class28;

import java.util.ArrayList;

public class ArrayListVSLinkedList2 {
    public static void main(String[] args) {


        long startTime2 = System.currentTimeMillis(); //Time starts here.

        ArrayList<String> numbers2 = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            numbers2.add(0, "Test Data");
        }

        long endTime2 = System.currentTimeMillis(); //Time end here.

        System.out.println(endTime2 - startTime2); //Result is in milliseconds.

        //result is 40954

    }
}
