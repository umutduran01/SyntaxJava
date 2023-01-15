package class9;

public class ArrayDemo2 {
    public static void main(String[] args) {

        String name = "Slava";
        String name2 = "Safi";
        String name3 = "Claudia";

        String [] names = {"Slave","Safi","Jason","Nabi","Joseph"};

        System.out.println(names.length); //Dizinin kaç elemanlı olduğunu gösterir.

        for (int i = 0; i <=4; i++) {
            System.out.println(names[i]); //Dizideki tüm elemanları yazdırır.

        }

        System.out.println("--------------------");


        for (int a = 0; a < names.length; a++) { //Dizinin uzunluğunu bilmiyorsak bu şekilde tüm isimleri yazdırabiliriz.
            System.out.println(names[a]);
        }

    }
}
