package class25;

public interface WashAble { //Interfaces are abstract by default.

    //It is a good practice to follow the convention of using the same name for the file and the public class or interface defined in that file.

    void wash(); //In interface, all methods are default to abstract and public.
}

class SmartWatch implements WashAble {

    @Override
    public void wash() {
        System.out.println("Smart Watch is IP65 Rated device. So you can wash.");
    }
}

class Phone implements WashAble {

    public void wash() {
        System.out.println("Phone is IP65 Rated device. So you can wash.");
    }

    void turnOn() {
        System.out.println("Press on power button to turn on.");
    }
}

class Inverter implements WashAble{

    public void wash() {
        System.out.println("Inverter is IP65 Rated device. So you can wash.");
    }
}
