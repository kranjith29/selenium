package org.sdprunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pomadactin.BookHotel;
import org.pomadactin.Booked_Itenrary;
import org.pomadactin.Itenrary;
import org.pomadactin.LoginPage;
import org.pomadactin.SearchPage;
import org.pomadactin.SelectHotel;
import org.sdpadactin.POM_Manager;

import Demo.Test.AdactinBase;

public class SampleRunnerSDP extends AdactinBase{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/index.php");
		
		POM_Manager pom = new POM_Manager(driver);
		
//Login Page:1
		SendKeys(pom.getLogin().getUserName(),"kranjithk2930");
		SendKeys(pom.getLogin().getPwd(),"Chennai@2021");
		click(pom.getLogin().getLogin());
		
//Search Hotel: 2
		
		dropdown(pom.getSearch().getLocation(),"byvisibletext","Brisbane");
		dropdown(pom.getSearch().getHotels(),"byvalue","Hotel Cornice");
		dropdown(pom.getSearch().getRoomType(),"byindex","4");
		dropdown(pom.getSearch().getNo_of_Rooms(),"byvalue","2");
		
		SendKeys(pom.getSearch().getCheckIn(),"13/11/2021");
		SendKeys(pom.getSearch().getCheckOut(),"15/11/2021");
		
		dropdown(pom.getSearch().getAdultPerRoom(),"byvalue","4");
		dropdown(pom.getSearch().getChildremPerRoom(),"byvalue","2");
		
		click(pom.getSearch().getSearch());
		
		//WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		//dropdown(location,"byvisibletext","Brisbane");
		//WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		//dropdown(hotels,"byvalue","Hotel Cornice");
		//WebElement room_type = driver.findElement(By.xpath("//select[@id='room_type']"));
		//dropdown(room_type,"byindex","4");
		//WebElement no_of_rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		//dropdown(no_of_rooms,"byvalue","2");
		
		//WebElement check_in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		//SendKeys(check_in,"13/11/2021");
		//WebElement check_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		//SendKeys(check_out,"15/11/2021");

		//WebElement adults_per_room = driver.findElement(By.xpath("//select[@id='adult_room']"));
		//dropdown(adults_per_room,"byvalue","4");
		//WebElement children_per_room = driver.findElement(By.xpath("//select[@id='child_room']"));
		//dropdown(children_per_room,"byvalue","2");
		
		//WebElement search_button = driver.findElement(By.xpath("//input[@id='Submit']"));
		//click(search_button);

//Select Hotel: 3	
		SelectHotel hotel = new SelectHotel(driver);
		click(hotel.getButton1());
		click(hotel.getCont());
		
		//WebElement button_1 = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		//click(button_1);
		//WebElement continue_1 = driver.findElement(By.xpath("//input[@id='continue']"));
		//click(continue_1);
//Book A Hotel: 4	
		
		BookHotel book_hotel = new BookHotel(driver);
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
		
		
//		WebElement first_name = driver.findElement(By.xpath("//input[@id='first_name']"));
//		SendKeys(first_name,"Ranjith Kumar");
//		WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
//		SendKeys(last_name,"Kalyani");
//		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
//		SendKeys(address,"W-8, D-36, Azhagar street, Chennai");
//		WebElement cc_num = driver.findElement(By.xpath("//input[@id='cc_num']"));
//		SendKeys(cc_num,"4567123487651234");
//		WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
//		dropdown(cc_type,"byvisibletext","VISA");
//		WebElement cc_exp_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
//		dropdown(cc_exp_month,"byvisibletext","July");
//		WebElement cc_exp_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
//		dropdown(cc_exp_year,"byvisibletext","2021");
//		WebElement cc_cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
//		SendKeys(cc_cvv,"123");
//		WebElement book_now = driver.findElement(By.xpath("//input[@id='book_now']"));
//		click(book_now);
//		Thread.sleep(5000);

//Booking Confirmation: 5
		Itenrary confirm = new Itenrary(driver);
		click(confirm.getMy_Itenrary());
		
		
		//WebElement itinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		//click(itinerary);
		
	
//Booked Itinerary: 6
		Booked_Itenrary booked = new Booked_Itenrary(driver);
		click(booked.getCheck_Box());
		click(booked.getLogout());
		
		//WebElement check_box = driver.findElement(By.xpath("//input[@id='check_all']"));
		//click(check_box);
		//WebElement cancel_all = driver.findElement(By.xpath("//input[@name='cancelall']"));
		//click(cancel_all);
		//WebElement search_hotel = driver.findElement(By.xpath("//input[@id='search_hotel']"));
		//click(search_hotel);
		//WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		//click(logout);

		close();
	}



}
