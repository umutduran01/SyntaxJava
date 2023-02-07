package class20;

public class Sport {
    String name;
    String country;

    Sport(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void display() {
        System.out.println(name + " is played in " + country);
    }
}

class Cricket extends Sport {

    String helmet;

    Cricket(String name, String country, String helmet) {
        super(name, country); //makes a call to the immediate super class constructor. Always must be the first line.
        this.helmet = helmet;
    }

}

class Soccer extends Sport {

    int goal;

    Soccer(String name, String country, int goal) {
        super(name, country);
        this.goal = goal;
    }

    void soccerResult(){
        System.out.println(name + " played in " + country + " and scored " + goal + " goals.");
    }

}