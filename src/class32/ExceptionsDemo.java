package class32;

import class32.utils.ExcelReader;

public class ExceptionsDemo {
    public static void main(String[] args) {

        System.out.println("line1");
        System.out.println("line2");
        System.out.println("line3");
        System.out.println("line4");
        try {
            System.out.println(10 / 0); //try this code and if it doesn't work
        } catch (Exception ex) {
            System.out.println(ex); //execute this one.
        }

        System.out.println("line5");
        System.out.println("line6");
    }

    public static void test() {
        try {
            ExcelReader.read(); //try this
        } catch (Exception e) { // try this
            try {
                System.out.println(e); //if that also doesn't work try this.
            } catch (Exception f) {
                System.out.println(f); //if nothing works, catch this
            }
        }

        //ExcelReader.read();
    }
}
