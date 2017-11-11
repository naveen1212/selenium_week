package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Webtable_rows {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();

		Sleeper.sleepTightInSeconds(2);
		
		for (int i = 1; i <= 20 ; i++) 
		{
			 for (int j = 1; j <= 5 ; j++) 
			 {
				 
	 
			String path="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
			
			String path2="]/td[";
			String path3="]";
		
			String str=d.findElement(By.xpath(path+i+path2+j+path3)).getText();
			System.out.print(str+"     ");	
			
				
			}
			 System.out.println();
		}
		

	}

}
