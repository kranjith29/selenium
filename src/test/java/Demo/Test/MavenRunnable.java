package Demo.Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

public class MavenRunnable extends BaseMavenClass{
	//FileNotFoundException
	public static void main(String[] args) throws Throwable {
	
		FileInputStream fis = new FileInputStream("C:\\Users\\Home\\eclipse-workspace\\Test\\Property\\Automation.properties");
		Properties p = new Properties();
		p.load(fis);
		String brw=p.getProperty("browser");
		String link=p.getProperty("url");
		String UN=p.getProperty("username");
		String PWD=p.getProperty("password");
			
	//Launch Browser & Loggged in to e-commerce page	
	    browser(brw);
		Url(link);
		PageFactory.initElements(driver, POM_Class.class);
		sendkeys(POM_Class.email,UN);
		sendkeys(POM_Class.pwd,PWD);
		click(POM_Class.signin);
   //Categories - Dresses
		Categorie(POM_Class.DRESSES);
		
		
		
		
	
	}
	

}
