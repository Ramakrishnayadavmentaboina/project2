package Rama.Krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Documents\\\\\\\\selweb\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
     WebDriver driver=new  ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/");
     driver.findElement(By.name("txtUsername")).sendKeys("Admin");
     driver.findElement(By.name("txtPassword")).sendKeys("admin123");
     driver.findElement(By.id("btnLogin")).click();
     driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
     driver.findElement(By.id("menu_leave_assignLeave")).click();
     driver.findElement(By.id("assignleave_txtEmployee_empname")).sendKeys("ramki");
     driver.findElement(By.id("assignleave_txtLeavetype")).sendKeys("US-FMLA");
     driver.findElement(By.id("assignleave_txtFromDate")).sendKeys("2022-04-12");
     driver.findElement(By.id("assignleave_txtToDate")).sendKeys("2022-04-12");
     driver.findElement(By.id("assignleave_txtComment")).sendKeys("i am not feeling well");
     driver.findElement(By.name("assignBtn")).submit();
	}
}
	


