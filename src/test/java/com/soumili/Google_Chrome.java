package com.soumili;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.click();
		searchBox.sendKeys("Selenium");
		searchBox.sendKeys(Keys.ENTER);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
		
		WebElement images=driver.findElements(By.linkText("Images")).get(0);
        images.click();
        
        WebElement clickFirstImage=driver.findElements(By.cssSelector("img[class='rg_i Q4LuWd']")).get(0);//Customize Cssselector
        clickFirstImage.click();
        
        //Radio Button
        driver.get("file:///C:/Users/soumi/eclipse-workspace_self-learning/Selenium_1/HTML_Files/RadioButton_File.html");
        List<WebElement> radioButton=driver.findElements(By.name("color"));
        radioButton.get(1).click();
        
        for(WebElement buttons:radioButton)
        {
        	if(buttons.isSelected())
        	{
        		System.out.println(buttons.getAttribute("value"));
        	}
        }
        
        //CheckBoxes
        driver.get("file:///C:/Users/soumi/eclipse-workspace_self-learning/Selenium_1/HTML_Files/CheckBoxes.html");
        WebElement checkbox=driver.findElement(By.id("mayoCheckbox"));
        checkbox.click();
        
        //Select Item
        driver.get("file:///C:/Users/soumi/eclipse-workspace_self-learning/Selenium_1/HTML_Files/SelectItem.html");
        WebElement selectItem=driver.findElement(By.id("select1"));
        Select select=new Select(selectItem);
        select.selectByVisibleText("No");
        
        //Tables
        driver.get("file:///C:/Users/soumi/eclipse-workspace_self-learning/Selenium_1/HTML_Files/Tables.html");
        WebElement outerTable=driver.findElement(By.tagName("table"));
        WebElement innerTable=outerTable.findElement(By.tagName("table"));
        WebElement row=innerTable.findElements(By.tagName("td")).get(1);
        System.out.println(row.getText());
        
        ///html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td-->Absolute xpath
        
        //Explicit wait
        
        
	}

}
