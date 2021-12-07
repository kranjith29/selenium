package Demo.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//In POM Class - There is no Main Method
//We need to use PageFactory to use this locators

public class POM_Class {

//Sign-in part	
		@FindBy(xpath="(//input[@data-validate='isEmail'])[2]")
		public static WebElement email;
		
		@FindBy(xpath="//input[@id='passwd']")
		public static WebElement pwd;
		
		@FindBy(xpath="//button[@id='SubmitLogin']")
		public static WebElement signin;
//WOMEN category		
		@FindBy(xpath="//a[@title='Women']")
		public static WebElement WOMEN;
		
		@FindBy(xpath="(//a[@title='T-shirts'])[1]")
		public static WebElement Women_TShirt;
		
		@FindBy(xpath="(//a[@class='color_pick'])[1]")
		public static WebElement Orange_Beige;
		
		@FindBy(xpath="(//a[@class='color_pick'])[2]")
		public static WebElement Blue_Pink;
		
		@FindBy(xpath="(//a[@title='Summer Dresses'])[1]")
		public static WebElement Women_Summer;
//DRESSES Categroy		
		@FindBy (xpath="(//a[@title='Dresses'])[2]")
		public static WebElement DRESSES;
		
		@FindBy(xpath="(//a[contains(.,'Evening Dresses')])[3]")
		public static WebElement Dress_Evening;
		
		
//T-SHIRT Category		
		@FindBy (xpath="(//a[@title='T-shirts'])[2]")
		public static WebElement T_Shirts;
		

//Quantity_Add		
		@FindBy(xpath="//i[@class='icon-plus']")
		public static WebElement Quantity_Add;

//DropDown
		@FindBy(xpath="//select[@name='group_1']")
		public static WebElement Size;
		
//Add to Cart	
		
		@FindBy(xpath="//p[contains(.,'Add to cart')]")
		public static WebElement Add_to_cart1;
		
		@FindBy(xpath="//a[contains(.,'Add to cart')]")
		public static WebElement Add_to_cart2;
		
		@FindBy(xpath="//a[contains(.,'More')]")
		public static WebElement More;
		
		@FindBy(xpath="//button[contains(.,'Add to cart')]")
		public static WebElement More_Addcart;

//ContinueShopping		
		@FindBy(xpath="//span[contains(@title,'Continue ')]")
		public static WebElement ContinueShopping;
//Checkout		
		@FindBy(xpath="//a[contains(@title,'Proceed ')]")
		public static WebElement CheckOut1;
		
		@FindBy(xpath="(//a[contains(@title,'Proceed ')])[2]")
		public static WebElement CheckOut2;
		
		@FindBy(xpath="//button[contains(.,'Proceed ')]")
		public static WebElement CheckOut3_4;
//Comment Box
		@FindBy(xpath="//textarea[@name='message']")
		public static WebElement CommentBox;

//CheckBox		
		@FindBy(xpath="//div[@class='checker']")
		public static WebElement CheckIn;
		
//Payment Method
		@FindBy(xpath="//a[contains(.,'Pay by bank')]")
		public static WebElement PayByBank;
		
		@FindBy(xpath="//a[contains(.,'Pay by check')]")
		public static WebElement PayByCheck;
//Confirm Order
		@FindBy(xpath="//span[contains(.,'confirm')]")
		public static WebElement Confirm_Order;
		
		
		
	}


