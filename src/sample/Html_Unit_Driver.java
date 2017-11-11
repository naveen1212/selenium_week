package sample;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Html_Unit_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		

	}

}
