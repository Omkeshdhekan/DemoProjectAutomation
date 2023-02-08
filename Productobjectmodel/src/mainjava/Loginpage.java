package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.Basetest;

public class Loginpage extends Basetest {
	
	// All locater of page 
	@FindBy(xpath="//*[text()='Login']")
	WebElement txtloginpage;
	
	@FindBy(name="username")
	 WebElement userName ;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(tagName="button")
	WebElement login;
	
	
	// initialization of locator
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	// method to required to perform test step
	/*Auther - omkesh dhekan
	 * date - 04-02-2023
	 * description- this Test Method Is Use to Verify login page title
	 * parameter- String
	 */

	public String titleofloginpage () {
		return txtloginpage.getText();	
		
	}
	/*Auther - omkesh dhekan
	 * date - 04-02-2023
	 * description- this Test Method Is Use to Verify url of page
	 * parameter- String
	 */
   public String urlofpage() {
	   return driver.getCurrentUrl();   
	   }
   /*Auther - omkesh dhekan
	 * date - 04-02-2023
	 * description- this Test Method Is Use to Verify username page
	 * 
	 */
   public void setusername(String username) {
	   userName.sendKeys(username);
   }
   /*Auther - omkesh dhekan
	 * date - 04-02-2023
	 * description- this Test Method Is Use to Verify username page
	 * 
	 */
   public void setpassword(String pass) {
	   password.sendKeys(pass);
   }
   /*Auther - omkesh dhekan
	 * date - 04-02-2023
	 * description- this Test Method Is Use to Verify username page
	 * 
	 */
   public void loginbutton() {
	   login.click();
   }


/*Auther - omkesh dhekan
 * date - 04-02-2023
 * description- this Test Method Is Use toget title of build
 * 
 */

      public String  getbuildtitle() {
	     return driver.getTitle();
      }
}