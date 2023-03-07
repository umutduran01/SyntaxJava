package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ExcelReader8 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\umutd\\Desktop\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet2 = xssfWorkbook.getSheet("Sheet1");

        int rowSize = sheet2.getPhysicalNumberOfRows();

        var excelData = new ArrayList<>(); //We will store excel data in a list that contains maps.

        Row row0 = sheet2.getRow(0); //It contains the header, so we can use it as a key.

        for (int i = 1; i < rowSize; i++) {
            Row row = sheet2.getRow(i);

            LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                rowMap.put(row0.getCell(j).toString(), row.getCell(j).toString());
                excelData.add(rowMap);
            }


        }

        System.out.println(excelData);

    }
}
