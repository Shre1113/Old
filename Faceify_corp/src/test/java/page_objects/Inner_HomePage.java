package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inner_HomePage extends BasePage
{

	public Inner_HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
           @FindBy(xpath="//button[@class='btn-reset drop-icon show-in-edit-mode']")
           WebElement HRMS_drops;
           
           @FindBy(css="a[title='Admin Services']")
           WebElement Admin_Services;
           
           @FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div/div/div[1]/div[1]/div[1]/span")
           WebElement Employee_Directory;
           public void HRMS()
           {
        	   HRMS_drops.click();
           }
           public void Admin_serv()
           {
        	   Admin_Services.click();
           }
           public void Employee_Direc()
           {
        	   Employee_Directory.click();
           }
           
}
