package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToolsQa extends BaseClass{
	
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://www.facebook.com");
		max();
		LoginPOJOClass p= new LoginPOJOClass();
		
		fillText(p.getUsername(),"123125");
		
		fillText(p.getPassword(),"123125");
        btnClick(p.getButton());
		
		
	}
	

}
