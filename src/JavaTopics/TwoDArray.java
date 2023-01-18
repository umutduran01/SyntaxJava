package JavaTopics;

public class TwoDArray {
    public static void main(String[] args) {

        //Creating New 2D Arrays Example 1

        int[][] numbers = {{1,2,3},{4,5,6}};

        System.out.println(numbers[0][2]); //Sıfırıncı satırda ikinci elemanı yazdır.

        //Creating New 2D Arrays Example 2

        int [][] years = new int[3][3];
        //Sıfırıncı satır
        years[0][0] = 2002;
        years[0][1] = 2003;
        years[0][2] = 2004;

        //Birinci satır
        years[1][0] = 2005;
        years[1][1] = 2006;
        years[1][2] = 2007;

        //İkinci satır
        years[2][0] = 2008;
        years[2][1] = 2009;
        years[2][2] = 2010;

        System.out.println(years[2][1]); //İkinci satırda birinci elemanı yazdır.
    }
}
