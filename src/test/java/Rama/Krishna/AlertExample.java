package Rama.Krishna;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\selweb\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver();
//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("https://netbanking.hdfcbank.com/netbanking/");
  driver.switchTo().frame("login_page");
  driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
  Alert HdfcAlert=driver.switchTo().alert();


  HdfcAlert.accept();
  //HdfcAlert.dismiss();
  Thread.sleep(10000);
  driver.switchTo().defaultContent();// This method will take back to main window mean comes out of the login frame.
  System.out.println("alretText");
	}

}
