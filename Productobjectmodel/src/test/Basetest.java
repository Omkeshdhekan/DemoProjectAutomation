package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.Loginpage;
import mainjava.baseclass;
import mainjava.dashboard;

public class Basetest extends baseclass  {
	
	@BeforeClass
	public void  initibrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 
	@BeforeClass
	public void pageobject() {
		loginpage  = new Loginpage(driver);
	 dashboardpage = new dashboard(driver);
	}
	
	@AfterClass
	public void teardownpage() {
		driver.quit();
	}
	}


