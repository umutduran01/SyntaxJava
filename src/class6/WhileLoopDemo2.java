package class6;

public class WhileLoopDemo2 {
    public static void main(String[] args) {

        int number=1;
        boolean flag=true;
        while (flag){

            System.out.println(number);
            if(number>3){
                flag=false; //Sayı 3'ten büyük olduğunda flag ifadesi false olacak ve döngü duracaktır.
            }
            number++;
        }

    }
}
