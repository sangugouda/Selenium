package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WasToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	WebElement	dropdown = driver.findElement(By.xpath("//strong[contains(text(),'Select country from below drop down list:')]/../..//select"));
	Select listbox = new Select(dropdown);
	listbox.selectByValue("CHN");
	Thread.sleep(5000);
	listbox.selectByVisibleText("Canada");
	Thread.sleep(5000);
	
	listbox.selectByVisibleText("Kiribati");
	}

}
