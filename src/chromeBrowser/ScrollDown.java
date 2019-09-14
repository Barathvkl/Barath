package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com");
		
		driver.manage().window().maximize();
		
		WebElement scrolldown=driver.findElement(By.xpath("//h2[contains(text(),'Greens Technologys Overall Reviews')]"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		Thread.sleep(3000);
		
		System.out.println(scrolldown.getText());

        driver.close();
	}

}
