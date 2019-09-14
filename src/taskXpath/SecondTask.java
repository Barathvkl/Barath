package taskXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTask {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement username=driver.findElement(By.xpath("//*[@id='email']"));
	
	WebElement password=driver.findElement(By.xpath("//*[@id='pass']"));
	
	username.sendKeys("Barath");
	
	System.out.println(username.getAttribute("value"));
	
	password.sendKeys("12344");

	System.out.println(password.getAttribute("value"));
	
	driver.close();

}
}