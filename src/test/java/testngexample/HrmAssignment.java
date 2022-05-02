package testngexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HrmAssignment
{
	WebDriver driver;
	
	@BeforeClass
	void meth1()
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Documents\\\\\\\\selweb\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login pass");
}
	@Test
	void testcase1()
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Test case1 pass");
	}	

	@Test
	void testcase2()
	{
	driver.findElement(By.linkText("PIM")).click();
    driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
    driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
    driver.findElement(By.id("searchBtn")).click();
    System.out.println("Test case2 pass");
	}
	
	@AfterClass
	void meth2()
	{
	driver.close();
	

	
	}
	}
	


