package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WasToForDropDown {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]")).click();
	driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[4]")).click();
WebElement	dropdown = driver.findElement(By.xpath("//select[@name='products-orderby']"));
          
	Select listbox = new Select(dropdown);
	
	listbox.isMultiple();
	listbox.selectByVisibleText("Price: Low to High");
	
	}

}
