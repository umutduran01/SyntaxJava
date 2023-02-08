package class20.Class20Homework;

public class Shape {

    //Shape class has a constructor that takes the radius and has a subclass as  circle class. In circle class create a method to calculate the area of circle. Test your code

    double radius;

    Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {

    Circle(double radius){
        super(radius);
    }

    void area(){
        System.out.println(radius*radius);
    }

}

class ShapeTesting{
    public static void main(String[] args) {
        Circle newTest = new Circle(4);
        newTest.area();
    }
}
