package class32;

import class32.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) throws IOException {

        List<Map<String, String>> excelData = ExcelReader.read();

        for (Map<String, String> row : excelData) {
            for (var entry : row.entrySet()) {
                System.out.print(entry.getKey() + " " + entry.getValue());
            }
            System.out.println();
        }

    }
}
