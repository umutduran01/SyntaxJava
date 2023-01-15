package class9;

public class ArrayDemo5 {
    public static void main(String[] args) {

        //Create an array yo store the letters A B c d e F

        char [] letters = {'A', 'B', 'c', 'd', 'e', 'F'};

        letters[0] = 'h'; //0 indexli elemanı güncelledik.

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

    }
}
