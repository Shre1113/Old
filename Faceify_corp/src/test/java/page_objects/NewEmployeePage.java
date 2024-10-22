package page_objects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewEmployeePage extends BasePage{
    public WebDriver driver;
    
	public NewEmployeePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="(//input[contains(@type,'text')])[7]")
	WebElement FirstName;
	@FindBy(xpath="//div[contains(@data-fieldname,'middle_name')]//input[contains(@type,'text')]")
	WebElement MiddleName;
	@FindBy(xpath="//div[contains(@data-fieldname,'last_name')]//input[contains(@type,'text')]")
	WebElement LastName;
	@FindBy(xpath="//div[contains(@data-fieldname,'company_email')]//input[contains(@type,'text')]")
	WebElement Email;
	@FindBy(xpath="//div[@data-fieldname='gender']//input[@role='combobox']")
	WebElement Gender;
	@FindBy(xpath="//input[contains(@data-fieldname,'date_of_birth')]")
	WebElement DOB;
	@FindBy(xpath="//div[contains(@data-fieldname,'cell_number')]//input[contains(@type,'text')]")
	WebElement Mobile_Number;
	@FindBy(xpath="//div[@data-fieldname='default_shift']//input[@role='combobox']")
	WebElement Default_Shift;
	@FindBy(xpath="//div[@data-fieldname='holiday_list']//input[@role='combobox']")
	WebElement Holiday_Shift;
	@FindBy(xpath="//input[contains(@data-fieldname,'date_of_joining')]")
	WebElement DOJ;
	@FindBy(xpath="(//select[contains(@type,'text')])[2]")
	WebElement Status;
	@FindBy(xpath="//div[contains(@data-fieldname,'employee_id')]//input[contains(@type,'text')]")
	WebElement Emp_id;
	@FindBy(xpath="//div[@data-fieldname='role_profile']//input[@role='combobox']")
	WebElement Role;
	@FindBy(xpath="//div[@data-fieldname='company']//input[@role='combobox']")
	WebElement Company;
	@FindBy(xpath="//div[contains(@data-fieldname,'department')]//div[contains(@class,'form-group')]//input[contains(@role,'combobox')]")
	WebElement Department;
	@FindBy(xpath="//div[@data-fieldname='employment_type']//input[@role='combobox']")
	WebElement Emp_Type;
	@FindBy(xpath="//div[@data-fieldname='designation']//input[@role='combobox']")
	WebElement Designation;
	@FindBy(xpath="//div[@data-fieldname='leave_policy']//input[@role='combobox']")
	WebElement Leave_Policy;
	@FindBy(xpath="//div[@data-fieldname='reports_to']//input[@role='combobox']")
	WebElement Reports_to;
	@FindBy(xpath="//div[@data-fieldname='branch']//input[@role='combobox']")
	WebElement Home_Branch;
	@FindBy(xpath="//input[@data-fieldtype='Table MultiSelect']")
	WebElement Emp_Branches;
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement Save;
	@FindBy(xpath="//button[normalize-space()='Create Users']")
	WebElement Create_User;
	
	public void name()
	{
		FirstName.sendKeys("Jack");
		MiddleName.sendKeys("A");
		LastName.sendKeys("C");
	}
	
	public void email()
	{
		Email.sendKeys("Jack.Man@gmail.com");
	}
	public void gender()
	{
		Gender.sendKeys("Male");
	}
	public void dob() throws InterruptedException
	{
		DOB.sendKeys("01-03-2024");
		
		//Emp_Branches.sendKeys(Keys.ENTER);
	}
	public void mobile()
	{
		Mobile_Number.sendKeys("6787087865");
	}
	public void def_shift() throws InterruptedException
	{
		Default_Shift.sendKeys("General");
		Thread.sleep(2000);
		Default_Shift.sendKeys(Keys.ENTER);
	}
	public void holiday_list()
	{
		Holiday_Shift.sendKeys("2024_holiday_list");
	}
	public void doj() throws InterruptedException
	{
		DOJ.sendKeys("01-02-1997");
		Thread.sleep(5000);
		//Emp_Branches.sendKeys(Keys.ENTER);

	}
	public void status()
	{
		Status.sendKeys("Active");
	}
    public void emp_id()
    {
    	Emp_id.sendKeys("JAC_02");
    }
    public void role()
    {
    	Role.sendKeys("Manager");
    }
    public void company() throws InterruptedException
    {
    	Company.sendKeys(Keys.ENTER);
    	//Robot keys= new Robot();
    	//keys.keyPress(KeyEvent.VK_ENTER);
    	
    }
    public void department()
    {
    	Department.sendKeys("Sales");
    	Emp_Branches.sendKeys(Keys.ENTER);
    }
    public void emp_type()
    {
    	Emp_Type.sendKeys("Apprentice");
    }
    public void designation()
    {
    	Designation.sendKeys("Administrative Assistant");
    }
    public void leave_policy()
    {
    	Leave_Policy.sendKeys("HR-LPOL-2024-00001");
    }
    public void reports_to()
    {
    	Reports_to.sendKeys("EMP-Rnit-000003");
    }
    public void home_branch()
    {
    	Home_Branch.sendKeys("Head Office");
    }
    public void emp_branches()
    {
    	
    	Emp_Branches.sendKeys("Head Office");
    	Emp_Branches.sendKeys(Keys.ENTER);

    	//Thread.sleep(1000);
    	//Emp_Branches.sendKeys("Kondapur Branch");
    	//Emp_Branches.sendKeys(Keys.ENTER);
    }
    public void save_button()
    {
    	Save.click();
    }
    public void user_creation()
    {
    	Create_User.click();
    }
    public void Validation()
    {
    	String title=driver.getTitle();
    
    if(title.contains(FirstName.getText()))
    {
    	System.out.println("employee created");
    }
    else
    {
    	System.out.println("employee not created");
    	
}
}
}	
	

