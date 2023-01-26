package class13.Class13Homework;

public class Sentences {
    public static void main(String[] args) {

        /*
        You have a String a= ""Is it saturday? Is it raining? Do we have a Java Class today?";
        How would you find out how many sentences are in that String?
        */

        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";

        String [] aArray = a.split("[.?!]");
        System.out.println("There are " + aArray.length + " sentences.");

    }
}
