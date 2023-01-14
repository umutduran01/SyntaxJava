package class8;

public class NestedForLoop7 {
    public static void main(String[] args) {

    /*
    0 1 2 3 4 5
    1 2 3 4 5
    2 3 4 5
     */

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k <= 5; k++) {
                if (i == 1 && k == 0 || i == 2 && k ==0 || i == 2 && k ==1){
                    continue;
                }
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println("****************");

        for (int a = 0; a < 3; a++){
            for (int b = a; b <= 5 ; b++) { //b'ye a'nın değeri atandı ve her seferinde a'nın değerinden 5'e kadar işlem yazıdırıldı.
                System.out.print(b + " ");
            }
            System.out.println();
        }


    }
}
