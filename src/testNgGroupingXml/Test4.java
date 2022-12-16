package testNgGroupingXml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	 @Test(groups="id")
	  public void G()
	  {
		
		 Reporter.log("G method is runing",true);
	  }
	  @Test(groups="pass")
	  public void H()
	  {
		Reporter.log("H method is runing",true);
	  }
	  @Test(groups="id")
	  public void I()
	  {
		 
		  Reporter.log("I method is runing",true);
	  }
	  @Test(groups="pass")
	  public void J()
	  {
		Reporter.log("J method is runing",true);
	  }

}
