package class32;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Recap1 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\umutd\\Desktop\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet2 = xssfWorkbook.getSheet("Sheet2");

        var excelData = new ArrayList<>();

        int rowNumber = sheet2.getPhysicalNumberOfRows();

        for (int i = 1; i < rowNumber; i++) {

            LinkedHashMap rowMap = new LinkedHashMap<>();

            rowMap.put("Username", sheet2.getRow(i).getCell(0).toString());
            rowMap.put("Password", sheet2.getRow(i).getCell(1).toString());
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }
}
