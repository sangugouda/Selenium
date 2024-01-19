package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {
	public static void main(String [] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://hrms.karnataka.gov.in/");
 String Url	= driver.getCurrentUrl();
	System.out.println(Url);
	System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
	Thread.sleep(5000);
	driver.quit();
	
	

}
}