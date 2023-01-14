package class8;

public class NestedForLoop3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {
                if (j == 1 || j == 2) {
                    continue; //Eğer j 1 ya da 2'ye eşitse o yıldızları yazdırma.
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
