package testNgGroupingXml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {

	@Test(groups="id")
	  public void A()
	  {
		//Assert.fail();
		Reporter.log("A method is runing",true);
	  }
	
	  @Test(groups="pass")
	  public void B()
	  {
		Reporter.log("B method is runing",true);
	  }
	  @Test(groups="id")
	  public void D()
	  {
		  
		  Reporter.log("D method is runing",true);
	  }
	  @Test(groups="pass")
	  public void C()
	  {
		Reporter.log("C method is runing",true);
	  }
	 
	  

	}


