package JavaPractice;

public class ElseIf {
    public static void main(String[] args) {

        int time = 15;

        if (time < 12) {
            System.out.println("Good morning !");
            } else if (time < 18 && time > 12) {
            System.out.println("İyi günler !");
        }else {
            System.out.println("İyi akşamlar !");
        }

    }
}
