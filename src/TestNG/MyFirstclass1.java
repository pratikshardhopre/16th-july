package TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstclass1 {
  @Test
  public void A()
  {
	Reporter.log("A method is runing",true);
  }
  @Test
  public void B()
  {
	Reporter.log("B method is runing",true);
  }
  @Test
  public void D()
  {
	Reporter.log("D method is runing",true);
  }
  @Test
  public void C()
  {
	Reporter.log("C method is runing",true);
  }
 
  
  
}
