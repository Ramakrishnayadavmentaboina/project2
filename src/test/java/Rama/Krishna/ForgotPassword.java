package Rama.Krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class ForgotPassword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Documents\\\\\\\\selweb\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569867%7Ce%7Cfacebook%20create%20new%20account%7C&placement=&creative=589460569867&keyword=facebook%20create%20new%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-311595197486%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw0a-SBhBkEiwApljU0sO3k9G1jq8EdCupeq4Noq48a8ZGOSQyduIQH_M9NK5EMtcGOopi7hoCfoUQAvD_BwE");
	driver.findElement(By.name("firstname")).sendKeys("ramakrishna");
	driver.findElement(By.name("lastname")).sendKeys("yadav");
    driver.findElement(By.name("reg_email__")).sendKeys("ramakrishnayadav124@gmail.com");
    driver.findElement(By.name("reg_passwd__")).sendKeys("ramki2442");
    WebElement monthfield=driver.findElement(By.name("birthday_month"));
    Select month=new Select(monthfield);
    month.selectByIndex(9);
    WebElement yearfield=driver.findElement(By.name("birthday_year"));
    Select year=new Select(yearfield);
    year.selectByIndex(1998);
    
	}

}
