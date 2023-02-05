package class19;

public class ThisKeyword {
    int a, b;

    ThisKeyword(int a, int b) { //this is a constructor.
        this.a = a;
        this.b = b;
    }

    public void sum(int a, int b) { //this is a method.
        System.out.println(a + b); //sum of local variables
        System.out.println(this.a + this.b); //sum of instance variables
    }

    void hello() {
        System.out.println("Hello everyone !");
    }

    void greetings() {
        hello(); //Burada hello'nun başına compiler this ekliyor ama biz görmüyoruz.
    }

    //Static olmayan methodlar instance method olarak adlandırılır.

    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(10, 20);

        System.out.println(obj.a); //output is 10
        System.out.println(obj.b); //output is 20

        //This keyword can only be used when local and instance variables are the same.

        obj.sum(100, 200); //output is 300
    }
}
