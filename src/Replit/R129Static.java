package Replit;

public class R129Static {
    /*
    Declare two static variables to hold

    - country name
    - continent

    Create a method to display the value of static variables in the following format:

    ____ located on \_\_\_\_ continent

    In the main method assign values to a static variable and execute method display

    **Expected Output:**

    Morocco located on Africa continent
    */

    static String countryNAme, continent;

    void info(String countryNAme,String continent){
        System.out.println(countryNAme + " located on " + continent + " continent");
    }

    public static void main(String[] args) {
        R129Static test = new R129Static();
        test.info("Turkey","Asia");
    }
}
