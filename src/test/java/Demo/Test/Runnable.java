package Demo.Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;


public class Runnable extends BaseMavenClass{

	public static void main(String[] args) throws Throwable {
		//B_Class.browser("Chrome");
/*		
		//Using Property file
		FileInputStream file = new FileInputStream("C:\\Users\\Home\\eclipse-workspace\\Test\\Property\\Automation.properties");
		Properties property = new Properties();  // Properties is a class
		property.load(file);                     //Using to load the properties from file
		String brws = property.getProperty("browser");  //Control + 2 then l
		String url =property.getProperty("url");
		String UN = property.getProperty("username");
		String PW = property.getProperty("password");
*/		
		
		//browser(brws);
		browser("Chrome");
		//Url(url);
		Url("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		PageFactory.initElements(driver, POM_Class.class);
		//POM_Class.email.sendKeys("sukran2930@gmail.com");
		sendkeys(POM_Class.email,"sukran2930@gmail.com");
		//sendkeys(POM_Class.email,UN);
		
		//sendkeys(POM_Class.pwd,PW);
		//POM_Class.pwd.sendKeys("Corona@2021");
		sendkeys(POM_Class.pwd,"Corona@2021");
		ScreenShot("Snap1.png");
		POM_Class.signin.click();
				
		ScreenShot("Snap2.png");
		//Women Category
		Categorie(POM_Class.WOMEN);
		POM_Class.Women_TShirt.click();
		POM_Class.Orange_Beige.click();
		POM_Class.Quantity_Add.click();
		POM_Class.Add_to_cart1.click();
		impwait(3000);
		POM_Class.ContinueShopping.click();
		//Dresses Category
		POM_Class.DRESSES.click();
		POM_Class.Dress_Evening.click();
		POM_Class.Blue_Pink.click();
		POM_Class.Quantity_Add.click();
		POM_Class.Add_to_cart1.click();
		//impwait(2000);
		POM_Class.ContinueShopping.click();	
		//T-shirt Category
		POM_Class.T_Shirts.click();
		POM_Class.More.click();
		POM_Class.Quantity_Add.click();
		POM_Class.Add_to_cart1.click();
		impwait(2000);	
		POM_Class.CheckOut1.click();
		POM_Class.CheckOut2.click();
		
		POM_Class.CommentBox.sendKeys("All Dress Materials are Good");
		POM_Class.CheckOut3_4.click();
		
		POM_Class.CheckIn.click();
		POM_Class.CheckOut3_4.click();
		ScreenShot("Snap3.png");
		
		POM_Class.PayByBank.click();
		POM_Class.Confirm_Order.click();
		ScreenShot("Snap4.png");
		driver.close();
		
		
	}

}
