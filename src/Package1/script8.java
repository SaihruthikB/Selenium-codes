package Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class script8 {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException{
    System.setProperty("webdriver.chrome.driver", "C:/Users/sai.hruthik/Desktop/chromedriver.exe");
    File f1=new File("E:\\userdata\\Details.xlsx");
    FileInputStream fis=new FileInputStream(f1);
    Workbook w1= WorkbookFactory.create(fis);
    w1.getSheet("Kumar").createRow(1).createCell(2).setCellValue("hruthik");
    FileOutputStream fos=new FileOutputStream(f1);
    w1.write(fos);
    System.out.println("success");
   
    

		
	}

}

