package class17;

public class Student {

    int id;
    String name;
    int age;
    double weight;

    Student(int sId, String sName, int sAge, double sWeight){
        id = sId;
        name = sName;
        age = sAge;
        weight = sWeight;
    }

    //Aynı sıra ile 3 girdili farklı bir constructor daha oluşturabiliriz ama hata verebilir. Bunun için değişkenlerin yerini değiştirebiliriz.

    //We can use all access modifiers with constructor but not static.

    void printInfo(){
        System.out.println(id + " - " + name + " - " + age + " - " + weight);
    }
}
