package taskXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthTask {
	
	public static void main(String[] args) throws InterruptedException {
		

	    System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']"));
		
		WebElement password=driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']"));

		WebElement button=driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']"));
		
		username.sendKeys("Barath");
		
		System.out.println(username.getAttribute("value"));
		
		password.sendKeys("12344");
		
		System.out.println(password.getAttribute("value"));
		
		button.click();

		driver.close();

}}
