package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WasToCountNoOfLinksAndImageInWebSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\SELENIUM\\\\\\\\web drivers\\\\\\\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		 List<WebElement>  links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 List<WebElement>  image = driver.findElements(By.tagName("img"));
		
		 System.out.println(image.size());
	}

}
