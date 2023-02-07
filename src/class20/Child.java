package class20;

public class Child extends Parent {

    //Burada herhangi bir değer tanımlamadık çünkü inheritance yaptığımız class'tan alacağız.

    public static void main(String[] args) {

        Child c1 = new Child();
        c1.hello();
        c1.bye(); //static değerlere bu şekilde de ulaşabiliriz ama class adı ile ulaşmak daha iyidir.
        Parent.bye();
        Child.bye(); //static değere bu class değeri üzrinden de ulaşabiliriz çünkü inheritance yaptık.
        //c1.money(); not accessible because it is private.

        c1.name = "Umut";
        Child.lastName = "Duran"; //static değer olduğu için class adı üzerinden ulaştık.
    }
}
