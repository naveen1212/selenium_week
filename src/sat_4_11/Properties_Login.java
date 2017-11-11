package sat_4_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Properties_Login {
  @Test
  public void f() throws IOException {
	  
	  // properties file
	  
	  FileInputStream fisP=new FileInputStream("E:\\workspace_week14\\SeleniumProject_week14\\Prop.properties");
	  Properties pr=new Properties();
	  pr.load(fisP);
	  
	  // Excel
	  
    String path="E:\\workspace_week14\\SeleniumProject_week14\\TestData\\test2.xlsx";
	  
	  FileInputStream fis=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	   XSSFSheet ws=wb.getSheet("Sheet1");
	   
	   WebDriver d=new FirefoxDriver();
		  d.get(ws.getRow(1).getCell(2).getStringCellValue());
		  d.manage().window().maximize();
		  
		  // login
		  
		  d.findElement(By.id(pr.getProperty("un"))).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
		  d.findElement(By.id(pr.getProperty("psd"))).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
		  d.findElement(By.id(pr.getProperty("logbtn"))).click();  
  }
}
