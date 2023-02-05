package class19.Class19Homework;

//Write program to inherit class A that has method printF which is static and call or reuse that method into class B

public class StaticA {

    static void printF() {
        System.out.println("Hello Homework !");
    }
}

class StaticB extends StaticA {

    void result() {
        printF();
    }

}