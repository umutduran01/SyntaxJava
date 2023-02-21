package class10;

import java.util.Arrays; //Arrays.toString ifadesini kullanmak için gereklidir.

public class D2Arrays {
    public static void main(String[] args) {

        // a 2D array which can hold 3 one D arrays
        // each of size 3
        String[][] thomsonTrain=new String [3][3];
        String[] cabin0={"Adam","Zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeera","Zahra"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        // in the first [] we specify the address of 1 D ARRAY
        System.out.println(thomsonTrain[1][1]);
        System.out.println(Arrays.toString(thomsonTrain[0]));

        //2D diziler birden fazla 1D diziyi içinde barındırabilir. İndexleri yazarken ilk önce hangi diziden değer çağırdığımızı sonra da dizideki hangi indexi çağırdığımızı gireriz.


    }
}
