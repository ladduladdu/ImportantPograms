package javaProggrams;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		String date = "10/9/2018";

		String[] temp = date.split("/");

		String dt, mnth, yr;

		dt = temp[0];

		mnth = temp[1];

		yr = temp[2];

		Thread.sleep(2000);

		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Admin");

		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("Recruitment")).click();

		driver.findElement(By.linkText("Candidates")).click();
		driver.findElement(By.className("ui-datepicker-trigger")).click();

		Select months = new Select(driver.findElement(By.className("ui-datepicker-month")));

		months.selectByValue(mnth);

		Select years = new Select(driver.findElement(By.className("ui-datepicker-year")));

		years.selectByVisibleText(yr);

		WebElement cal;

		cal = driver.findElement(By.id("ui-datepicker-div"));

		Thread.sleep(2000);

		List<WebElement> rows,cols;

		rows = cal.findElements(By.tagName("tr"));

		String caldt;
		
		rows=cal.findElements(By.tagName("tr"));
		boolean flag=false;
		for (int i = 1; i < rows.size(); i++) 
		{
		cols=rows.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < cols.size(); j++) 
		{
		caldt=cols.get(j).getText();
		
		System.out.println(caldt);
		if (caldt.equals(dt))
		{
		cols.get(j).click();
		flag=true;
	    break;
		}
		}
		if (flag) 
		{
		break;	
			}
		}

	}

}
