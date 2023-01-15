package class8.Class8Homework;

public class OneToFifty {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
