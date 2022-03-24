package com.soumili;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_Page {
	WebDriver driver;
	@Test
	public void test_url() {

	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();

	}
	@Test
	public void test_createAccount() throws InterruptedException {
    Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\'signin_info\']/a[2]")).click();	
	}

}
