package class8;

public class ContinueDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue; //continue; komutundan sonraki herhangi bir kod işlenmez ve başa dönerek bir sonraki adıma geçilir.
            } else {
                System.out.println(i);
            }
            System.out.println("Hello");
        }

    }
}
