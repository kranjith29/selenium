//Base Class 
//Web Driver, Driver type, send keys, click, Thread, Implicit wait, action, screenshot
package Demo.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BaseMavenClass {
	public static WebDriver driver;       //WebDriver
	public static Select s;               //Select
	
	//Driver
	public static void browser(String Wb) {
		if(Wb.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		 }
		else if(Wb.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Home\\eclipse-workspace\\Test\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("No Browser found");
		}
		driver.manage().window().fullscreen();
		}
      //URL	
	  public static void Url(String url) {
		  driver.get(url);
	   }
	  public static void FullScreen() {
		  driver.manage().window().fullscreen();
	  }
	  //SendKeys
	  public static void sendkeys(WebElement element,String input) {
		element.sendKeys(input);
	}
/*
	 public static void properties() throws IOException { 
		FileInputStream fis = new FileInputStream("C:\\Users\\Home\\eclipse-workspace\\Test\\Property\\Automation.properties");
		Properties p = new Properties();
		p.load(fis);
		String brw=p.getProperty("browser");
		String link=p.getProperty("url");
		String UN=p.getProperty("username");
		String PWD=p.getProperty("password");
		browser(brw);
		Url(link);
		PageFactory.initElements(driver, POM_Class.class);
		sendkeys(POM_Class.email,UN);
		sendkeys(POM_Class.pwd,PWD);
		click(POM_Class.signin);
	 } 
*/	 
	 //Click
	  public static void click(WebElement element) {
		  element.click();
	  }
	  //Select
	  public static void Size(WebElement Size) {
		  s = new Select(Size);
	  		  
	  }
	  
	  //Actions
	  public static void Categorie(WebElement option) {
		  Actions a = new Actions(driver);
		  a.moveToElement(option).build().perform();
		  //a.click(target).perform();
		  //a.moveToElement(option).perform();
	  }
	  
	  
	  public static void Categories(WebElement option, WebElement target) {
		  Actions a = new Actions(driver);
		  a.moveToElement(option).build().perform();
		  a.click(target).perform();
		  //a.moveToElement(option).perform();
	  }
	  //Thread
	  public static void wait(int ms) throws Throwable {
		  Thread.sleep(ms);
	  }
	  //Implicit Wait
	  public static void impwait(int s) {
		  driver.manage().timeouts().implicitlyWait(s,TimeUnit.MILLISECONDS);
	  }
	  //Screenshot
	  public static void ScreenShot(String str) throws Throwable {
		  FullScreen();
		  impwait(1000);
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File dst = new File("C:\\Users\\Home\\eclipse-workspace\\Test\\Screenshot\\" + str);
		  FileUtils.copyFile(src,dst);
		  impwait(3000);
	  }
	  
	  
}

 

