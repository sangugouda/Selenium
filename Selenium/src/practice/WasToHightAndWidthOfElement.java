package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WasToHightAndWidthOfElement {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\SELENIUM\\\\web drivers\\\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/tyss3/login.do");
	WebElement userName =	driver.findElement(By.xpath("//input[@name='username']"));
String hight	= userName.getCssValue("height");
System.out.println(hight);
System.out.println(userName.getCssValue("width"));

//without using getCssValue(), also we can get the value for width & height
System.out.println(userName.getSize().height);
System.out.println(userName.getSize().width);
driver.close();
}
}