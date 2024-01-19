package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WasToDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Static.html");
	WebElement	Image = driver.findElement(By.xpath("//img[@id='angular']"));
	WebElement place = driver.findElement(By.xpath("//p[@id='msg']"));
	Actions act = new Actions(driver);
	act.dragAndDrop(Image, place);
     driver.close();
	}

}
