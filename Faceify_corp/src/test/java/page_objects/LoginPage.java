package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	
	public WebDriver driver ;
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="login_email")
	WebElement Email;
	
	@FindBy(id="login_password")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"page-login\"]/div/main/div[2]/div/section[1]/div/div[1]/form/div[2]/button")
	WebElement Login_Button;
	
	
	public void email() 
	{
		Email.sendKeys("admin@r.com");
	}
	public void password() 
	{
		Password.sendKeys("Rnit@123");
	}
	
	public void login_button() 
	{
		Login_Button.click();
	}
	
	
	
	
	

}
