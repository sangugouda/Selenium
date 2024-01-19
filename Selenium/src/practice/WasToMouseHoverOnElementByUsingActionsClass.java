package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WasToMouseHoverOnElementByUsingActionsClass {
  public static void main(String [] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\User\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\SELENIUM\\\\\\\\web drivers\\\\\\\\chrome/chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  WebDriverWait wait = new WebDriverWait(driver,30);
 WebElement	computers = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));


Actions act = new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')])[1]"))).click().build().perform();
	  
  }
}
