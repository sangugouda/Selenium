package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WasToCopyPasteDataFromOneTextBoxtoOtherTextbox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/tyss3/login.do");
	WebElement userName =	driver.findElement(By.xpath("//input[@name='username']"));
	/*userName.sendKeys("Gouda@testyantra.com");
	userName.sendKeys(Keys.CONTROL + "a");
	userName.sendKeys(Keys.CONTROL + "c");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Keys.CONTROL + "v");
	Thread.sleep(5000);*/
Point loc=	userName.getLocation();
System.out.println(loc.getX());
System.out.println(loc.getY());
	driver.close();
	
	
	

	}

}
