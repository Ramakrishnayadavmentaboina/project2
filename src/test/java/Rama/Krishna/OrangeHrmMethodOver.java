package Rama.Krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmMethodOver 
{
	

	
      void meth1(String s)
      {
    	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Documents\\\\\\\\selweb\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.name("empsaerch_employee_name_empName")).sendKeys("Odies Adalwin");
			driver.findElement(By.id("searchBtn")).click();
			
			
      }
      void meth1(String EmployeeName,String SupervisorName)
      {
    	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Documents\\\\\\\\selweb\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.name("empsaerch_employee_name_empName")).sendKeys("Odies Adalwin");
			driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("Linda Jane Anderson");
			driver.findElement(By.id("searchB")).click();
      }
      public static void main (String args[])
      {
    	  OrangeHrmMethodOver aobj=new OrangeHrmMethodOver();
    	  aobj.meth1("Odies Adalwin");
    	  aobj.meth1("Odies Adalwin","Linda Jane Anderson");
      
      
      }
}
      
      
      
      
      
	


