package Atest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Abase.Abase;
import Apage.payment;

public class paymenttest extends Abase {

	
	payment login;
	
	@BeforeMethod
	public void before() throws Exception
	{
		initalizations();
		 login = new payment();
			login.verifyloginamazon();
	}
	
	@Test(priority=1, description="Test for Upi Online Payment")	
	public void Verfiyupitest() throws Exception
	{
		login.verifyaddressandupipayment();
		
	}
	
	@Test(priority=2, description="Test for Net Banking Online Payment")	
	public void Verfiycardtest() throws Exception
	{
		login.verifyaddressandcardpayment();
		
	}
	
	@AfterMethod
	public void after()
	{
		driver.close();
	}
}
