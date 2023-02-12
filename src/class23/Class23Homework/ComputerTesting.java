package class23.Class23Homework;

public class ComputerTesting {
    public static void main(String[] args) {

        Computer[] computers = {new Apple(), new HP(), new Lenovo(), new Dell()};

        for (Computer c : computers
        ) {
            c.playVideo(); //Her class için playVideo metodunu çağırıyoruz. Eğer override yoksa Computer class'dan çağırılacak.

            if (c instanceof Apple) { //We are checking if the variable c contains the object of an Apple class
                Apple apple = (Apple) c; //Type casting ile apple class'ından değerimizi elde ettik ve class içerisindeki methodları görmeye başladık.
                //Class cast exception
                apple.installApp();
            }
        }

    }
}
