package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinJse {
	
public static void main(String[] args) throws InterruptedException {
		
		
	    System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.adactin.com/HotelApp/");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		
		WebElement password=driver.findElement(By.id("password"));

		WebElement button=driver.findElement(By.id("login"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Barath')",username);
		
		js.executeScript("arguments[0].setAttribute('value','1223')",password);
		
		js.executeScript("arguments[0].click()",button);
		
		Thread.sleep(3000);
        driver.close();

}
}