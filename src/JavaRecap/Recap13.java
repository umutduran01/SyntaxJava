package JavaRecap;

public class Recap13 {

    String methodName;
    int a;
    int b;
    int c;

    void sum() {
        System.out.println(a + b);
    }

    Recap13(int a){
        System.out.println("This constructor has only int a");
    }

    Recap13(int a, int b){
        this(a); //Constructor içerisinde başka constructor çağırdık.
        this.sum(); //Constructor içerisinde method çağırdır.
    }


}

class Recap13Tester {
    public static void main(String[] args) {
        Recap13 newTest1 = new Recap13(3,5);
    }
}
