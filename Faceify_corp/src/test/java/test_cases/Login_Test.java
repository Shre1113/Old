package test_cases;

import org.testng.annotations.Test;

import page_objects.HomePage;
import page_objects.LoginPage;
import test_base.Base;

public class Login_Test extends Base
{

@Test
public void Login_page() 
   {
	
    LoginPage Lp= new LoginPage(driver);
	Lp.email();
	Lp.password();
	Lp.login_button();

  }


}