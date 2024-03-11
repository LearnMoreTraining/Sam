package resuable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static String getExcelData(String sheetName, int row , int col) throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/testdata/TestData.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetName);
       return sheet.getRow(row).getCell(col).getStringCellValue();
    }
}
