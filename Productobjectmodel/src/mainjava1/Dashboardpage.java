package mainjava1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test1.BaseTest;

public class Dashboardpage extends  BaseTest {
   //all locator of page
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement dashboard;
	
	
	// initialize the locator
	public Dashboardpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	// method to used dashboard
	/*Auther - omkesh dhekan
	 * Description - this method use to verify the dashboard text of page
	 * parameter- String 
	 */
	public String titleofdashboard() {
		return dashboard.getText();
	}
}
