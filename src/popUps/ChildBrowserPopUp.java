package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      
	      driver.manage().window().maximize();
	      driver.get("https://skpatro.github.io/demo/links/");
	      String mainPageId = driver.getWindowHandle();
	      System.out.println(mainPageId);
	      
	      driver.findElement(By.name("NewWindow")).click();
	      Set<String> allPageIds = driver.getWindowHandles();
          System.out.println(allPageIds);
          
          Iterator<String> it = allPageIds.iterator();
          
          String idOfMainPage=it.next();
          String idOfChildPage=it.next();
          
          driver.switchTo().window(idOfChildPage);
          
          driver.manage().window().maximize();
          driver.findElement(By.id("the7-search")).sendKeys("Pratu");
          driver.switchTo().window(idOfMainPage);
          String mytext = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
          System.out.println("Main Page text is"+mytext);
	}

}
