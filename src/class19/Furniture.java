package class19;

import class12.Str;

public class Furniture {

    String type;
    double price;
    String color;

    Furniture(String type, double price, String color) {
        this.type = type; //Local ve instance değerleri birbirinden ayırmak için this. ifadesini kullanıyoruz.
        this.price = price;
        this.color = color;
    }

    /*
    void Furniture(){

    }

    void eklediğimiz anda constructor olmaktan çıkıp method olur.
    */

    void print() {
        System.out.println(type + ", " + price + " and " + color);
    }
}
