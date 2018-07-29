package Tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import javaProggrams.DriverInit;
public class singletonTest {
	 public WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		DriverInit instance=DriverInit.getInstance();
		driver=instance.openBrowser();	
	}	
	@Test
	public void test1()
	{
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	
	}
}
