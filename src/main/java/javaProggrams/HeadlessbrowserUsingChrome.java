package javaProggrams;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadlessbrowserUsingChrome {
	public static void main(String[] args) {	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("window-size=1400,800");
		cp.addArguments("headless");	
		WebDriver driver=new ChromeDriver(cp);
	driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
	System.out.println(driver.getTitle());

	}

}
