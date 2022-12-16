package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      driver.manage().window().maximize();
	      //identify list box to be handled & store reference variable
	      WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
	      
	      //create an object of select class methods which will accept WebElement as argument
          Select s=new Select(dropDown);
          
          //By using one of the select class methods we can select values from list box 
          
          s.selectByVisibleText("Option2");
          Thread.sleep(500);
          s.selectByValue("option1");
          Thread.sleep(500);
          s.selectByIndex(3);
          Thread.sleep(500);

	      
	      
	}

}
