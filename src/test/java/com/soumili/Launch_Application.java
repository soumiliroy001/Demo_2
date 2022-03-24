package com.soumili;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Launch_Application {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("file:///C:/Users/soumi/OneDrive/Desktop/ConferenceRegistartion.html");
		 WebElement conferenceRegistration=driver.findElement(By.xpath("/html/body/h2"));
		 String actualTitle=conferenceRegistration.getText();
		 String expectedTitle="Conference Registration";
		 if(actualTitle.equals(expectedTitle))
		 {
			 System.out.println("Title matched");
		 }
		 else
		 {
			 System.out.println("Not matched");
		 }
		 WebElement clickNext=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a"));
		 clickNext.click();
		 Thread.sleep(2000);
		 Alert popUp=driver.switchTo().alert();
		 popUp.accept();
		 WebElement firstname=driver.findElement(By.id("txtFirstName"));
		 firstname.sendKeys("Soumili");
		 
		 clickNext.click();
		 Thread.sleep(2000);
		 popUp.accept();
		 WebElement lastname=driver.findElement(By.id("txtLastName"));
		 lastname.sendKeys("Roy");
		 
		 WebElement email=driver.findElement(By.id("txtEmail"));
		 email.sendKeys("soumili@gmail.com");
		 clickNext.click();
		 Thread.sleep(2000);
		 popUp.accept();
		 
		 WebElement phoneNo=driver.findElement(By.id("txtPhone"));
		 phoneNo.sendKeys("8972811962");
		 //phoneNo.sendKeys("123");
		 clickNext.click();
		 Thread.sleep(2000);
		 popUp.accept();
		 
		 WebElement selectItem=driver.findElement(By.xpath("//select[@name='size']"));
	     Select select=new Select(selectItem);
	     select.selectByIndex(0);
	     clickNext.click();
		 Thread.sleep(2000);
		 popUp.accept();
		 
		 WebElement address1=driver.findElement(By.id("txtAddress1"));
		 address1.sendKeys("B-101,901");
		 clickNext.click();
		 Thread.sleep(2000);
		 popUp.accept();
		 
		 WebElement address2=driver.findElement(By.id("txtAddress2"));
		 address2.sendKeys("Area name");
		 clickNext.click();
		 Thread.sleep(2000);
		 popUp.accept();
		 
		 WebElement selectItemCity=driver.findElement(By.xpath("//select[@name='city']"));
	     Select selectCity=new Select(selectItemCity);
	     selectCity.selectByVisibleText("Pune");
	     clickNext.click();
		 Thread.sleep(2000);
		 popUp.accept();
		 
		 WebElement selectItemSate=driver.findElement(By.xpath("//select[@name='state']"));
	     Select selectState=new Select(selectItemSate);
	     selectState.selectByVisibleText("Karnataka");
	     clickNext.click();
		 Thread.sleep(2000);
		 popUp.accept();
		 
		 List<WebElement> radioButton=driver.findElements(By.name("memberStatus"));
	     radioButton.get(1).click();
	     
	     clickNext.click();
		 Thread.sleep(2000);
		 String alertMessage=driver.switchTo().alert().getText();
	     System.out.println(alertMessage);
	     popUp.accept();
		 WebElement paymentDetails=driver.findElement(By.xpath("/html/body/h4"));
		 String actualTitlepaymentDetails=paymentDetails.getText();
		 String expectedTitlepaymentDetails="Step 2: Payment Details";
		 if(actualTitlepaymentDetails.equals(expectedTitlepaymentDetails))
		 {
			 System.out.println("Title matched");
		 }
		 else
		 {
			 System.out.println("Not matched");
		 }
		 
		 Thread.sleep(1000);
		 driver.navigate().back();
		 WebElement personalDetails=driver.findElement(By.xpath("/html/body/h4"));
		 String actualTitlepersonalDetails=personalDetails.getText();
		 String expectedTitlepersonalDetails="Step 1: Personal Details";
		 if(actualTitlepersonalDetails.equals(expectedTitlepersonalDetails))
		 {
			 System.out.println("Title matched");
		 }
		 else
		 {
			 System.out.println("Not matched");
		 }
		 
		 driver.navigate().forward();
		 
		 WebElement clickRegister=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[7]/td/input"));
		 clickRegister.click();
		 Thread.sleep(2000);
		 Alert register=driver.switchTo().alert();
		 register.accept();
		 WebElement fname=driver.findElement(By.id("txtFirstName"));
		 fname.sendKeys("Soumili");
		 
		 clickRegister.click();
		 Thread.sleep(2000);
		 register.accept();
		 WebElement lname=driver.findElement(By.id("txtLastName"));
		 lname.sendKeys("Roy");
		 
		 clickRegister.click();
		 Thread.sleep(2000);
		 register.accept();
		 WebElement debitno=driver.findElement(By.id("txtDebit"));
		 debitno.sendKeys("900876543246809");
		 
		 clickRegister.click();
		 Thread.sleep(2000);
		 register.accept();
		 WebElement cvv=driver.findElement(By.id("txtCvv"));
		 cvv.sendKeys("900");
		 
		 clickRegister.click();
		 Thread.sleep(2000);
		 register.accept();
		 WebElement expirationMonth=driver.findElement(By.id("txtMonth"));
		 expirationMonth.sendKeys("09");
		 
		 clickRegister.click();
		 Thread.sleep(2000);
		 register.accept();
		 WebElement expirationYear=driver.findElement(By.id("txtYear"));
		 expirationYear.sendKeys("2023");
		 
		 clickRegister.click();
		 Thread.sleep(2000);
		 String alertMessage1=driver.switchTo().alert().getText();
	     System.out.println(alertMessage1);
		 register.accept();
		 
		 driver.close();
		 
		 

	}

}
