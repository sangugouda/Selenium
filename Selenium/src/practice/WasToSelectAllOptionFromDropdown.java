package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WasToSelectAllOptionFromDropdown {
	public static void  main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/desktops?pagesize=12");
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='products-viewmode']")));
	  List<WebElement> options = dropdown.getOptions();
	  
	  for(int i=0;i<=options.size();i++) {
		 try { 
		  dropdown.selectByIndex(i);
		 }
		 catch(Exception e) {
			 
		 }
		  
	  }
		driver.close();
	}

}
