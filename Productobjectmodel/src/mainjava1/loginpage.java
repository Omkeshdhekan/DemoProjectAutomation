package mainjava1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test1.BaseTest;

public class loginpage extends BaseTest {
	
	//all locator of page
	@FindBy(xpath="//*[text()='Login']")
      WebElement txttitleofpage;
	
	@FindBy(name="username")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(tagName="button")
	WebElement btn;
	
	@FindBy(xpath="//*[text()='OrangeHRM']")
	WebElement build;
	
	
	
	//initilize the locator
	public loginpage(WebDriver driver) {
		this.driver=driver;   // match the local driver to globe driver
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//method to use with auther
	/*Auther - omkesh dhekan
	 * Description - this method use to verify the title of page
	 * parameter - String 
	 */
	
	public String verifytitleofpage() {
		return txttitleofpage.getText();
		}
	
	/*Auther - omkesh dhekan
	 * Description - this method use to verify the url of page
	 * parameter - String 
	 */
	public String  verifyurlofpage() {
		return driver.getCurrentUrl();
	}
	/*Auther - omkesh dhekan
	 * Description - this method use to verify the username of page
	 * parameter - String 
	 */
	public void setusername(String username) {
		 Username.sendKeys(username);
	}
	/*Auther - omkesh dhekan
	 * Description - this method use to verify the password of page
	 */
	public void setpass(String pass) {
		Password.sendKeys(pass);
	}
	/*Auther - omkesh dhekan
	 * Description - this method use to verify the login of page
	 */
	public void btnlogin() {
		btn.click();
	}
	
	public String titleofbuild() {
		return driver.getTitle();
	}
	
	

}
