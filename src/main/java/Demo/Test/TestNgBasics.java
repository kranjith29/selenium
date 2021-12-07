package Demo.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*
 *
@BeforeSuite-->Setup is ready
@BeforeClass-->Launch Browser
@BeforeMethod-->Enter URL
@Test-->Google logo Test
@AfterMethod-->Logut from the app

@BeforeMethod-->Enter URL
@Test-->Google Title Test
@AfterMethod-->Logut from the app

@BeforeMethod-->Enter URL
@Test-->Google Search Test
@AfterMethod-->Logut from the app
@AfterClass-->Close the Browser
@AfterSuite-->Delete all Cookies
 *
 */

public class TestNgBasics {
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite-->Setup is ready");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("@BeforeClass-->Launch Browser");
	}
	@BeforeMethod
	public void enterURL() {
		System.out.println("@BeforeMethod-->Enter URL");
	}
	@Test 
	public void AGoogleLogoTest() {
		System.out.println("@Test-->Google logo Test");
	}
	@Test 
	public void BGoogleTitleTest() {
		System.out.println("@Test-->Google Title Test");
	}
	@Test 
	public void CGoogleSearchTest() {
		System.out.println("@Test-->Google Search Test");
	}
	@AfterMethod
	public void logOut() {
		System.out.println("@AfterMethod-->Logut from the app");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass-->Close the Browser");
	}
	@AfterSuite
	public void clearCookies() {
		System.out.println("@AfterSuite-->Delete all Cookies");
	}
	
    
}


















/*
WebDriver driver;
@Test
public void ChromeSetup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().fullscreen();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.google.com");
    driver.close();
}
@Test
public void FireFoxSetup() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Home\\eclipse-workspace\\Test\\Driver\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().window().fullscreen();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.google.com");
    driver.close();
}
*/