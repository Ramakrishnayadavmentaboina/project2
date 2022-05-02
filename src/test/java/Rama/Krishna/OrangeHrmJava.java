package Rama.Krishna;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class OrangeHrmJava {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Documents\\\\\\\\selweb\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		String expectedResult="Fiona Grace";
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.name("empsaerch_employee_name_empName")).sendKeys("Fiona Grace");
		driver.findElement(By.id("searchBtn")).click();
		
		
 String actualResult=driver.findElement(By.linkText("Fiona Grace")).getText();
 Assert.assertEquals(actualResult,expectedResult);
		
		
		
		
		
		
	}

}
