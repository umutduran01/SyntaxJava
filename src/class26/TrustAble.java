package class26;

public interface TrustAble {

    int age = 1; //All variables in interfaces are public, static and final by default.

    int trust();

    static void method1(){
        System.out.println("Hello from TrustAble method"); //By defining the method as static, we can write a body in interfaces.
    }

    default void method2(){

    }

    private void method3(){

    }


}

class Bank implements TrustAble{

    @Override
    public int trust() { //We defined the method here.
        return 1;
    }

    public static void main(String[] args) {

        TrustAble.method1();
        System.out.println(TrustAble.age);

        //We cannot create an object of an interface.

    }
}
