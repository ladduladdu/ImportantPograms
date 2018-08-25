package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class testingDropdown {
	public  static WebDriver driver;
	
	WebElement dayelement;
	WebElement melement;
	WebElement yelement;
	static Select dlist;
	static Select mlist;
	static Select ylist;
	public testingDropdown()
	{
		//dayelement=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		dayelement=driver.findElement(By.name("DateOfBirthDay"));	
		dlist=new Select(dayelement);
		melement=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		ylist=new Select(melement);
		yelement=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		mlist=new Select(yelement);
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();		
		driver.get("http://demo.nopcommerce.com/register");
		//dlist.selectByVisibleText("10");
		dlist.selectByIndex(17);
		mlist.selectByValue("10");
		ylist.selectByVisibleText("1999");
	
	}

}
