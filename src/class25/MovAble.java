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
    public void own(){
        System.out.println("You can own it.");
    }
}

class Dog implements MovAble {

    @Override
    public void move() {
        System.out.println("Dog is moving.");
    }
}