package JavaRecap;

public class Recap9 {   //This is a class. It is public so all classes can create an object from this class.

    String name;    //This is an instance variable. Also called as attributes, properties or fields.

    void objectName() { //This is a method. Also called as behaviours or functions. This method doesn't return any value.
        System.out.println("New object is created.");
    }

    String toUpperCaseMethod(String name) {    //This is a method and returns a String.
        this.name = name;   //By using this., we assigned instance variable to the variable we created in the method.
        return name.toUpperCase();
    }

    public static void main(String[] args) {    //To execute the programme, we start the main method here.

        Recap9 newObj = new Recap9();   //This is an object.

        newObj.objectName();    //Since the method doesn't return any variable, it will directly print what is inside.
        String result = newObj.toUpperCaseMethod("hello");    //We assigned the output of the method to the String variable and we print it.
        System.out.println(result);
    }
}
