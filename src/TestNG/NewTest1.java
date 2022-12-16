package TestNG;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void ValidateUID() 
  {
	 Reporter.log("UserId ", true); 
  }
  @BeforeMethod
  public void Login()
  {
	  Reporter.log("Login ID", true);
  }
  @BeforeClass
  public void LaunchURL()
  {
	  Reporter.log("Launch Url", true);
  }
  @AfterMethod
  public void LogOut()
  {
	  Reporter.log("Log Out", true);
	  
  }
  @AfterClass
  public void CloseTab()
  {
	  Reporter.log("Close Tab", true);
  }
  
}
