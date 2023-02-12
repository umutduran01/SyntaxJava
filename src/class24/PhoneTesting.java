package class24;

public class PhoneTesting {
    public static void main(String[] args) {

        Phone[] phoneArr = {new Iphone(), new Samsung(), new Google()};

        for (Phone phones:phoneArr
             ) {
            phones.displayPictures();
            phones.unlockPhone(4368);
            phones.SendText("Hello Everyone !");
        }
    }
}
