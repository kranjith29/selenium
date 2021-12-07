package org.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itenrary {
	
	public static WebDriver driver; //null driver

	@FindBy(id="search_hotel")
	private WebElement Search;
	
	@FindBy(id="my_itinerary")
	private WebElement My_Itenrary;
	
	@FindBy(id="logout")
	private WebElement Logout;

	public Itenrary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getMy_Itenrary() {
		return My_Itenrary;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	

}
