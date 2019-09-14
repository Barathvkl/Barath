package taskXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthTask {
	
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		WebElement thirdpara=driver.findElement(By.xpath("//*[@id='content-wrapper']/descendant::p[4]"));
		
		System.out.println(thirdpara.getAttribute("innerText"));
		
		driver.close();
	}

}
