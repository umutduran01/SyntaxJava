package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class ExcelReader6 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\umutd\\Desktop\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet2 = xssfWorkbook.getSheet("Sheet2");

        int rowSize = sheet2.getPhysicalNumberOfRows();

        for (int i = 0; i < rowSize; i++) {
            Row row = sheet2.getRow(i);
            //System.out.println(row.getCell(0) + " " + row.getCell(1)); - Replace this code with nested for loop.

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }

    }
}
