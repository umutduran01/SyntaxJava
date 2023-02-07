package class20;

public class BaseClass {

    String name = "John";

    void hello() {
        System.out.println("Hello method from BaseClass");
    }
}

class ChildClass extends BaseClass {

    String name = "Jane";

    void callMe() {
        System.out.println(this.name);
        System.out.println(super.name); //BaseClass içerisindeki name'i çağırmak için super anahtarını kullanırız.
    }

    void hello(){
        System.out.println("Hello method from ChildClass");
    }


    void callingParentMethod() {
       super.hello(); //Burada BaseClass içerisindeki methodu çağırıyoruz.
    }
}

class TestingSuperKeyword {
    public static void main(String[] args) {

        ChildClass newChild1 = new ChildClass();

        newChild1.callMe();
        newChild1.hello();
        newChild1.callingParentMethod(); //Bunda super keyword'ü olduğu için Super Class içerisindeki methodu çağıracaktır.
    }
}
