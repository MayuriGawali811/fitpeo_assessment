package SupportClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class revenueCalculatorSupportclass  extends BaseClass{
		
		@FindBy(xpath = "//span[contains(@class,'MuiSlider-th')]")
		@CacheLookup
		private WebElement Slider;
		@FindBy(xpath = "//input[contains(@class,'MuiInputBase')]")
		@CacheLookup
		private WebElement TextInput;
		@FindBy(xpath = "//input[contains(@class,'MuiInputBase')]")
		@CacheLookup
		private WebElement TextInput1;
		@FindBy(xpath = "//div[@class='MuiBox-root css-rfiegf']//div[1]//label[1]//span[1]//input[1]")
		@CacheLookup
		private WebElement CPT91;
		@FindBy(xpath = "//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")
		@CacheLookup
		private WebElement CPT53;
		@FindBy(xpath = "//div[3]//label[1]//span[1]//input[1]")
		@CacheLookup
		private WebElement CPT54;
		@FindBy(xpath = "//div[8]//label[1]//span[1]//input[1]")
		@CacheLookup
		private WebElement CPT74;
		@FindBy(xpath = "//div/p[text()='CPT-99474']")
		@CacheLookup
		private WebElement CPT99474;
		@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 inter css-1bl0tdj'][normalize-space()='$110160']")
		@CacheLookup
		private WebElement Total_Recurring_Reimbursement;
		
		
		public revenueCalculatorSupportclass(WebDriver driver) {

			PageFactory.initElements(driver, this);
		}
		
		public void Revenuecalculator() throws InterruptedException {
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)");	
			Actions action=new Actions(driver);
			action.dragAndDropBy(Slider, (int) 93, 4).perform();
			Thread.sleep(2000);
			TextInput.clear();
			Thread.sleep(2000);
			js.executeScript("arguments[0].value='820'",TextInput1);
			TextInput.clear();
			Thread.sleep(2000);
			js.executeScript("arguments[0].value='560'",TextInput1);
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)");	
			CPT91.click();
			CPT53.click();
			js.executeScript("window.scrollBy(0,300)");	
			CPT54.click();
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,800)");	
			CPT74.click();
			Thread.sleep(3000);
			String TotalRecurringReimbursement=Total_Recurring_Reimbursement.getText();
			System.out.println("TotalRecurringReimbursement=____"+TotalRecurringReimbursement);
			
			
			
		}

	}



