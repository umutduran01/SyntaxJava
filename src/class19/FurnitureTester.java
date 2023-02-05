package class19;

public class FurnitureTester {
    public static void main(String[] args) {

        Furniture newFurniture = new Furniture("chair", 20, "white");
        newFurniture.print();

        Furniture newFurniture2 = new Furniture("table",100,"brown");
        newFurniture2.print();

        newFurniture2.type = "sofa";
        newFurniture2.print();

    }
}
