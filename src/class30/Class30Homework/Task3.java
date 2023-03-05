package class30.Class30Homework;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /*
    Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
    John Smith=$100000
    */

    public static void main(String[] args) {

        Map<String, Integer> employee = new HashMap<>();
        employee.put("Adam", 35000);
        employee.put("George", 40000);
        employee.put("Michael", 75000);
        employee.put("Kelly", 70000);

        int max = 0;
        String maxName = "Empty";

        for (Map.Entry<String, Integer> entry : employee.entrySet()) {

            String name = entry.getKey();
            int salary = entry.getValue();

            if (salary > max) {
                max = salary;
                maxName = name;
            }
        }

        System.out.println(maxName + "=" + "$" + max);
    }
}
