package com.soumili;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium_Grid_Multiple_Node {

	public static void main(String[] args) throws MalformedURLException {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		
		ChromeOptions chromeOptions=new ChromeOptions();
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
		driver.get("https://www.google.com");

		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.click();
		searchBox.sendKeys("Selenium");
		searchBox.sendKeys(Keys.ENTER);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
		
		WebElement images=driver.findElements(By.linkText("Images")).get(0);
        images.click();
        
        WebElement clickFirstImage=driver.findElements(By.cssSelector("img[class='rg_i Q4LuWd']")).get(0);//Customize Cssselector
        clickFirstImage.click();

	}

}
