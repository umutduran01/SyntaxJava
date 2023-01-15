package JavaTopics;

public class Patterns2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { //5 tane satır yazdırsın.
            for (int k = i; k <= 5; k++) { //k'dan başlasın ve 5'e kadar boşluk yazdırsın. Yani ilk sefer 5 tane boşluk olacak.
                System.out.print("  ");
            }
            for (int m = 1; m <= i; m++) { //1'den başlasın ve her seferinde i'ye kadar * yazdırsın. Yani ilk seferse 1 tane yıldız yazdıracak.
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        for (int a = 1; a <= 5; a++) { //5 tane satır yazdırsın.
            for (int c = 1; c <= a; c++) { //İlk önce 1'den a'ya kadar boşluk yazdırsın. Yani ilk seferde 1 tane yazdıracak. Daha sonra ikinci for loop'a geçsin.
                System.out.print("  ");
            }
            for (int b = a; b <= 5; b++) { //a'dan başlasın ve 5'e kadar * yazdırsın. a = 1 olduğu için 1'den 5'e kadar 5 tane yıldız yazdıracak.
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
