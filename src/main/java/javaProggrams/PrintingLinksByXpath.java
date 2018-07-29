package javaProggrams;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingLinksByXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
				driver.manage().window().maximize(); //maximize window
				driver.manage().deleteAllCookies(); //delete all the cookies
				//dynamic wait
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.wikipedia.org/"); //enter URL
			List<WebElement> links=driver.findElements(By.xpath("//a[contains(@value,'')]"));

			
			System.out.println(links.size());
			for (int i = 0; i <links.size(); i++) {
			
				String text=links.get(i).getAttribute("href");//using getAttribute we can print all the hidden links also
				//String text=links.get(i).getText();// u can print the text of the links,not hidden links
				System.out.println(text);

			}
				
			}
		
		

	}

