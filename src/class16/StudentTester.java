package class16;

public class StudentTester {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Ali";
        student1.id = "123";
        student1.age = 23;
        student1.weight = 70;
        student1.schoolName = "Syntax";

        Student student2 = new Student();
        student2.name = "Mehmet";
        student2.id = "456";
        student2.age = 43;
        student2.weight = 20;
        //student2.schoolName = "Syntax";

        Student student3 = new Student();
        student3.name = "Ayşe";
        student3.id = "678";
        student3.age = 15;
        student3.weight = 90;
        //student3.schoolName = "Syntax";

        //schoolName değeri hep aynı olduğu için bunu static olarak tanımlayabiliriz ve hafızadan kazanç sağlarız.
        //Birçok obje oluştursak bile hafıza bir birimlik yer kaplar.

        System.out.println(student3.schoolName);

        //Bir objede static değeri tanımladığımızda bütün hepsine uygulanır.

        System.out.println(Student.schoolName);

        //Sadece static değerlerde class adı ve değer ile erişim sağlayabiliriz.

    }
}
