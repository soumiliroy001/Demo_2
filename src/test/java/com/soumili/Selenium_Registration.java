package com.soumili;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Registration {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="http://demo.automationtesting.in/Register.html";
		driver.get(url);

		//Instead of using sendKeys we can use JavascriptExecuter to give values
		JavascriptExecutor je = ((JavascriptExecutor)driver);        	
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		je.executeScript("arguments[0].value='Soumili';", fname);

		WebElement lname=driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"));
		je.executeScript("arguments[0].value='Roy';", lname);

		WebElement address=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
		je.executeScript("arguments[0].value='Address';", address);

		WebElement email=driver.findElement(By.xpath("//*[@id='eid']/input"));
		je.executeScript("arguments[0].value='Email';", email);

		WebElement phone=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));
		phone.sendKeys("8972811962");

		WebElement gender=driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[5]/div"));
		List<WebElement> genderList=gender.findElements(By.name("radiooptions"));
		genderList.get(0).click();

		WebElement hobbies=driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[6]/div"));
		//List<WebElement> hobbiesList=hobbies.findElements(By.xpath("//input[@type=\'checkbox\']"));
		List<WebElement> hobbiesList=hobbies.findElements(By.tagName("input"));
		hobbiesList.get(0).click();


		//Find All Links
		//driver.findElement(By.id("msdd")).click();
		WebElement e1=driver.findElement(By.xpath("//div[@id='msdd']"));
		e1.click();

		//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']-->xpath
		WebElement e2=driver.findElement(By.cssSelector("ul[class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		List<WebElement> list=e2.findElements(By.tagName("a"));
		int count=list.size();
		System.out.println(count);
		for(WebElement e3:list)
		{
			if(e3.getText().equalsIgnoreCase("Arabic"))
			{
				e3.click();
			}
		}

		//Choose File
		WebElement chooseFile=driver.findElement(By.id("imagesrc"));
		chooseFile.sendKeys("C:\\Users\\soumi\\OneDrive\\Desktop\\1639662149873.jpg");

		//Date Picker
		//WebElement datePicker=driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[5]/a"));
		/*WebElement datePicker=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a"));
		datePicker.click();
		driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[5]/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("//img[@class='imgdp']")).click();*/

		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		WebElement month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]"));
		WebElement monthNext=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span"));

		if(!(month.getText().equals("May")))
		{
			monthNext.click();
		}

	}

}
