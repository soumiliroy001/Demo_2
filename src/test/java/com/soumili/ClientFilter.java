package com.soumili;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps.BasePage;

public class ClientFilter extends BasePage{

		public ClientFilter(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		//actions = new Actions(driver);
	}
public static void main(String[] args)
{
		/*driver.findElements(By.id("iconsize")).get(2).click();
		driver.findElement(By.xpath("//*[@id='viewStakeholder_stakeholderData_detailsContainer']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='viewStakeholder_filterBtn']")).click();*/
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com");
}
		
	}	