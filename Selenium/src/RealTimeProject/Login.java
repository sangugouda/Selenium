package RealTimeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\SELENIUM\\\\\\\\web drivers\\\\\\\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.10.10.105:3000/signin");
		driver.manage().window().maximize();
		driver.findElement(By.name("emailId")).sendKeys("akshay11@testyantra.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@123");
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign in') or type='submit']")).click();
		 driver.findElement(By.xpath("//span[text()='Test']")).click();

	}

}
