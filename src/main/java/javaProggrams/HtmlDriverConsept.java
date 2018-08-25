package javaProggrams;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HtmlDriverConsept {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new HtmlUnitDriver();
		
//	System.setProperty("phantomjs.binary.path", System.getProperty("user.dir")+"/drivers/phantomjs.exe");
		
		//WebDriver driver=new PhantomJSDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("8886532072");
		driver.findElement(By.id("pass")).sendKeys("7382245852m");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.getTitle());
	
	}

}
