package JavaTopics;

public class SwichCase {
    public static void main(String[] args) {

        int day = 5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
        }

        //break komutu opsiyoneldir ve eşleşme olduğu zaman programı durdurur. Eğer ifadelerden sonra break komutu yoksa kod okunmaya devam eder.

        // defult kodu eğer herhangi bir eşleşme olmazsa çalışacak kodu belirler.

        int hour = 6;
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Nothing found");
        }

    }
}
