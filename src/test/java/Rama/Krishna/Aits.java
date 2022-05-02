package Rama.Krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aits 
{
	
	public static void main(String[] args) throws InterruptedException 
		// TODO Auto-generated method stub
	{
		 System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Documents\\\\\\\\selweb\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.aitsteam.com/Diploma/ViewReport/index.php");
	     driver.findElement(By.id("RegNumber")).sendKeys("AITS/A/1236/19");
	     Thread.sleep(500);
	     driver.findElement(By.id("StudName")).sendKeys("NAINIKA RAJ");
	     Thread.sleep(500);
	     driver.findElement(By.name("submit")).click();
	     String text=driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr[3]/td[2]/strong")).getText();
	     System.out.println(text);
	    
	}
}