package taskXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTask {
	
	public static void main(String[] args) throws InterruptedException {
		

    System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.adactin.com/HotelApp/");
	
	driver.manage().window().maximize();
	
	WebElement username=driver.findElement(By.id("username"));
	
	WebElement password=driver.findElement(By.id("password"));
	
     username.sendKeys("Barath");
	
	System.out.println(username.getAttribute("value"));
	
	password.sendKeys("12344");

	System.out.println(password.getAttribute("value"));
	
	Thread.sleep(3000);
	
    driver.close();
	}
}
