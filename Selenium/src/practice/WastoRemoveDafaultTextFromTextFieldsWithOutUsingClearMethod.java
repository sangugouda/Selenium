package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WastoRemoveDafaultTextFromTextFieldsWithOutUsingClearMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/tyss3/login.do");
	  WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	  userName.sendKeys("Gouda@testyantra.com");
	     Thread.sleep(5000);
	  userName.sendKeys(Keys.CONTROL + "a");
	  userName.sendKeys(Keys.DELETE); 
	  driver.close();

	}

}
