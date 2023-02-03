package class17;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        name = dogName;
        breed = dogBreed;
        color = dogColor;
        age = dogAge;
        weight = dogWeight;
    }

    //Bu yapının adı constructor olarak geçmektedir. Adı class ile aynı olmak zorundadır ve başına hiçbir şey almaz.

    void print(){
        System.out.println("Name " + name + " Breed " + breed + " Age " + age + " color " + color);
    }

}
