package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://demoqa.com/select-menu");
	      driver.manage().window().maximize();
	      
	      WebElement MultiSelectDropDown=driver.findElement(By.id("audi"));
	      
	      Select s=new Select(MultiSelectDropDown);
	      
	      System.out.println("Multi selectable status"+s.isMultiple());
	      Thread.sleep(1000);
	      
	      s.selectByIndex(2);
	      Thread.sleep(1000);
	      
	      s.selectByValue("opel");
	      Thread.sleep(1000);
	      
	      s.selectByVisibleText("Volvo");
	      Thread.sleep(1000);
	      
	      //s.deselectAll();
	      s.deselectByIndex(2);
	    


	      
	      
	      

	}

}
