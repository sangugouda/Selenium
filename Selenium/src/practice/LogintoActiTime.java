package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoActiTime {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/tyss3/login.do");
		
		
	Thread.sleep(5000);
	driver.navigate().refresh();
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("tijojop108@wowcg.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
//	String 	Titletext = driver.findElement(By.xpath("//div[@class='containers-EnterTT-header--1oBVkX2c']/child::h3")).getText();
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals("actiTIME - Enter Time-Track")) {
		System.out.println("Home Page is Displayed");
		
	}
	else {
		System.out.println("Home page is not displayed");
	}
		driver.quit();
	
		
	}

}
