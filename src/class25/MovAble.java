package class25;

public interface MovAble { //Able is a convention to name the interfaces.

    void move();
}

interface OwnAble {

    void own();
}

class Car implements MovAble, OwnAble { //Birden fazla inheritence yapamamıza rağmen birden fazla interface kullanabiliriz. Kullandığımız anda metotları tanımlamamız gerekiyor.

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }

    @Override
    public void own() {
        System.out.println("You can own the car.");
    }
}

class Dog implements MovAble, OwnAble {

    @Override
    public void move() {
        System.out.println("Dog is moving.");
    }

    @Override
    public void own() {
        System.out.println("You can own the dog.");
    }
}