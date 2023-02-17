package class25;

public class WashAbleTester {
    public static void main(String[] args) {

        WashAble [] washAbleArray = {new SmartWatch(), new Phone(),new Inverter()};

        for (WashAble items : washAbleArray){
            items.wash();
        }


    }
}
