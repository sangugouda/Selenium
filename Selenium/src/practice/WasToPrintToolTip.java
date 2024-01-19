package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WasToPrintToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\SELENIUM\\\\\\\\web drivers\\\\\\\\chrome/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://online.actitime.com/tyss3/login.do");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("tijojop108@wowcg.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
	System.out.println(driver.findElement(By.xpath("//button[@data-tip='Add tasks to the timesheet']")).getAttribute("title"));

	}

}
