package class23;

public class FinalKeyword {

    //99% of the time final keyword is used with static keyword.

    final double gravity = 9.8;
    final double pi = 3.14;
    final int lightSpeed = 299792458;

    //If we add final to the code, no one can change its value.

    void tryChangingGravity() {
        //gravity = 1.6; - We get an error because this variable is defined with final keyword.
    }

    final void hello(){
        System.out.println("Hello");
    }
}

final class Child extends FinalKeyword{
    /*

    @Override
    void hello() {
        System.out.println("Hellooo");
    }

    We get an error because this method was defined with final keyword.

    */
}

    /*

class GrandChild extends Child{

}

    We cannot do inheritence from Child class because the class was defined with final keyword.

    */
