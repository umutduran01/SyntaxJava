package class32;

import class32.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        List<Map<String, String>> excelData = ExcelReader.read();

        Map<String, String> row = excelData.get(0);

        System.out.println(row.get("Name")); //Hamid

        Map<String, String> row2 = excelData.get(1);

        System.out.println(row2.get("salary")); //125000.0

    }
}
