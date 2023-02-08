package class21;

public class Animal {

    String name;
    String color = "Black";
}

class Cat extends Animal {
    String color = "White";
    int age;
    double weight;

    void printColor() {
        String color = "Blue";
        System.out.println(color); //Blue
        System.out.println(this.color); //White
        System.out.println(super.color); //Black. Super ifadesini burada kullanabiliyoruz çünkü child class içerisinde bir metottayız.
    }

    //Bu metot içerisinde bir local color var ve aynı zamanda class içerisinde de color değeri var. Eğer super ifadesini oradan silersek local değer yazıdırılır.
    //Eğer super'i silip this'i kullanırsak Cat class'ının içerisindeki instance variable yazıdırılacak.
}

class AnimalTester {
    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat.color); //Base class değerini belirtmediğimiz için Cat class içerisindeki değeri gösteriyor bize.

        cat.printColor(); //Child class'ın içerisindeki metot base class'ın içerisindeki color'ı çağırıyor.
    }
}
