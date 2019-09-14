package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartJse {
	
	public static void main(String[] args) throws InterruptedException {
		

    System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	WebElement username=driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']"));
	
	WebElement password=driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']"));

	WebElement button=driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']"));
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].setAttribute('value','Barath')",username);
	
	js.executeScript("arguments[0].setAttribute('value','1223')",password);
	
	js.executeScript("arguments[0].click()",button);
	
	Thread.sleep(3000);
    driver.close();

}}
