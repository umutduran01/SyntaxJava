package class4;

public class NestIfPractice {
    public static void main(String[] args) {

        //EXAMPLE 1

        int money = 1000;
        String day = "Sunday";
        boolean mood = false;

        if (money > 700) {
            if (mood) {
                System.out.println("Shopping time !"); //Buradaki if değerine bağlı bir else olmadığı için bir sonuç alınmayacaktır.
            }
        }else {
            System.out.println("Save money !");
        }


        //EXAMPLE 2

        boolean studyHard = true;
        int salary = 90000;

        if (studyHard){
            System.out.println("We get the jobs");
            if (salary > 100000){
                System.out.println("Let's buy a Tesla");
            }else {
                System.out.println("Let's buy a Toyota");
            }
        }else {
            System.out.println("It might take a little longer for us to get the jobs");
        }

    }
}
