package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Present {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		
		String src=d.getPageSource();
		System.out.println(src);
		
		if(src.contains("facebook"))
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not present");
		}
		

	}

}
