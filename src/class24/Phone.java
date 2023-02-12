package class24;

public abstract class Phone {
    /*
    Create a phone class and create abstract methods like displayPictures, unlockPhone, SendText.
    Create Iphone, Samsung, Google child classes and provide specific implementations.
    Write code to achieve runtime polymorphism.
    */

    abstract void displayPictures();

    abstract void unlockPhone(int pin);

    abstract void SendText(String message);
}

class Iphone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Iphone is displaying pictures from Google.");
    }

    @Override
    void unlockPhone(int pin) {
        System.out.println("Iphone unlocked with PIN " + pin);
    }

    @Override
    void SendText(String message) {
        System.out.println(message + " message has been sent.");
    }
}

class Samsung extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Samsung is displaying pictures from the Gallery file.");
    }

    @Override
    void unlockPhone(int pin) {
        System.out.println("Samsung has been unlocked with PIN " + pin);
    }

    @Override
    void SendText(String message) {
        System.out.println(message + " message has been sent.");
    }
}

class Google extends Phone {

    @Override
    void displayPictures() {
        System.out.println("Google is displaying pictures from the Camera.");
    }

    @Override
    void unlockPhone(int pin) {
        System.out.println("Google has been unlocked with PIN " + pin);
    }

    @Override
    void SendText(String message) {
        System.out.println(message + " message has been sent.");
    }
}
