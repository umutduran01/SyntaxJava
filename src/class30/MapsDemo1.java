package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>() {
        };
        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Anush");
        studentsMap.put(3, "Tami");

        System.out.println(studentsMap);

        System.out.println(studentsMap.get(3)); //Here it works depending on keys, not indexes. - Output will be Tami.

        System.out.println(studentsMap.size()); //Output is 3.

        System.out.println(studentsMap.containsKey(6)); //Output is false.

        System.out.println(studentsMap.containsValue("Tami")); //Output is true.

        System.out.println(studentsMap.remove(1)); //It removes Nezir but also prints it.

        System.out.println(studentsMap);

        studentsMap.replace(2,"Asli"); //We want to see Asli at key 2;

        System.out.println(studentsMap);


    }
}
