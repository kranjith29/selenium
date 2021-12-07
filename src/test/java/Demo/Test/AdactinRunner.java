package Demo.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinRunner extends AdactinBase{
	
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/index.php");
		WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		SendKeys(username,"kranjithk2930");
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		SendKeys(password,"Chennai@2021");
		WebElement click = driver.findElement(By.xpath("//input[@id='login']"));
		click(click);
//Search Hotel 		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		dropdown(location,"byvisibletext","Brisbane");
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		dropdown(hotels,"byvalue","Hotel Cornice");
		WebElement room_type = driver.findElement(By.xpath("//select[@id='room_type']"));
		dropdown(room_type,"byindex","4");
		WebElement no_of_rooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		dropdown(no_of_rooms,"byvalue","2");
		
		WebElement check_in = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		SendKeys(check_in,"13/11/2021");
		WebElement check_out = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		SendKeys(check_out,"15/11/2021");
		
		WebElement adults_per_room = driver.findElement(By.xpath("//select[@id='adult_room']"));
		dropdown(adults_per_room,"byvalue","4");
		WebElement children_per_room = driver.findElement(By.xpath("//select[@id='child_room']"));
		dropdown(children_per_room,"byvalue","2");
		
		WebElement search_button = driver.findElement(By.xpath("//input[@id='Submit']"));
		click(search_button);
//Select Hotel		
		WebElement button_1 = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		click(button_1);
		WebElement continue_1 = driver.findElement(By.xpath("//input[@id='continue']"));
		click(continue_1);
//Book A Hotel		
		WebElement first_name = driver.findElement(By.xpath("//input[@id='first_name']"));
		SendKeys(first_name,"Ranjith Kumar");
		WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
		SendKeys(last_name,"Kalyani");
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		SendKeys(address,"W-8, D-36, Azhagar street, Chennai");
		WebElement cc_num = driver.findElement(By.xpath("//input[@id='cc_num']"));
		SendKeys(cc_num,"4567123487651234");
		WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		dropdown(cc_type,"byvisibletext","VISA");
		WebElement cc_exp_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		dropdown(cc_exp_month,"byvisibletext","July");
		WebElement cc_exp_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		dropdown(cc_exp_year,"byvisibletext","2021");
		WebElement cc_cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		SendKeys(cc_cvv,"123");
		WebElement book_now = driver.findElement(By.xpath("//input[@id='book_now']"));
		click(book_now);
		Thread.sleep(5000);
//Booking Confirmation
		WebElement itinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		click(itinerary);
		
	
//Booked Itinerary
		WebElement check_box = driver.findElement(By.xpath("//input[@id='check_all']"));
		click(check_box);
		//WebElement cancel_all = driver.findElement(By.xpath("//input[@name='cancelall']"));
		//click(cancel_all);
		//WebElement search_hotel = driver.findElement(By.xpath("//input[@id='search_hotel']"));
		//click(search_hotel);
		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		click(logout);

		close();
	}

}
