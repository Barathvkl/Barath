package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
			
		
		static WebDriver driver;
		
		public static WebDriver launchBrowser() {
			
		
       System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		
	 driver = new ChromeDriver();
	 
	 return driver;
	}
	
		public static void loadUrl(String url) {
 
			driver.get(url);
		}
		
		public static void max() {
			
			driver.manage().window().maximize();
		}
		
		
		public static void fillText(WebElement e, String value) {
			
			e.sendKeys(value);
		}
		
		public static void btnClick(WebElement e) {
			
			e.click();
			
			
		}
		
		public static void date(WebElement e, String value) {
			e.sendKeys(value);
		}
		
		public static void drop(WebElement e, String value) {
			
			Select s= new Select(e);
			s.selectByValue(value);
		}
		
public static void closeBrowser() {
	
	driver.quit();
}
}
