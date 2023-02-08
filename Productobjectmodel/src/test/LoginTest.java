 package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Basetest {
	
	@Test(priority= 0,groups={"smoke","regression"})
	public void verifytitleofloginpage() {
		String verifyofloginpage = loginpage.titleofloginpage();
		Assert.assertEquals(verifyofloginpage, "Login");
	}
	
	@Test(priority= 1)
    public void verifyurlofpage() {
		String verifyurlofpage = loginpage.urlofpage();
	    Assert.assertEquals(verifyurlofpage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority= 2)
	public void verifywithcorrectcredential() {
		loginpage.setusername("Admin");
		loginpage.setpassword("admin123");
		loginpage.loginbutton();
		
		String titleofdash = dashboardpage.titleofdashboard();
	    Assert.assertEquals(titleofdash, "Dashboard");
	}
      @Test(priority= -1)
       public void verifybuildtitlename() {
    	 String verifybuildtitle= loginpage.getbuildtitle();
    	 Assert.assertEquals(verifybuildtitle, "OrangeHRM");
      }
}
