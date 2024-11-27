package SupportClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	
	protected static WebDriver driver;
	public static void setup()
	{
	
		ChromeOptions options= new ChromeOptions();
		options.setCapability("browserVersion", "130");	
		driver = new ChromeDriver();		
		driver.manage().window().maximize();	
		driver.get("https://fitpeo.com/revenue-calculator");
	
	}
	

}
