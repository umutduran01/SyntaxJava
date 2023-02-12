package class23.Class23Homework;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
    */

    int RAM;
    int storage;
    String operatingSystem;

    void playVideo() {
        System.out.println("Video is playing.");
    }

    void browserInternet() {
        System.out.println("Browsing the internet.");
    }
}

class Apple extends Computer {

    @Override
    void playVideo() {
        System.out.println("Playing the video on QuickTime player.");
    }

    @Override
    void browserInternet() {
        System.out.println("Browsing the internet on Safari.");
    }

    void editVideos() {
        System.out.println("Editing on iMovies.");
    }

    void installApp() {
        System.out.println("Installing apps from App Store");
    }
}

class Lenovo extends Computer {

}

class HP extends Computer {

    @Override
    void browserInternet() {
        System.out.println("Browsing the internet on Chrome.");
    }

    @Override
    void playVideo() {
        System.out.println("Playing video on Media Player");
    }

    void installApp(){
        System.out.println("You can download any app.");
    }
}

class Dell extends Computer {

}



