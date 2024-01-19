package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleValuedXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/");
       // driver.findElement(By.xpath("//input[@id='fromPlaceName' and @value='Leaving From:']")).sendKeys("Bangalore");
        Thread.sleep(5000);
     driver.findElement(By.xpath("//a[text()=' Ballari - Bengaluru']")).click();
     driver.close();
	}

}
