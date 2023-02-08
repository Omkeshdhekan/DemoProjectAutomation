package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class logintest extends  BaseTest {
	
	@Test(priority= 0)
	public void verifytitle0floginpage() {
		 String verifytitlepage = loginpg.verifytitleofpage();
		 Assert.assertEquals(verifytitlepage, "Login");
		 
	}
    @Test(priority= 1)
    public void verifyurl() {
    	String verifyurl = loginpg.verifyurlofpage();
    Assert.assertEquals(verifyurl, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    @Test(priority= 2)
     public void verifycorrectcredentioalofloginpage() {
    	loginpg.setusername("Admin");
    	loginpg.setpass("admin123");
    	loginpg.btnlogin();
    	
    	String verifythedashboardtext = dash.titleofdashboard();
    	Assert.assertEquals(verifythedashboardtext, "Dashboard");
    }
    @Test(priority= -1)
    public void verifybuildtext() {
    	loginpg.titleofbuild();
    }
    
   
}
