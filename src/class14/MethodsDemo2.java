package class14;

public class MethodsDemo2 {

    void printHello(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    void printHelloManyTimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello");
        }
    }

    void printManyTimes(int time, String word){
        for (int a = 0; a < time; a++) {
            System.out.println(word);
        }
    }

}
