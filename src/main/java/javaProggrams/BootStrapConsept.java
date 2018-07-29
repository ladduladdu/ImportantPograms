package javaProggrams;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapConsept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
				driver.manage().window().maximize(); //maximize window
				driver.manage().deleteAllCookies(); //delete all the cookies
				//dynamic wait
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
				driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
				
			List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));	
			
			System.out.println(list.size());
			
			
			
	}
				

	}

