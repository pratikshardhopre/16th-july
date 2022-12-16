package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      Thread.sleep(1000);
	     // driver.findElement(By.xpath("(//a[@role='button'])")).click();
	      
	      
	      
	      
	      driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	      Thread.sleep(2000);
	      
	      
	      
	      
	      WebElement  a= driver.findElement(By.xpath("//input[@name='firstname']"));
	      
	      a.sendKeys("Pratiksha");
	      Thread.sleep(3000);
	      
	      
	      
	      WebElement Day=driver.findElement(By.id("day"));
	      Select sday=new Select(Day);
	      sday.selectByVisibleText("21");
	      Thread.sleep(3000);
	      
	      WebElement Month=driver.findElement(By.id("month"));
	      Select smonth=new Select(Month);
	     // smonth.selectByVisibleText("April");
	      smonth.selectByIndex(3);
	      Thread.sleep(3000);
	      
	      WebElement Year=driver.findElement(By.id("year"));
	      Select sYear=new Select(Year);
	      sYear.selectByVisibleText("1997");
	      Thread.sleep(3000);
	      
	      
	      
	      
	      
	      
	}

}
