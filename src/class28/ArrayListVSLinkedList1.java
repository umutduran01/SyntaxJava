package class28;

import java.util.LinkedList;

public class ArrayListVSLinkedList1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis(); //Time starts here.

        LinkedList<String> numbers = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            numbers.add(0, "Test Data");
        }

        long endTime = System.currentTimeMillis(); //Time end here.

        System.out.println(endTime - startTime); //Result is in milliseconds.

        //result is 165
    }
}
