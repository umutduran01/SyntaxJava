package class24;

public class FinalDemo { //If we use final keyword here, FinalMethodOverride class could not inherit this class.
    public static void main(String[] args) {

        final int num; //We created a constant variable.
        num = 20;
        //num = 30; - Not possible because the variable is declared final.


    }

    final void noOneShouldOverrideIt() {
        System.out.println("This method should never be overridden otherwise it might break the code base.");
    }

}

class FinalMethodOverride extends FinalDemo{

    /*
    @Override
    void noOneShouldOverrideIt() {
        System.out.println("This method should never be overridden otherwise it might break the code base.");
    }

    This will not work because in FinalDemo class, this method was declared as final.
    */

}


