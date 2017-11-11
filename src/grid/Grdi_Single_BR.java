package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grdi_Single_BR {
  @Test
  public void f() throws MalformedURLException {
	  
	  DesiredCapabilities capb=DesiredCapabilities.chrome();
	  
	  capb.setBrowserName("chrome");
	  capb.setPlatform(Platform.WINDOWS);
	  
	  
	   RemoteWebDriver dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capb);
	  
	   dr.get("http://google.com");
	  
	  
  }
}
