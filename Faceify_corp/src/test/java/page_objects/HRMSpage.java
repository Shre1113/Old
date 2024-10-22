package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HRMSpage extends BasePage 
{
    WebDriver driver;
	HRMSpage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(css="button.btn-reset drop-icon show-in-edit-mode")
	WebElement HRMS_dropButton;
	

}
