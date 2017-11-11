package sat_4_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_POI_Login {
  @Test
  public void f() throws IOException {
	  
	  String path="E:\\workspace_week14\\SeleniumProject_week14\\TestData\\test2.xlsx";
	  
	  FileInputStream fis=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	   XSSFSheet ws=wb.getSheet("Sheet1");
	   
	   WebDriver d=new FirefoxDriver();
		  d.get(ws.getRow(1).getCell(2).getStringCellValue());
		  d.manage().window().maximize();
		  
		  
		  d.findElement(By.id("un")).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
		  d.findElement(By.id("txtPassword")).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
		  d.findElement(By.id("btnLogin")).click();
		  
		  ws.getRow(1).createCell(3).setCellValue("Passssssss");
		  
		  FileOutputStream fos=new FileOutputStream("E:\\workspace_week14\\SeleniumProject_week14\\TestData\\test22211222.xlsx");
	  
	  wb.write(fos);
	  
	  wb.close();
  }
}
