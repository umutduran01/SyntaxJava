package class9;

public class ArrayDemo {
    public static void main(String[] args) {

        String name = "Slava";
        String name2 = "Safi";
        String name3 = "Claudia";

        String [] names = {"Slave","Safi","Jason","Nabi","Joseph"}; //Diziler ile bir değişkenin içine birçok ifade yazılabilir.

        System.out.println(names[1]); //Dizilerde ilk eleman 0'dır.
        System.out.println(names[2] + " " + names[4]);

        //System.out.println(names[500]); Dizide olmayan bir eleman yazıdırılamaz.
        //System.out.println(names[-3]); Dizideki indeksler eksi değer alamazlar.

        System.out.println("----------------------");

        for (int i = 0; i <=6; i++) {
            System.out.println(names[i]);
        }
    }
}
