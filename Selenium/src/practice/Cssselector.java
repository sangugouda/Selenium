package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.cssSelector("input[id='fromPlaceName']")).sendKeys("Koppal");
		driver.findElement(By.cssSelector("input[name='toPlaceName']")).sendKeys("Bengalore");
		driver.findElement(By.cssSelector("label[for='singleLady']")).click();
		driver.findElement(By.cssSelector("Button[class=\"btn btn-primary btn-lg btn-block btn-booking\"]")).click();
		driver.close();

	}

}
