package class9;

public class ArrayDemo3 {
    public static void main(String[] args) {


        //10 20 30 45 50

        int [] numbers = {10, 20, 30, 45, 50}; //Integer depoladık.

        System.out.println(numbers.length); //Dizinin uzunluğu.

        int sumArray = 0;

        for (int i = 0; i < numbers.length; i++) { //Kaç elemanlı olduğunu bilmediğimiz için bu formülü kullandık.
            //System.out.println(numbers[i]);
            sumArray += numbers[i]; //Dizideki tüm elemanların toplamı.
        }

        System.out.println(sumArray);
    }
}
