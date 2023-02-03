package Replit;

public class R120Variables {
    /*
    Declare 3 instance variables to hold:

    year, school name and batch #

    Access variables from the main method and assign specific values to them

    Print values of your variables in the following format:

    **Expected Output:**

    I am a student of batch 9 studying at Syntax in the year of 2021
     */

    int year;
    String schoolName;
    int batch;

    public static void main(String[] args) {

        R120Variables newTest = new R120Variables();

        int a = newTest.year = 2021;
        String b = newTest.schoolName = "Syntax";
        int c = newTest.batch = 9;

        System.out.println("I am a student of batch " + c + " studying at " + b + " in the year of " + a);

    }
}
