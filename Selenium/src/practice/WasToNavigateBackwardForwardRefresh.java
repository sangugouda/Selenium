package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WasToNavigateBackwardForwardRefresh {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://online.actitime.com/tyss3/login.do");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
