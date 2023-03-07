package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader5 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\umutd\\Desktop\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet2 = xssfWorkbook.getSheet("Sheet2");

        int rowSize = sheet2.getPhysicalNumberOfRows();

        for (int i = 0; i < rowSize; i++) { //Row size kez dönecek.
            Row row = sheet2.getRow(i); //Sheet2'de ilk satırı aldık ve row'a store ettik.
            System.out.println(row.getCell(0) + " " + row.getCell(1)); //Store olan row'un ilk satırını ve ikinci satırını cağırdır.
        }

    }
}
