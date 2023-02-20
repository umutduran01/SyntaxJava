package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {

        Integer a = new Integer(10);
        int number = a; //it is auto-unboxing.
        int number2 = a.intValue(); //unboxing.

        double d = 12.3;
        Double wrapperD = new Double(d); //boxing.
        Double wrapperP = d; //auto-boxing

        Float f = 12f;
        ArrayList<Float> arrayList = new ArrayList<>();
        arrayList.add(12.2f);
    }
}
