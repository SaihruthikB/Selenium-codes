package Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script6 {
	static Cell user;
	static Cell password;
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/Users/sai.hruthik/Desktop/chromedriver.exe");
		WebDriver ff= new ChromeDriver();
		ff.get("http://www.biba.in");
		ff.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ff.findElement(By.className("loginlnk")).click();
		File f1=new File("E:\\userdata\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		Workbook w1=WorkbookFactory.create(fis);
		for(int i=0;i<=4;i++){
		user = w1.getSheet("Customerdetails").getRow(i).getCell(0);
		password=w1.getSheet("Customerdetails").getRow(i).getCell(1);
		DataFormatter d=new DataFormatter();
		String user1= d.formatCellValue(user);
		String pwd= d.formatCellValue(password);
		
		
			ff.findElement(By.name("UserName")).sendKeys(user1);;
		    ff.findElement(By.name("Password")).sendKeys(pwd);
		    ff.findElement(By.className("loginlnk")).click();
		    Thread.sleep(2000);
		}
	}
	
	
	
}
