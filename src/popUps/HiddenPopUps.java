package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUps {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      
	      driver.manage().window().maximize();
	      driver.get("https://www.flipkart.com/");
	      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	      driver.findElement(By.name("q")).sendKeys("I phone 14 pro max");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
