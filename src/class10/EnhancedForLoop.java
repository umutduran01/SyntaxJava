package class10;

public class EnhancedForLoop {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        for (int number:arr){ //Number yerine istediğimizi yazabiliriz.
            System.out.println(number); //Daha sonra bu değişkeni yazdırıyoruz.
        }

        for (int sayilar: arr){
            if (sayilar >= 30){
                System.out.println("Hello");
            }
        }

    }
}
