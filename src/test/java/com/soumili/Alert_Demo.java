package com.soumili;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alertOK=driver.switchTo().alert();
        // Capturing alert message.    
        String alertMessage1= driver.switchTo().alert().getText();	
        System.out.println(alertMessage1);
        alertOK.accept();
        
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
        Alert alertOkAndCancel=driver.switchTo().alert();
        String alertMessage2=driver.switchTo().alert().getText();
        System.out.println(alertMessage2);
        driver.switchTo().alert().dismiss();
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert alertTextBox=driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("Text");
        alertTextBox.accept();
        
        
	}
		

}
