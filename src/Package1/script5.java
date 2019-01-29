package Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class script5 {
	static Cell customer;
	static Cell password;
	static WebDriver driver;
	public static void testAddProjectTocustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		File f1=new File("E:\\userdata\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		Workbook w1=WorkbookFactory.create(fis);
		driver.findElement(By.className("loginlnk")).click();
		for(int i=0;i<=3;i++)
		{
			 customer=w1.getSheet("Customerdetails").getRow(i).getCell(0);
			 password=w1.getSheet("Customerdetails").getRow(i).getCell(1);
			 DataFormatter d=new DataFormatter();
			String user= d.formatCellValue(customer);
			String pwd= d.formatCellValue(password);
			 
			driver.findElement(By.name("UserName")).sendKeys(user);;
		    driver.findElement(By.name("Password")).sendKeys(pwd);;
				
				driver.findElement(By.className("loginlnk")).click();
				Thread.sleep(2000);
		

			 
			
			
		}
	}
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/sai.hruthik/Desktop/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.biba.martjack.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		testAddProjectTocustomer();
		
		}
		
}
	
