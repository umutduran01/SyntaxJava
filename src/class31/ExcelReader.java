package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException {

        //Location of file.
        String path = "C:\\Users\\umutd\\Desktop\\Test.xlsx";

        //Navigating to the file.
        FileInputStream fileInputStream = new FileInputStream(path);

        //It's a class that knows how to read and write Excel files.
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        //Now we should tell the computer that from which sheet we want to read data.

        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1"); //We write the sheet name.

        //As we are interested in row 2, we pass 1 in getRow method. Row and Cell indexes are based on Arrays in Java.
        Row row = sheet1.getRow(1);

        //Columns are called Cell in Excel.
        Cell cell = row.getCell(1);

        //All numbers are presented as double in Excel.
        System.out.println(cell);
    }
}
