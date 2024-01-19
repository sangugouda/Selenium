package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WastoCountofNoDropdowninApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\SELENIUM\\\\\\\\\\\\\\\\web drivers\\\\\\\\\\\\\\\\chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://in.puma.com/in/en/home");
    List<WebElement> dropdown =   driver.findElements(By.tagName("select"));
        
System.out.println(dropdown.size());
for( WebElement text : dropdown ) {
	System.out.println(text.getText());
	
}
driver.close();
	}

}
