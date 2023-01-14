package class8;

public class NestedForLoop2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { //outer for loop

            for (int j = 0; j < 5; j++) {//inner for loop
                System.out.println("i = " + i + " and j = " + j);
            }
            System.out.println("*****************");
        }
    }
}
