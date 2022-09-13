package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
	public static String getTD(int rowindex,int colindex)throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\rich\\Documents\\Testing_Notes\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}
}
