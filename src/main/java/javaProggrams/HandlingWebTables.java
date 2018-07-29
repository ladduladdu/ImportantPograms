package javaProggrams;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingWebTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

driver.get("https://www.w3schools.com/html/html_tables.asp");


//WebElement element=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[2]"));
//System.out.println(element.getText());

List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));


for (int i = 1; i <=7; i++)
{
List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
for (int j = 0; j <cols.size(); j++) {	
	String data=cols.get(j).getText();
	System.out.println(data);
}
}


//*[@id="customers"]/tbody/tr[2]/td[1]
//*[@id="customers"]/tbody/tr[3]/td[1]
//*[@id="customers"]/tbody/tr[4]/td[1]
//*[@id="customers"]/tbody/tr[5]/td[1]
/*
String beforeXpath="//*[@id='customers']/tbody/tr[";
String afterXpath="]/td[1]";
List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//System.out.println(rows.size());

for (int i = 2; i <=rows.size(); i++) 
{
	String actualpath=beforeXpath+i+afterXpath;
WebElement element =driver.findElement(By.xpath(actualpath));
	System.out.println(element.getText());
	if (element.getText().equals("Ernst Handel"))
			{
		System.out.println("Company name" +element.getText()+"  is avialable"+(i-1) );
		break;
	}
}
System.out.println("************");

	//*[@id="customers"]/tbody/tr[2]/td[2]
	//*[@id="customers"]/tbody/tr[3]/td[2]
	//*[@id="customers"]/tbody/tr[4]/td[2]
	//*[@id="customers"]/tbody/tr[5]/td[2]
	
	String afterXpathcon="]/td[2]";
	
	for (int i = 2; i <=rows.size(); i++) 
	{
		String actualpath=beforeXpath+i+afterXpathcon;
	WebElement element =driver.findElement(By.xpath(actualpath));
		System.out.println(element.getText());	
}
	
String afterXpathcom="]/td[3]";
	
	for (int i = 2; i <=rows.size(); i++) 
	{
		String actualpath=beforeXpath+i+afterXpathcom;
	WebElement element =driver.findElement(By.xpath(actualpath));
		System.out.println(element.getText());	
		
	}
	System.out.println("************");
	//*[@id="customers"]/tbody/tr[1]/th[1]
	//*[@id="customers"]/tbody/tr[1]/th[2]
	//*[@id="customers"]/tbody/tr[1]/th[3]
		
		
		String colBeforeXpath="//*[@id=\"customers\"]/tbody/tr[1]/th[";
		String colAfterXpath="]";
		
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
int colcount=cols.size();

for (int i= 1; i <=colcount; i++) 
{
	
	String path=colBeforeXpath+i+colAfterXpath;
WebElement element=driver.findElement(By.xpath(path));
System.out.println(element.getText());
}
		
		
		
		
		*/

	}
}