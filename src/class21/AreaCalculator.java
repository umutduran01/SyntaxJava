package class21;

public class AreaCalculator {

    void calculateArea(double length, double width) {
        System.out.println("Area of rectangle is " + (length * width));
    }

    void calculateArea(double side) {
        System.out.println("Area of square is " + (side * side));
    }
}

class AreaCalculatorTesting {
    public static void main(String[] args) {

        AreaCalculator newTest = new AreaCalculator();
        newTest.calculateArea(3, 2);
        newTest.calculateArea(4);
    }
}
