package javaProggrams;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value=('arjun');");
		js.executeScript("document.getElementById('pass').value=('arjun');");
	}
	
	/*	//driver.get("https://gaana.com/"); //enter URL
		//executeScript -- to execute JavaScript code
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); //login button
		//generateAlert(driver, "There is an issue with Login button on Login Page");
		flash(loginBtn, driver); //highlight the element
		drawBorder(loginBtn, driver);
		takeScreenshot(driver);
		//scrollPageDown(driver);	
		//clickElementByJs(loginBtn, driver);
		refreshPageByJs(driver);
		System.out.println(getTitleByJs(driver));
		System.out.println(getInnerText(driver));
		WebElement element=driver.findElement(By.xpath("//a[@id='partners']"));
		scroolIntoView(element, driver);
	}
	
	*/
	public static void flash(WebElement element, WebDriver driver) {
      //  JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  100; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1
            changeColor(bgcolor, element,driver);//2
        }
	}
	
	public static void changeColor(String colour,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor= '"+colour+"'", element);
		
		try {
			
			Thread.sleep(20);
			
		} 
		catch (InterruptedException e) {
			
		}
	}
		public static void drawBorder(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.border= '3px solid red'", element);
		}
		public static void takeScreenshot(WebDriver driver) throws IOException
		{
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// now copy the screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("D:\\eclipse\\importantprograms\\drivers.png"));
		}
		public static void generateAlert(WebDriver driver,String message)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("alert('"+message+"')");
		}
		public static void scrollPageDown(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		public static void clickElementByJs(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("arguments[0].click()", element);
		}
		public static void refreshPageByJs(WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("history.go(0)");
		}
		public static String getTitleByJs(WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor) driver);
			String title=js.executeScript("return document.title;").toString();
			return title;
		}
		public static String getInnerText(WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor) driver);
			String title=js.executeScript("return document.documentElement.innerText;").toString();
			return title;
		}
		public static void scroolIntoView(WebElement element,WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
		
		
		public static void enterTextUsingJs(WebDriver driver,WebElement value,WebElement pass)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("document.getElementById('id').value=('value');");
			js.executeScript("document.getElementById('id').value=('pass');");
			
		}

	}




//a[contains(@value,'')]