package org.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 Location, Hotels, Room Type, No. of Rooms, Check in, Check out
 Adults per Room, Children per Room
 */
public class SearchPage {
	public static WebDriver driver;   //---> null driver
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement Location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement Hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement RoomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement No_of_Rooms;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement CheckIn;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement CheckOut;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement AdultPerRoom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement ChildremPerRoom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement Search;
	
	@FindBy(xpath="//input[@id='Reset']")
	private WebElement Reset;

	public SearchPage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNo_of_Rooms() {
		return No_of_Rooms;
	}

	public WebElement getCheckIn() {
		return CheckIn;
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}

	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}

	public WebElement getChildremPerRoom() {
		return ChildremPerRoom;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getReset() {
		return Reset;
	}

		

}
