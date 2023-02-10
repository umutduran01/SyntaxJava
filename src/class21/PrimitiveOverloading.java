package class21;

public class PrimitiveOverloading {
    /*
    Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
    */

    private int years(int year1) {
        return year1;
    }

    private int years(int year1, int year2) {
        return (year1 + year2) / 2;
    }

    private int years(int year1, int year2, int year3) {
        return (year1 + year2 + year3) / 3;
    }

    public static void main(String[] args) {

        PrimitiveOverloading newTest = new PrimitiveOverloading();
        int result1 = newTest.years(2011);
        System.out.println(result1);

        int result2 = newTest.years(2011,2019);
        System.out.println(result2);

        int result3 = newTest.years(2016,2019,2025);
        System.out.println(result3);

    }
}
