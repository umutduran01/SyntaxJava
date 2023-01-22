package class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str = "Java is love";
        char c = str.charAt(2);
        System.out.println(c); //v

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            System.out.print(" ");
        }


        System.out.println("-----------------");

        int sum = 0;
        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) == 'a'){
                sum++;
            }
        }
        System.out.println(sum);

    }
}
