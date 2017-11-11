package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  @Test(priority=0)
  public void f() {
	  System.out.println("logout");
  }
  
  @Test( skipFailedInvocations=false )
  public void a() {
	  
	System.out.println("kkk");
	 
  }
  
  
  @BeforeMethod
  public void beforeTest() {
	  System.out.println("launch");
  }

  @AfterMethod
  public void afterTest() {
	  System.out.println("close");
  }

}
