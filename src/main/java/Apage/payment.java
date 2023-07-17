package Apage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Abase.Abase;

public class payment extends Abase {

	@FindBy(xpath="//input[@id='account_email']") private WebElement login;
	@FindBy(xpath="//input[@id='account_password']") private WebElement password;
	@FindBy(xpath="//input[@value='SIGN IN']") private WebElement singninsubmit;
	@FindBy(xpath="//a[@class='menu-link'][normalize-space()='Lehengas']") private WebElement product;
	@FindBy(xpath="//span[normalize-space()='Light burgundy coloured semi']") private WebElement buyproduct;
	@FindBy(xpath="//a[@id='3720907']//div[@class='buy_this_now_button']") private WebElement addtocard;
	@FindBy(xpath="//a[@id='checkout']") private WebElement checkout;
	@FindBy(xpath="//input[@id='order_billing_first_name']") private WebElement fname;
	@FindBy(xpath="//input[@id='order_billing_last_name']") private WebElement lname;
	@FindBy(xpath="//input[@id='order_billing_email']") private WebElement email;
	@FindBy(xpath="//input[@id='order_billing_pincode']") private WebElement pincode;
	@FindBy(xpath="//input[@id='order_billing_street_line_1']") private WebElement add1;	
	@FindBy(xpath="//input[@id='order_billing_street_line_2']") private WebElement add2;
	@FindBy(xpath="//input[@id='order_billing_city']") private WebElement city;	
	@FindBy(xpath="//input[@id='order[billing_state]']") private WebElement selectstate;	
	@FindBy(xpath="//input[@id='order_billing_phone']") private WebElement phone;
	@FindBy(xpath="//input[@name='commit']") private WebElement placeorder;	
	@FindBy(xpath="//span[text()='UPI']") private WebElement upi;
	@FindBy(xpath="//span[normalize-space()='PhonePe']") private WebElement phonepay;
	@FindBy(xpath="//input[@id='upi2Id']") private WebElement upiid;
	@FindBy(xpath="//button[@id='upi-verify-enabled']") private WebElement upicontinue;
	@FindBy(xpath="//button[@id='procceed-upi-enabled']") private WebElement upicontinue1;
	@FindBy(xpath="//span[text()='Cards (Credit/Debit)']") private WebElement card;	
	@FindBy(xpath="//input[@name='cardNumber']") private WebElement cardnumber;	
	@FindBy(xpath="//input[@id='cardExpiry']") private WebElement cardexp;	
	@FindBy(xpath="//input[@id='cardCvv']") private WebElement cvv;
	@FindBy(xpath="//input[@id='cardOwnerName']") private WebElement cardname;	
	@FindBy(xpath="//button[@type='submit']//div") private WebElement cardclick;
	@FindBy(xpath="//button[text()='Save and Continue']") private WebElement save;
	
	//pagefactory
	public payment()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyloginamazon() throws Exception
	{

		login.sendKeys("nikhilesh2060@gmail.com");
		password.sendKeys("Nikhilesh@123");
		singninsubmit.click();
		Thread.sleep(2000);
		product.click();
		Thread.sleep(2000);
		buyproduct.click();
		Thread.sleep(2000);
		addtocard.click();
		Thread.sleep(2000);
		checkout.click();
	}
	
	public void verifyaddressandupipayment() throws Exception
	{
		
		fname.sendKeys("nikhilesh");
	;
		lname.sendKeys("khetmalis");
	
		email.sendKeys("nikhilesh2060@gmail.com");
		Thread.sleep(3000);
		pincode.sendKeys("411038");
		Thread.sleep(3000);
		add1.sendKeys("721,anand nagar ");

		add2.sendKeys("721,anand nagar ");
//		Thread.sleep(3000);
//		city.sendKeys("pune");
//		Thread.sleep(3000);
//		Select d = new Select(selectstate);
//		d.selectByVisibleText("Maharashtra");
	//	Thread.sleep(3000);
		phone.sendKeys("8983444897");
		placeorder.click();
		Thread.sleep(3000);
		new Actions(driver).click(upi).perform();
		
//		Actions g = new Actions(driver);
//		g.moveToElement(upi).doubleClick().build().perform();
//	     g.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		phonepay.click();
		Thread.sleep(5000);
		upiid.sendKeys("nikhilesh007@ybl");
		Thread.sleep(5000);
		upicontinue.click();
		Thread.sleep(5000);
		upicontinue1.click();
		Thread.sleep(5000);
		
	}
	public void verifyaddressandcardpayment() throws Exception
	{

		fname.sendKeys("nikhilesh");
		
		lname.sendKeys("khetmalis");
	
		email.sendKeys("nikhilesh2060@gmail.com");
		Thread.sleep(3000);
		pincode.sendKeys("411038");
		Thread.sleep(3000);
		add1.sendKeys("721,anand nagar ");
	
		add2.sendKeys("721,anand nagar ");

		phone.sendKeys("8983444897");
		placeorder.click();
		Thread.sleep(3000);
		new Actions(driver).click(card).perform();
		Thread.sleep(3000);
		Actions performAct = new Actions(driver); 
		performAct.sendKeys(cardnumber, "4263982640269299").build().perform(); 

		Thread.sleep(3000);
		cardexp.sendKeys("0226");
		Thread.sleep(3000);
		cvv.sendKeys("887");
		Thread.sleep(3000);
		cardname.sendKeys("sbi");
		Thread.sleep(3000);
		cardclick.click();
		Thread.sleep(3000);
		save.click();
		Thread.sleep(6000);
	
}
}