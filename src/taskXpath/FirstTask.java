package taskXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com");
		
		driver.manage().window().maximize();
		
		WebElement scrolldown=driver.findElement(By.xpath("//h2[contains(text(),'Greens Technologys Overall Reviews')]"));
		
		System.out.println(scrolldown.getText());
		driver.close();
}

}
