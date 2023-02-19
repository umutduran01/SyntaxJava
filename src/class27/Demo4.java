package class27;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>(); //In diamond operator we can only write class names. String is a class so we cannot write primitive values.

        //To use primitive data types we can use replicas. These replica classes are;

        //Backward compatibility ?

        ArrayList<Byte> numbers2 = new ArrayList<>();
        ArrayList<Short> numbers3 = new ArrayList<>();
        ArrayList<Integer> numbers4 = new ArrayList<>();
        ArrayList<Long> numbers5 = new ArrayList<>();
        ArrayList<Float> numbers6 = new ArrayList<>();
        ArrayList<Double> numbers7 = new ArrayList<>();
        ArrayList<Character> numbers8 = new ArrayList<>();
        ArrayList<Boolean> numbers9 = new ArrayList<>();

        //Adding elements to the Integer ArrayList;

        numbers4.add(4);
        numbers4.add(1);
        numbers4.add(99);
        numbers4.add(643);
        numbers4.add(2);
        System.out.println(numbers4);
    }
}
