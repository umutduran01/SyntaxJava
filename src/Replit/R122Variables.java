package Replit;

public class R122Variables {
    /*
    Declare 3 instance variables to hold:

    - name of the country
    - capital
    - population size

    Create a method to display values of instance variables

    Create 2 Object, assign values to instance variables, execute method display;

    **Expected Output:**

    The capital of USA is Washington DC and population is 330000000
    The capital of Kazakhstan is Astana and population is 18500000
    */

    String name;
    String capital;
    int population;

    void result() {
        System.out.println("The capital of " + name + " is " + capital + " and population is " + population);
    }

    public static void main(String[] args) {
        R122Variables newTest1 = new R122Variables();
        newTest1.name = "USA";
        newTest1.capital = "Washington DC";
        newTest1.population = 330000000;

        newTest1.result();

        R122Variables newTest2 = new R122Variables();
        newTest1.name = "Kazakhstan";
        newTest1.capital = "Astana";
        newTest1.population = 18500000;

        newTest1.result();
    }
}
