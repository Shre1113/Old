package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePage extends BasePage
{
    public WebDriver driver;
	public EmployeePage(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(css="button[data-label='Add Employee']")
    WebElement Add_Employee_button;
	
	public void addemployee()
	{
		Add_Employee_button.click();
	}
}
