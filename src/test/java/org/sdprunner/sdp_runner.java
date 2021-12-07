package org.sdprunner;


import org.openqa.selenium.WebDriver;
import org.sdpadactin.Page_object_manager;

import Demo.Test.AdactinBase;
//Singleton Design Patter
public class sdp_runner extends AdactinBase{
	
	//public static WebDriver driver;
	public static WebDriver driver =browserLaunch("chrome");
	public static Page_object_manager pom = new Page_object_manager(driver);

	//	public static LoginPage login = new LoginPage(driver);
//	public static SearchPage Search = new SearchPage(driver);
//	public static SelectHotel hotel = new SelectHotel(driver);
//	public static BookHotel book_hotel = new BookHotel(driver);
//	public static Itenrary confirm = new Itenrary(driver);
//	public static Booked_Itenrary booked = new Booked_Itenrary(driver);
	
	public static void main(String[] args) throws InterruptedException {
		//driver =browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/index.php");
//Login Page:1
		//LoginPage login = new LoginPage(driver);
		SendKeys(pom.getLogin().getUserName(),"kranjithk2930");
		SendKeys(pom.getLogin().getPwd(),"Chennai@2021");	
		click(pom.getLogin().getLogin());
//Search Hotel: 2
//		SearchPage Search = new SearchPage(driver);
		dropdown(pom.getSearch().getLocation(),"byvisibletext","Brisbane");
		dropdown(pom.getSearch().getHotels(),"byvalue","Hotel Cornice");
		dropdown(pom.getSearch().getRoomType(),"byindex","4");
		dropdown(pom.getSearch().getNo_of_Rooms(),"byvalue","2");
		SendKeys(pom.getSearch().getCheckIn(),"13/11/2021");
		SendKeys(pom.getSearch().getCheckOut(),"15/11/2021");
		dropdown(pom.getSearch().getAdultPerRoom(),"byvalue","4");
		dropdown(pom.getSearch().getChildremPerRoom(),"byvalue","2");
		click(pom.getSearch().getSearch());
//Select Hotel: 3	
//		SelectHotel hotel = new SelectHotel(driver);
		click(pom.getSelect().getButton1());
		click(pom.getSelect().getCont());
//Book A Hotel: 4	
//		BookHotel book_hotel = new BookHotel(driver);
		SendKeys(pom.getBook().getFirstName(),"Ranjith Kumar");
		SendKeys(pom.getBook().getLastName(),"Kalyani");
    	SendKeys(pom.getBook().getAddress(),"W-8, D-36, Azhagar street, Chennai");
		SendKeys(pom.getBook().getCc(),"4567123487651234");
		dropdown(pom.getBook().getCcType(),"byvisibletext","VISA");
		dropdown(pom.getBook().getExpiryMonth(),"byvisibletext","July");
		dropdown(pom.getBook().getExpiryYear(),"byvisibletext","2021");
		SendKeys(pom.getBook().getCvv(),"123");
		click(pom.getBook().getBookNow());
		Thread.sleep(5000);				
//Booking Confirmation: 5
//		Itenrary confirm = new Itenrary(driver);
		click(pom.getItn().getMy_Itenrary());
//Booked Itinerary: 6
//		Booked_Itenrary booked = new Booked_Itenrary(driver);
		click(pom.getBooked().getCheck_Box());
		Thread.sleep(3000);
		click(pom.getBooked().getLogout());
		
	close();
	}
	
	

}
