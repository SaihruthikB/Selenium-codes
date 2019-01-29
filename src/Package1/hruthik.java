package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hruthik {
	WebDriver driver;
	void test() throws InterruptedException
	{
	
	


driver.findElement(By.id("Rs_CU00302576")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.id("Rs_CU00306086")).click();
driver.findElement(By.id("Rs_237036")).click();



driver.findElement(By.className("loginlnk")).click();
driver.findElement(By.name("UserName")).sendKeys("hruthik.bolly@capillarytech.com");
driver.findElement(By.name("Password")).sendKeys("123456");
driver.findElement(By.name("btnloginSubmit")).click();
//driver.findElements(By.className("main_navbtn_m")).click();
//driver.findElements(By.xpath('//*[@id="sample-menu-2"]/li[4]/a/span[2]')).click();


driver.findElement(By.id("lnkAddToWhishLstPrdDetails")).click();


driver.findElement(By.className("btn_view_cart")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(@class,'increase')]")).click();
driver.findElement(By.id("lnkProduct")).click();

}}

