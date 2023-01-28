package class14;

public class ReturnDemoTester {
    public static void main(String[] args) {

        ReturnDemo rd = new ReturnDemo();
        rd.method1();
        String str = rd.method1();
        System.out.println(str);


        int a = rd.method2();
        System.out.println(a);

    }
}
