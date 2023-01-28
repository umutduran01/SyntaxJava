package class15;

public class TypeOfVariables {

    String dogName; //It is a Instance Variable. It is in class but in no method or loop,

    static int age = 19; //Static variables are always with the keyword "static".

    void dogBark(){
        String bark = "Hav Hav"; //Local Variable. It can be in a loop, method or if condition etc.
        System.out.println(bark);

        //Whenever we write a code we should use local variables if possible because uses less memory and they are faster.
    }
}
