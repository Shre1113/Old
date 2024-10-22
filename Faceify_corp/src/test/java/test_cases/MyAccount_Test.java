package test_cases;

import org.testng.annotations.Test;

import page_objects.MyAccountPage;
import test_base.Base;

public class MyAccount_Test extends Base
{
@Test
public void My_acc()
{
	MyAccountPage MA= new MyAccountPage(driver);
	  MA.myaccount();
	  MA.switchtodesk();
	
	
	
	
}
}