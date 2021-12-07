package Demo.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinBase {
	public static WebDriver driver;
//BrowserLaunch
	public static WebDriver browserLaunch(String brw) {
		if(brw.equalsIgnoreCase("chrome")) {
		//System.setProperty("webdriver.chrome.driver", 
		//		"C:\\Users\\Home\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	
	    }
		else if(brw.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
//Get URL	
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().fullscreen();
	}
//Send Username, Password, date
	public static void SendKeys(WebElement element,String str) {
		element.sendKeys(str);
	}
////Send Password	
//	public static void pwd(WebElement element,String pwd) {
//		element.sendKeys(pwd);
//	}
//Click
	public static void click(WebElement element) {
		element.click();
		driver.manage().window().fullscreen();
	}
//Close	
	public static void close() {
		driver.close();
	}
//drop down
	public static void dropdown(WebElement element,String type, String str) {
		Select s = new Select(element);
		if(type.equalsIgnoreCase("byValue")) {
			s.selectByValue(str);
		}
		else if(type.equalsIgnoreCase("byvisibletext")){
			s.selectByVisibleText(str);
		}
		else if(type.equalsIgnoreCase("byIndex")) {
			int parseInt = Integer.parseInt(str);  //Convert string to Int 
			s.selectByIndex(parseInt);
		}
			
	}
	
	

}
