package class28.Class28Homework;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {
        Insurance car = new Car();
        Insurance pet = new Pet();
        Insurance health = new Health();

        ArrayList<Insurance> newArray = new ArrayList<>();
        newArray.add(car);
        newArray.add(pet);
        newArray.add(health);

        for (Insurance item : newArray){
            item.cancelInsurance();
            item.getQuote();
        }
    }
}
