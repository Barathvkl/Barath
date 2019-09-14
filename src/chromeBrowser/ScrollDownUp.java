package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUp {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		
		driver.manage().window().maximize();
		
		WebElement scrolldown=driver.findElement(By.xpath("//*[@id='cookie_action_close_header']"));
		
		WebElement scrollup=driver.findElement(By.xpath("//*[@class='preload-me lazyloading']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView(false)", scrollup);
		
		Thread.sleep(3000);

        driver.close();
		
	}

}
