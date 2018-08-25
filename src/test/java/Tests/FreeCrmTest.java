package Tests;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class FreeCrmTest {	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest extenttest;
	@BeforeTest
	public void setExtent() {
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);
		extent.addSystemInfo("Host name", "Arjun windows");
		extent.addSystemInfo("user name", "Arjun");
		extent.addSystemInfo("Environment","QA");	
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
		extent.close();		
	}
	public static String  getScreenShot(WebDriver driver,String scrrenshotName) throws IOException
	{
		String newDate=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	
		TakesScreenshot ts=(TakesScreenshot) driver;
	File source=	ts.getScreenshotAs(OutputType.FILE);	
	String Destination=System.getProperty("user.dir")+"/failScreenshots/"+scrrenshotName+ newDate+".png";
	
		File finalDestination=new File(Destination);
		FileUtils.copyFile(source, finalDestination);
		return Destination;	
	}
	@Test
	public void crmTest()
	{
	extenttest=extent.startTest("crmTest");
		String title=driver.getTitle();
		Assert.assertEquals(title, "#12 Free CRM software in the cloud for sales and service");
	
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("http://freecrm.com");		
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if (result.getStatus()==ITestResult.FAILURE) {
			extenttest.log(LogStatus.FAIL, "Test failure is"+result.getName());
			extenttest.log(LogStatus.FAIL, "Test failure is"+result.getThrowable());
			String sspath=FreeCrmTest.getScreenShot(driver, result.getName());		
			extenttest.log(LogStatus.FAIL, extenttest.addScreenCapture(sspath));
		}
		
		else if (result.getStatus()==ITestResult.SKIP) {
			extenttest.log(LogStatus.SKIP, "Test  case skip is"+result.getName());
		}
		else if (result.getStatus()==ITestResult.SUCCESS) {
		extenttest.log(LogStatus.PASS, "Test case pass is"+result.getName());
			
		}
	
		extent.endTest(extenttest);
		driver.close();
	}
	
}
