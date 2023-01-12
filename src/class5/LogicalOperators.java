package class5;

public class LogicalOperators {
    public static void main(String[] args) {

        /*
        ! = not
        || = or
        && = and
         */

        System.out.println(!true); //Output is false.
        System.out.println(!false); //Output is true.
        boolean rich = true;
        System.out.println(!rich); //Output is false.

        System.out.println(true||true); //Output is true.
        System.out.println(true||false); //Output is true.
        System.out.println(false||false); //Output is false.

        //Eğer bir tane bile true ifadesi varsa sonuç true olacaktır. Her ikisinin de false olması durumunda sonuç false olur.

        //EXAMPLE 1

        boolean choco = true, flower = true;
        if (choco || flower){
            System.out.println("I am happy.");
        }else {
            System.out.println("I am not happy.");
        }

        //EXAMPLE 2

        boolean wifi = true, five5 = true;
        if (wifi || five5){
            System.out.println("You can connect to the internet.");
        }else {
            System.out.println("Connect the internet first.");
        }

        //EXAMPLE 3

        double mathScore = 92.5, historyScore = 91.5, scienceScore = 93.5;

        /*
        if (mathScore > 90){
            if (historyScore > 90){
                if (scienceScore > 90){
                    System.out.println("You have passed.");
                }
            }
        }
        */

        if (mathScore > 90 && historyScore > 90 && scienceScore > 90){
            System.out.println("You have passed.");
        }else {
            System.out.println("You need to work harder.");
        }

        System.out.println(true && true); //Output is true.
        System.out.println(true && false); //Output is false.
        System.out.println(false && false); //Output is false.

        //AND (&&) kodunda sadece her iki ifade de true olduğu zaman çıktı true olur.


    }
}
