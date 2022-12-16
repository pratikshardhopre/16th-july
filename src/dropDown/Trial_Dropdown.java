package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Trial_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{ 
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.select.com/contact/");
	      Thread.sleep(1000);
	      driver.manage().window().maximize();
	      
	      driver.switchTo().frame("stretch");
	      Thread.sleep(2000);
	      
	     WebElement demo = driver.findElement(By.id(null));
	      
	     Select s=new Select(demo);
	    // System.out.println();
	     //s.isMultiple();
	     Thread.sleep(1000);
	     s.selectByVisibleText("Banana");
	     Thread.sleep(1000);
	     s.selectByValue("apple");
	     Thread.sleep(1000);
	     s.selectByIndex(3);
	     
	     
	     

	     
	}

}
