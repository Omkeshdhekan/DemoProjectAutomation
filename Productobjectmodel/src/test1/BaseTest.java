package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import mainjava1.Baseclass;
import mainjava1.Dashboardpage;
import mainjava1.PIMpage;
import mainjava1.loginpage;

public class BaseTest extends Baseclass  {
	
	@BeforeClass
	public void initbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeClass
	public void pageobject() {
		loginpg = new loginpage(driver);
		dash= new Dashboardpage(driver);
		PIM = new PIMpage(driver);
	}
	
     @AfterClass
     public void Teardownbrowser() {
    	 driver.quit();
     }

}
