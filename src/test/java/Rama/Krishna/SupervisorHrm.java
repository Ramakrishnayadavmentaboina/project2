package Rama.Krishna;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SupervisorHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
			
			System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Documents\\\\\\\\selweb\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
			String expectedResult="John Smith";
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("John Smith");
			driver.findElement(By.id("searchB")).click();
			
	 String actualResult=driver.findElement(By.linkText("John Smith")).getText();
	 Assert.assertEquals(actualResult,expectedResult);
	}

}
