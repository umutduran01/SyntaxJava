package class20;

public class SportTester {
    public static void main(String[] args) {

        Cricket crick = new Cricket("Cricket","Pakistan","Green Helmet");

        //this refers the current class and super refers the immediate parent class.

        crick.display();

        Soccer soccer = new Soccer("Soccer","Portugal",17);
        soccer.soccerResult();
    }
}
