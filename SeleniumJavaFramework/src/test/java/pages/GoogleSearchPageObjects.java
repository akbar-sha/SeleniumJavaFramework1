package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By button_search = By.cssSelector("div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) div:nth-child(1) div.A8SBwf:nth-child(1) div.FPdoLc.lJ9FBc:nth-child(4) center:nth-child(1) > input.gNO89b:nth-child(1)");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
		
		
	}

	public void clickSearchButton() {
	
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	
}
