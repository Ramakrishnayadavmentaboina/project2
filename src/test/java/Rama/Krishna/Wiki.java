package Rama.Krishna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Documents\\\\\\\\selweb\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia");
	}

}
