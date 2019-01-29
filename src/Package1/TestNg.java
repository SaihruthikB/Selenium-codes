package Package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("hrutik");
	}
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println(" you open the chrome browser");
	}
	@Test(priority=1,groups="login")
	public void enterGoogleTiltle()
	{
	System.out.println(" enter Google");
	}
	@Test(priority=2,groups="logout")
	public void enterGoogleTiltle1()
	{
	System.out.println(" enter youtube");
	}
	
	@AfterMethod
	public void Close()
	{
	System.out.println("good");
	}

}
