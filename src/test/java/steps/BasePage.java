/**
 * 
 */
package steps;

import org.openqa.selenium.WebDriver;

/**
 * @author amarendra.kumar
 *
 */
public class BasePage {
	public static WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver = driver;// calling web driver
	}

}
