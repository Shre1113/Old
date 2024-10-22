package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(css="a.nav-link nav-avatar")
	WebElement MyAccount;
	
	@FindBy(linkText="Switch To Desk")
	WebElement SwitchToDesk;
	
	public void myaccount()
	{
		MyAccount.click();
	}
	
	public void switchtodesk()
	{
		SwitchToDesk.click();
	}
	
}
