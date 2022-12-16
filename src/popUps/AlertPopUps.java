package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      
	      driver.manage().window().maximize();
	      driver.get("https://demoqa.com/alerts");
	      driver.findElement(By.id("alertButton")).click();
	      Thread.sleep(1000);
	      
	      Alert alt=driver.switchTo().alert();
	      alt.accept(); 
	      
	      //driver.findElement(By.xpath())
	      

	}

}
