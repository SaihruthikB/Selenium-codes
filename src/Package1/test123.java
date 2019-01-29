package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test123 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/sai.hruthik/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.biba.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Girls']")).click();
		Select a = new Select(driver.findElement(By.id("drpSort")));
		a.selectByVisibleText("Price high to low");
		Thread.sleep(5000);
		driver.findElement(By.id("Rs_CU00302576")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Rs_CU00306086")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='bucket_left']/a/img[1])[1]")).click();
		driver.findElement(By.id("259350")).click();
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn_view_cart')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn_qtyincrease')]")).click();
		driver.findElement(By.id("txtEmailid")).sendKeys("hruthik.bolly@capillarytech.com");
		driver.findElement(By.id("txtPassword")).sendKeys("123456");
		driver.findElement(By.id("Step1continue")).click();
		driver.findElement(By.id("btnDeleteAddress-1562398")).click();
		driver.findElement(By.id("Step2continue")).click();
		
		

	}
}