package org.sdpadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.pomadactin.BookHotel;
import org.pomadactin.Booked_Itenrary;
import org.pomadactin.Itenrary;
import org.pomadactin.LoginPage;
import org.pomadactin.SearchPage;
import org.pomadactin.SelectHotel;

public class POM_Manager {
	
	public static WebDriver driver;   //null driver

	//class_name ref = new classname();
	private LoginPage login;
	private SearchPage search;
	private SelectHotel select_hotel;
	private BookHotel book;
	private Itenrary Itn;
	private Booked_Itenrary booked;
	
	//constructor
	public POM_Manager(WebDriver driver2) {
		this.driver=driver2;
		
	}
	
	public LoginPage getLogin() {
		login = new LoginPage(driver); 
		return login;
	}
	public SearchPage getSearch() {
		search = new SearchPage(driver);
		return search;
	}
	public SelectHotel getSelect_hotel() {
		select_hotel = new SelectHotel(driver);
		return select_hotel;
	}
	public BookHotel getBook() {
		book = new BookHotel(driver);
		return book;
	}
	public Itenrary getItn() {
		Itn = new Itenrary(driver);
		return Itn;
	}
	public Booked_Itenrary getBooked() {
		booked = new Booked_Itenrary(driver);
		return booked;
	}
	
	

}
