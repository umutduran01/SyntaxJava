package class15;

public class SyntaxMethod {

    //Create a method that does not take any parameters and returns a String "Syntax" name of the method should be printSchool

    String printSchool(){
        return "Syntax";
    }

    public static void main(String[] args) {

        SyntaxMethod newObject = new SyntaxMethod();
        String a = newObject.printSchool();
        System.out.println(a);
    }
}
