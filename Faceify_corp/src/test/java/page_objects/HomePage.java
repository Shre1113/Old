package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(linkText="Login")
	WebElement login;

	
	public void log()
	{
		login.click();
	}
	
}