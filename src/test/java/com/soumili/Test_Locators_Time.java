package com.soumili;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Locators_Time {
	WebDriver driver ;
	@BeforeTest
	public void property() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	@Test
	public void testID() {
		driver.findElement(By.id("firstpassword")).sendKeys("hello");
	}
	@Test
	public void testCssLocators() {
		driver.findElement(By.cssSelector("input[id='firstpassword']")).sendKeys("hello");
	}
	@Test
	public void testXpath() {
		driver.findElement(By.xpath("//*[@id=\'firstpassword\']")).sendKeys("hello");
	}


}

