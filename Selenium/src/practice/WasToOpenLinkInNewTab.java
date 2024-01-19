package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WasToOpenLinkInNewTab {
public static void main(String [] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com/");
	//  driver.findElement(By.xpath("//a[text()='Log in']")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	 Actions act = new Actions(driver);
	act.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Log in')]")));
	Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_TAB);
	 driver.close();
}
}
