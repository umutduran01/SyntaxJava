package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Recap2 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\umutd\\Desktop\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        var excelData = new ArrayList<>();

        Row row0 = sheet.getRow(0);

        int rowNumber = sheet.getPhysicalNumberOfRows();

        for (int i = 1; i < rowNumber; i++) {

            Row row = sheet.getRow(i);

            LinkedHashMap excelMap = new LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                excelMap.put(row0.getCell(j).toString(), row.getCell(j).toString());
            }
            excelData.add(excelMap);
        }
        System.out.println(excelData);
    }
}
