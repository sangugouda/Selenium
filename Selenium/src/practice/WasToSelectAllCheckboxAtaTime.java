package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WasToSelectAllCheckboxAtaTime{

	public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\SELENIUM\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\web drivers\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chrome/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/womens-footwear/sports-shoes/pr?sid=osp%2Ciko%2Cd20&hpid=ngQ2G_b0ouO8ULOtew-9Map7_Hsxr70nj65vMAAFKlc%3D&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyI1MC04MCUgT2ZmIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiU0hPRzZXWk40QlpRTVNITiIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkFESURBUywgQVNJQ1MgJiBtb3JlIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&fm=neo%2Fmerchandising&iid=M_aaed2aae-c6ac-4e44-81f5-a194111b970e_8.HUKXUG5P1OPZ&ppt=hp&ppn=homepage&ssid=vohvzg59ts0000001651558488803&otracker=hp_omu_Top%2BDeals%2Bon%2BFashion_3_8.dealCard.OMU_HUKXUG5P1OPZ_8&otracker1=hp_omu_PINNED_neo%2Fmerchandising_Top%2BDeals%2Bon%2BFashion_NA_dealCard_cc_3_NA_view-all_8&cid=HUKXUG5P1OPZ");
  Thread.sleep(5000);
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("window.scrollBy(0,550)", "");
  Thread.sleep(5000);
	List<WebElement> checkbox= driver.findElements(By.xpath("//div[text()='Offers']/../..//input"));

for(WebElement select : checkbox) {
	select.click();
	Thread.sleep(1000);
	
}
for(WebElement deselect : checkbox ) {
	deselect.click();
	Thread.sleep(1000);
}
for(WebElement text : checkbox) {
	
	System.out.println(text.getText());
	
}

	}

}
