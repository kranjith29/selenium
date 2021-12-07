package Demo.Test;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

	public class TestNGFeatures {
	WebDriver driver;	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority=1,groups="setup")
	public void googleTitleTest() {
		String title =driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups="Googlepage")
	public void googleLogoTest() {
		boolean a =driver.findElement(By.xpath("//*[@class='lnXdpd']")).isDisplayed();
		
	}
    @Ignore
	@Test(priority=3,groups="Googlepage")
	public void mailLinkTest() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@Test(priority=4,groups="Googlepage")
	public void Test1() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@Test(priority=5,groups="sample")
	public void Test2() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@Test(priority=-5,groups="sample")
	public void Test3() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	

	}

}
