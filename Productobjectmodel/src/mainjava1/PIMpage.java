package mainjava1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test1.BaseTest;

public class PIMpage extends BaseTest {
	
	//All locator 
	@FindBy(xpath="//span[text()='PIM']")
	WebElement pimbtn;
	
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement textpim;
	
	//initalize the locator
	public PIMpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//method to use for pim
	public void Pimpage() {
		pimbtn.click();
	}
     public String titleofpmpage() {
    	 return textpim.getText();
     }

}
