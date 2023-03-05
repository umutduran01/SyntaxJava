package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader2 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\umutd\\Desktop\\Test.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");

        //We can get row size as following;

        int rowSize = sheet1.getPhysicalNumberOfRows();

        for (int i = 0; i < rowSize; i++) {

            Row row = sheet1.getRow(i);

            //Tells that how many cell there are in the row.
            int noOfCells = row.getPhysicalNumberOfCells();

            //Go through all cells from each row.
            for (int j = 0; j < noOfCells; j++) { //4 cells in Excel.

                Cell cell = row.getCell(j);

                System.out.print(cell + " ");

            }
            System.out.println();
        }


    }
}
