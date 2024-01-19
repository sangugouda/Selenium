package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WasToisDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/tyss3/login.do");
boolean isIt	=	driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
if(isIt) {
	System.out.println("yes displayed, Tets case pass");
}
else {
	System.out.println("not displayed, Tets case fail");
}

	}

}
