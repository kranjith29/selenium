package org.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

public static WebDriver driver; //--> null driver	

@FindBy(xpath="//input[@id='radiobutton_0']")
private WebElement button1;

@FindBy(xpath="//input[@id='continue']")
private WebElement cont;

//constructor
public SelectHotel(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getButton1() {
	return button1;
}

public WebElement getCont() {
	return cont;
}



}
