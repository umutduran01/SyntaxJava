package class12;

public class StringDemo3 {
    public static void main(String[] args) {

        String firstName = "Umut";
        String lastNAme = "Duran";
        String fullName = firstName + " " + lastNAme;

        System.out.println(firstName + " " + lastNAme); //Bu daha yaygın bir kullanım.
        System.out.println(fullName);
        System.out.println(firstName.concat(" " + lastNAme)); //İki stringi birleştirmek içn kullanılır.
    }
}
