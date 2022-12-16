package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_FB {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/?stype=lo&jlou=AffLm9qStNH3u4BcpJ5j59wiTG9URPOb00OZOwSGOJYiFFW_hyNwyqwJNWrJZbp_vCJhdE-U87aOwh17IRZgJtsUbn1vZsMp1dhWYhh7sBAeQw&smuh=41243&lh=Ac9r3nmJKnpHV2CQzks");
	      
	      WebElement Day=driver.findElement(By.id("day"));
	      WebElement Month=driver.findElement(By.id("month"));
	      WebElement Year=driver.findElement(By.id("year"));
	      
	      Select sday=new Select(Day);
	      Select smonth=new Select(Month);
	      Select sYear=new Select(Year);
	      
	      smonth.selectByVisibleText("April");
	      Thread.sleep(1000);
	      sday.selectByVisibleText("21");
	      Thread.sleep(1000);
	      sYear.selectByVisibleText("1997");
	      Thread.sleep(1000);
	     

	

}
}
