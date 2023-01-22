package class12;

public class Str {
    public static void main(String[] args) {

        String a = "ey edip adanada pide ye", b = "";

        for (int i = a.length()-1; i >= 0; i--) {
            b += a.charAt(i);
        }

        if (a.equals(b)){
            System.out.println("true kardeşi");
        }else {
            System.out.println("olmaaaz");
        }

    }
}
