package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new  FileInputStream("C:\\Users\\AMRAT\\eclipse-workspace\\Zerodha1\\src\\test\\resources\\testdata1.xlsx");
		                 String value= WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

              }


