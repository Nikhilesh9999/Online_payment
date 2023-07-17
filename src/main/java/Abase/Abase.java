package Abase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


//Base class 

public class Abase {
	
	public static WebDriver driver;
	
	public void initalizations()
	{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
	//driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.mirraw.com/accounts/sign_in");
}
	}