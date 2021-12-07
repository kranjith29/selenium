package org.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Username; Password; Login


public class LoginPage {
	
public WebDriver driver; //---> null driver 

//driver.findElemet(By.locator("detail"));
@FindBy(xpath="//input[@id='username']")
private WebElement userName;

@FindBy(id="password")
private WebElement pwd;

@FindBy(id="login")
private WebElement login;

public WebElement getLogin() {
	return login;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getUserName() {
	return userName;
}

//constructor
public LoginPage(WebDriver driver2) {  
	this.driver=driver2;  //driver2 is chrome which is take the value from runner class
	PageFactory.initElements(driver, this);
}




}








/*
 public WebDriver driver;   //Intially Nulll

//Constructor
public LoginPage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath="//input[@id='username']")	
private WebElement Username;

@FindBy(xpath="//input[@id='password']")
private WebElement Password;

@FindBy(xpath="//input[@id='login']")
private WebElement Login;


public WebElement getUsername() {
	return Username;
}
public WebElement getPassword() {
	return Password;
}
public WebElement getLogin() {
	return Login;
}
*/
