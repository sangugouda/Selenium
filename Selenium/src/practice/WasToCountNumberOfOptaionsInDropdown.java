package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WasToCountNumberOfOptaionsInDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documents\\SELENIUM\\web drivers\\chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/desktops");
WebElement	Dropdown =	driver.findElement(By.xpath("//select[@name='products-pagesize']"));
Select listbox = new Select(Dropdown);
     boolean  isIt = listbox.isMultiple();
     List<WebElement> options = listbox.getOptions();
     System.out.println(options.size());
     for(WebElement optionName : options){
    	 System.out.println(optionName.getText());
    	 
     }
   listbox.selectByVisibleText("12");
   for(int i=1;i<=10;i++) {
	  try {
   
WebElement Size = listbox.getFirstSelectedOption();
 if(Size.equals("12")) {
    System.out.println("Selected proper option only");
    }
         break;
	  }
	  catch(Exception e)
	  {
		  System.out.println(i +" not able to get");
	  }
	  
   }
     

	}
}
