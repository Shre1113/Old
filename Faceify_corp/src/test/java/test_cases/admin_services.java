package test_cases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import page_objects.HomePage;
import page_objects.Inner_HomePage;
import page_objects.LoginPage;
import test_base.Base;

public class admin_services extends Base

{
@Test
public void admin_serv()
{
	Inner_HomePage IH= new Inner_HomePage(driver);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	
	WebDriverWait WW= new WebDriverWait(driver, Duration.ofSeconds(5000));
	WW.until(ExpectedConditions.titleIs("Admin Services"));
	
	IH.HRMS();
	IH.Admin_serv();
	IH.Employee_Direc();
}
	
}
