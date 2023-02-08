package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.Basetest;

public class dashboard extends Basetest {
	//all locator
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleofdashboard;
	
	
	//initialize locator
	
	public dashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//method
    public String titleofdashboard() {
    	return titleofdashboard.getText();
    }
}
