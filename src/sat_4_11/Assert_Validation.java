package sat_4_11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Validation {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	   String	exp="OrangeHRMfggh";
	   
	   String act=driver.getTitle();
	   System.out.println(act);
	   
	 /*  if(exp.equals(act))
	   {
		   System.out.println("Launch TC pass");
	   }
	   else
	   {
		   System.out.println("Launch TC Fail");
	   }
		*/   
	   
	   Assert.assertEquals(act, exp);
	   
	   System.out.println("Launch PASS");
	   
		
		
  }
}
