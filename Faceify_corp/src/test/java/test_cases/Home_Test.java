package test_cases;

import org.testng.annotations.Test;

import page_objects.HomePage;
import test_base.Base;

public class Home_Test extends Base
{
	
	
	@Test
	public void login()
	{
		HomePage login_button= new HomePage(driver);
		login_button.log();


	}

}
