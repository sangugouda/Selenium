package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WasToCheckThatIsCheckboxisSelectedandEnabled {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/tyss3/login.do");
	boolean	isItEnabled = driver.findElement(By.xpath("//input[@name='remember' and @id='keepLoggedInCheckBox']")).isEnabled();
	System.out.println(isItEnabled);
	if(isItEnabled) {
		System.out.println("check box is enabled");
	}
	else {
		System.out.println("check box is not enabled");
	}
	driver.findElement(By.xpath("//input[@name='remember' and @id='keepLoggedInCheckBox']")).click();
	
	boolean	isItSelected = driver.findElement(By.xpath("//input[@name='remember' and @id='keepLoggedInCheckBox']")).isSelected();
	if(isItSelected) {
		System.out.println("Check box is selected");
		
	}
	else {
		System.out.println("Check box is not selected");
		
	}
	driver.close();
	}

}
