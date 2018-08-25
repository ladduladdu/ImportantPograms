package javaProggrams;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class switchingWindow {
	 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			
				 driver.get("http://google.com");
				 driver.manage().window().maximize();
				 Thread.sleep(5000);
				 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
				 driver.get("http://facebook.com");
				 
//				 WebDriver driver=new ChromeDriver();
//				   driver.get("http://google.com");  
//				     ((JavascriptExecutor)driver).executeScript("window.open()");
//				     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//				     driver.switchTo().window(tabs.get(1));
//				     driver.get("http://facebook.com");
//				driver.quit();
				 

	}

}
