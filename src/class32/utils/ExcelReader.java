package class32.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String, String>> read() throws IOException {

        String path = "C:\\Users\\umutd\\Desktop\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        List<Map<String, String>> excelData = new ArrayList<>();

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

        return excelData;
    }

}
