package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Gecko12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\9QTP\\IEDriverServer.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\userft\\Downloads\\chromedriver.exe");
		
		//WebDriver d=new ChromeDriver();
		
		
		
		InternetExplorerDriver d=new InternetExplorerDriver();
		d.get("http://google.com");
				

				

	}

}
