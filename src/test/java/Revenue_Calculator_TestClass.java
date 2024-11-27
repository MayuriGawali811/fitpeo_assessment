import org.testng.annotations.Test;

import SupportClasses.BaseClass;
import SupportClasses.revenueCalculatorSupportclass;

public class Revenue_Calculator_TestClass extends BaseClass{
	
	
	@Test
	public void openbrowser() throws InterruptedException {
		
		
		BaseClass.setup();
		Thread.sleep(5000);
		
		revenueCalculatorSupportclass RC=new revenueCalculatorSupportclass(driver);
		
		RC.Revenuecalculator();
	}

	
	
}
