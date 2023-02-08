package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMtest extends BaseTest {

	 @Test(priority= 3)
	    public void clkpim() {
	    	PIM.Pimpage();
	    	String verifytitleofpiim = PIM.titleofpmpage();
	    	Assert.assertEquals(verifytitleofpiim, "PIM");
	    }
}
