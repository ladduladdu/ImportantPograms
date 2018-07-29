package javaProggrams;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverInit {	
	private static  DriverInit Driver_insatnce=null;	
	private WebDriver driver;	
	private DriverInit()
	{	
		
	}
	public WebDriver openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 return driver;
	}
	
	public static DriverInit getInstance()
	{	
		if (Driver_insatnce==null) 
			Driver_insatnce=new DriverInit();
			return Driver_insatnce;		
	}
	
}
