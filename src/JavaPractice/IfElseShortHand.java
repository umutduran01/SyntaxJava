package JavaPractice;

public class IfElseShortHand {
    public static void main(String[] args) {

        int a = 10, b = 15;

        if (a<b) {
            System.out.println("a daha küçüktür");
        }else {
            System.out.println("a daha büyüktür");
        }

            // Bunu yazmak yerine Ternary Operator (Üçlü Operator) ile daha kısa bir şekilde yazabiliriz.

        String result = (a < b) ? "a daha küçük" : "b daha küçük";
        System.out.println(result);

    }
}
