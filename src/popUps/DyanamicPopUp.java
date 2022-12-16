package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      
	      driver.manage().window().maximize();
	      driver.get("https://www.flipkart.com/");
	      
	      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	      driver.findElement(By.name("q")).sendKeys("One Plus neckband earphone");
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      Thread.sleep(3000);
	     String mytext = driver.findElement(By.xpath("((//div[@data-id='ACCGF4JZHYTERVTY']//span)[2])")).getText();
	      System.out.println(mytext);
	      		
	      

	}

}
