package org.sdprunner;

import org.openqa.selenium.WebDriver;
import org.pomadactin.BookHotel;
import org.pomadactin.Booked_Itenrary;
import org.pomadactin.Itenrary;
import org.pomadactin.LoginPage;
import org.pomadactin.SearchPage;
import org.pomadactin.SelectHotel;

import Demo.Test.AdactinBase;

public class FinalAdactiveRunner extends AdactinBase{
	//public static WebDriver driver;
	public static WebDriver driver =browserLaunch("chrome");
	public static LoginPage login = new LoginPage(driver);
	public static SearchPage Search = new SearchPage(driver);
	public static SelectHotel hotel = new SelectHotel(driver);
	public static BookHotel book_hotel = new BookHotel(driver);
	public static Itenrary confirm = new Itenrary(driver);
	public static Booked_Itenrary booked = new Booked_Itenrary(driver);
	
	public static void main(String[] args) throws InterruptedException {
		//driver =browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/index.php");
//Login Page:1
		//LoginPage login = new LoginPage(driver);
		SendKeys(login.getUserName(),"kranjithk2930");
		SendKeys(login.getPwd(),"Chennai@2021");	
		click(login.getLogin());
//Search Hotel: 2
//		SearchPage Search = new SearchPage(driver);
		dropdown(Search.getLocation(),"byvisibletext","Brisbane");
		dropdown(Search.getHotels(),"byvalue","Hotel Cornice");
		dropdown(Search.getRoomType(),"byindex","4");
		dropdown(Search.getNo_of_Rooms(),"byvalue","2");
		SendKeys(Search.getCheckIn(),"13/11/2021");
		SendKeys(Search.getCheckOut(),"15/11/2021");
		dropdown(Search.getAdultPerRoom(),"byvalue","4");
		dropdown(Search.getChildremPerRoom(),"byvalue","2");
		click(Search.getSearch());
//Select Hotel: 3	
//		SelectHotel hotel = new SelectHotel(driver);
		click(hotel.getButton1());
		click(hotel.getCont());
//Book A Hotel: 4	
//		BookHotel book_hotel = new BookHotel(driver);
		SendKeys(book_hotel.getFirstName(),"Ranjith Kumar");
		SendKeys(book_hotel.getLastName(),"Kalyani");
    	SendKeys(book_hotel.getAddress(),"W-8, D-36, Azhagar street, Chennai");
		SendKeys(book_hotel.getCc(),"4567123487651234");
		dropdown(book_hotel.getCcType(),"byvisibletext","VISA");
		dropdown(book_hotel.getExpiryMonth(),"byvisibletext","July");
		dropdown(book_hotel.getExpiryYear(),"byvisibletext","2021");
		SendKeys(book_hotel.getCvv(),"123");
		click(book_hotel.getBookNow());
		Thread.sleep(5000);				
//Booking Confirmation: 5
//		Itenrary confirm = new Itenrary(driver);
		click(confirm.getMy_Itenrary());
//Booked Itinerary: 6
//		Booked_Itenrary booked = new Booked_Itenrary(driver);
		click(booked.getCheck_Box());
		Thread.sleep(3000);
		click(booked.getLogout());
		
	close();
	}

}
