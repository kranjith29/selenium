package org.sdpadactin;

import org.openqa.selenium.WebDriver;
import org.pomadactin.BookHotel;
import org.pomadactin.Booked_Itenrary;
import org.pomadactin.Itenrary;
import org.pomadactin.LoginPage;
import org.pomadactin.SearchPage;
import org.pomadactin.SelectHotel;

public class Page_object_manager {
	public static WebDriver driver;
	
	public Page_object_manager(WebDriver driver2) {
		this.driver=driver2;
	}
	private LoginPage login;
	private SearchPage search;
	private SelectHotel select;
	private BookHotel book;
	private Booked_Itenrary booked;
	private Itenrary itn;

	public LoginPage getLogin() {
		login = new LoginPage(driver);
		return login;
	}
	public SearchPage getSearch() {
		search = new SearchPage(driver);
		return search;
	}
	public SelectHotel getSelect() {
		select = new SelectHotel(driver);
		return select;
	}
	public BookHotel getBook() {
		book = new BookHotel(driver);
		return book;
	}
	public Itenrary getItn() {
		itn=new Itenrary(driver);
		return itn;
	}
	public Booked_Itenrary getBooked() {
		booked=new Booked_Itenrary(driver);
		return booked;
	}


}
