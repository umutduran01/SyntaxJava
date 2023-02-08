package class13;

public class BuilderVsString {
    public static void main(String[] args) {

        String str = "";

        for (int i = 0; i < 1000; i++) { //Her seferinde hafıza baştan taranıp sonuç yazıdırılacağı için yavaş sonuç verecektir.
            str+=i;
        }


        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < 1000; i++) { //Bu sefer değerimizi StringBuilder olarak oluşturduk. Bu daha fazla yer kaplayacaktır ama daha hızlı olacak. Her seferinde hafızayı okumaz.
            str2.append(i);
        }
        //Stringler neden değiştirilemez interview konusu

    }
}
