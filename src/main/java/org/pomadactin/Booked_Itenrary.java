package org.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itenrary {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='check_all']")
	private WebElement Check_Box;
	
	@FindBy(xpath="//input[@id='check_all']")
	private WebElement CancelAll;
	
	@FindBy(xpath="//input[@id='search_hotel']")
	private WebElement Search;
	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement Logout;

	//constructor
	public Booked_Itenrary(WebDriver driver2) {
		//driver=driver2;
		//PageFactory.initElements(driver, Booked_Itenrary.class);
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheck_Box() {
		return Check_Box;
	}

	public WebElement getCancelAll() {
		return CancelAll;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	
	

}
