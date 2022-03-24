package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class BasePage {
	protected static WebDriver driver;
	//public BasePage() {	}
	/*public BasePage(WebDriver driver) {
		super();
		this.driver=driver;
	}*/
	@FindBy(xpath = "//a[@onclick='chkEmpty()']") 
	public WebElement clickNext;
	
	@FindBy(id = "txtFirstName")
	public WebElement firstname;
	
	@FindBy(id = "txtLastName") 
	public WebElement lastname;
	
	@FindBy(id = "txtEmail") 
	public WebElement email;
	
	@FindBy(id = "txtPhone")
	public WebElement phoneNo;
	
	@FindBy(xpath = "//select[@name='size']") 
	public WebElement selectItem;
	
	@FindBy(id = "txtAddress1") 
	public WebElement address1;
	
	@FindBy(id="txtAddress2")
	public WebElement address2;
	
	@FindBy(xpath = "//select[@name='city']") 
	public WebElement selectItemCity;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement selectItemSate;
	
	@FindBys(@FindBy(name="memberStatus"))
	public List<WebElement> radioButton;
	

}
