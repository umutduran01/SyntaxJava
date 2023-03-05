package class31;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader3 {
    public static void main(String[] args) {

        LinkedHashMap<String, String> row1 = new LinkedHashMap<>();
        row1.put("Name", "Umut");
        row1.put("Age", "28");
        row1.put("City", "Lisbon");
        row1.put("Salary", "120000");

        LinkedHashMap<String, String> row2 = new LinkedHashMap<>();
        row2.put("Name", "Sam");
        row2.put("Age", "60");
        row2.put("City", "Houston");
        row2.put("Salary", "125000");

        List<Map<String,String>> allRows = new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);

        System.out.println(allRows);
    }
}
