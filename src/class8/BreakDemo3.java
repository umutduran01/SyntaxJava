package class8;

public class BreakDemo3 {
    public static void main(String[] args) {

        boolean summer = true;
        int temp = 75;

        while (summer){
            if (temp <= 100){
                System.out.println("I love summer because temp is " + temp);
            }else {
                System.out.println("It is very hot " + temp);
                summer = false;
            }
            temp = temp +5;
        }


    }
}
