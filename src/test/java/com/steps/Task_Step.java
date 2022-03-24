package com.steps;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pom.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Task_Step extends BasePage{
	public Task_Step() {	
		PageFactory.initElements(driver, this);
	}
	/*public Task_Step(WebDriver driver) {
		super(driver);
	}*/

	String url="file:///C:/Users/soumi/OneDrive/Desktop/ConferenceRegistartion.html";
	//WebElement email;
	//WebElement phoneNo;
	Alert alert;
	//Before will work before each scenario
	// BeforeAll will work before scenario
	@BeforeAll
	public static void before_All()
	{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	}
	
	@AfterAll
	public static void after_All() {
		driver.quit();
	}
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	    driver.get(url);
	}

	@Then("Verify the title should be {string}")
	public void verify_the_title_should_be(String string) {
	    String actual=driver.getTitle().toString();
	    String expected=string;
	    Assert.assertEquals(expected,actual);
	}

	@Then("User click on the link Next without entering any data in the text box")
	public void user_click_on_the_link_next_without_entering_any_data_in_the_text_box(){
		clickNext.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
	}

	@Then("Verify the alert box displays the message {string}")
	public void verify_the_alert_box_displays_the_message(String string){
	    alert=driver.switchTo().alert();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
	    String expected=string;
	    String actual=driver.switchTo().alert().getText();
	    Assert.assertEquals(expected,actual);
	    alert.accept();
	}

	@Then("Enter the First Name {string}")
	public void enter_the_first_name(String string) {
		//WebElement firstname=driver.findElement(By.id("txtFirstName"));
		firstname.sendKeys("Soumili");
	}

	@Then("Enter the Last Name {string}")
	public void enter_the_last_name(String string) {
		//WebElement lastname=driver.findElement(By.id("txtLastName"));
		lastname.sendKeys(string);
	}

	@Then("User enter wrong format email")
	public void user_enter_wrong_format_email() {
		//email=driver.findElement(By.id("txtEmail"));
		email.sendKeys("soumiligmail.com");
	}

	@Then("User enter valid email address")
	public void user_enter_valid_email_address() {
	    email.clear();
	    email.sendKeys("soumiliroy@gmail.com");
	}

	@Then("User enter wrong data that does not start with either {int} or {int} or {int} and does not have {int} digits")
	public void user_enter_wrong_data_that_does_not_start_with_either_or_or_and_does_not_have_digits(Integer int1, Integer int2, Integer int3, Integer int4) {
	   String number="723";
	   //phoneNo=driver.findElement(By.id("txtPhone"));
	   int len=number.length();
	   char ch=number.charAt(0);
	   if((ch!=int1 || ch!=int2 || ch!=int3)&& (len!=int4))
	   {
		   phoneNo.sendKeys(number);
	   }
	}

	@Then("User enter valid contact number")
	public void user_enter_valid_contact_number() {
		phoneNo.clear();
	    phoneNo.sendKeys("8972811962");
	}

	@Then("User select the no of people attending")
	public void user_select_the_no_of_people_attending() {
		//WebElement selectItem=driver.findElement(By.xpath("//select[@name='size']"));
	     Select select=new Select(selectItem);
	     select.selectByIndex(0);
	}

	@Then("User enter Building & Room No")
	public void user_enter_building_room_no() {
		//WebElement address1=driver.findElement(By.id("txtAddress1"));
		address1.sendKeys("B-101,901");
	}

	@Then("User enter area name")
	public void user_enter_area_name() {
		 //WebElement address2=driver.findElement(By.id("txtAddress2"));
		 address2.sendKeys("Area name");
	}

	@Then("User select the city")
	public void user_select_the_city() {
		 //WebElement selectItemCity=driver.findElement(By.xpath("//select[@name='city']"));
	     Select selectCity=new Select(selectItemCity);
	     selectCity.selectByVisibleText("Pune");
	}

	@Then("User select the state")
	public void user_select_the_state() {
		//WebElement selectItemSate=driver.findElement(By.xpath("//select[@name='state']"));
	     Select selectState=new Select(selectItemSate);
	     selectState.selectByVisibleText("Karnataka");
	}

	@Then("User select the Conference full-Access\\(member) or Select Conference full-Access\\(non-member)")
	public void user_select_the_conference_full_access_member_or_select_conference_full_access_non_member() {
		//List<WebElement> radioButton=driver.findElements(By.name("memberStatus"));
	     radioButton.get(0).click();
	}

	
	@Then("Verify that user navigated to next page {string} by URL")
	public void verify_that_user_navigated_to_next_page_by_url(String string) {
		String currUrl = driver.getCurrentUrl();
		Assert.assertTrue(currUrl.contains(string));
	}

	@Then("Verify the title  {string} of the page")
	public void verify_the_title_of_the_page(String string) {
		String expected=string;
	    String actual=driver.getTitle();
	    Assert.assertEquals(expected,actual);
	}

	
}
