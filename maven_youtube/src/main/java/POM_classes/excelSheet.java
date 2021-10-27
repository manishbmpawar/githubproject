package POM_classes;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelSheet {

	public static void sheet(String b,int c,int d) throws EncryptedDocumentException, IOException
	{	
		String path ="C:\\Users\\Manish\\OneDrive\\Documents\\Automation.xlsx";
		File file=new File(path);
//		Sheet a=WorkbookFactory.create(file).getSheet(b);
		Cell cell=WorkbookFactory.create(file).getSheet(b).getRow(c).getCell(d);
		System.out.print(cell);
		
	}	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		sheet("velocity",1,1);
	}

}
