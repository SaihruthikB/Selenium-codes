package Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class script7 {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/sai.hruthik/Desktop/chromedriver.exe");
		
		File f1= new File("E:\\userdata\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		Workbook w1= WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet s1 =w1.getSheet("Customerdetails");
		Row r1=s1.createRow(5);
		Cell c1=r1.createCell(4);
		c1.setCellValue("Hruthik");
		FileOutputStream fos=new FileOutputStream(f1);
		w1.write(fos);
		
		System.out.println("success");
		
		
		
		
	}
		
	}
	


