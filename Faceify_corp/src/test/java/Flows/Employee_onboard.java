package Flows;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import page_objects.EmployeePage;
import page_objects.HomePage;
import page_objects.Inner_HomePage;
import page_objects.LoginPage;
import page_objects.MyAccountPage;
import page_objects.NewEmployeePage;
import test_base.Base;

public class Employee_onboard extends Base{
	
@Test
	public void EMP_Onbaord() throws InterruptedException, AWTException
{
	HomePage login_button= new HomePage(driver);
	login_button.log();	
	LoginPage Lp= new LoginPage(driver);
	Lp.email();
	Lp.password();
	Lp.login_button();
	Inner_HomePage IH= new Inner_HomePage(driver);
	
	WebDriverWait WW= new WebDriverWait(driver, Duration.ofSeconds(5000));
	WW.until(ExpectedConditions.titleIs("Home"));
	IH.HRMS();
	IH.Admin_serv();
	IH.Employee_Direc();
	EmployeePage EP= new EmployeePage(driver);
	EP.addemployee();
	NewEmployeePage NE= new NewEmployeePage(driver);
	NE.name();
	NE.email();
	NE.gender();
	NE.dob();
	NE.mobile();
	NE.def_shift();
	NE.holiday_list();
	NE.doj();
	NE.status();
	NE.emp_id();
	NE.role();
	NE.company();
	NE.department();
	NE.emp_type();
	NE.designation();
	NE.leave_policy();
	NE.reports_to();
	NE.home_branch();
	NE.emp_branches();
	//NE.save_button();
	//Thread.sleep(5000);
	//NE.user_creation();
	
    //NE.Validation();
                             
}
}
