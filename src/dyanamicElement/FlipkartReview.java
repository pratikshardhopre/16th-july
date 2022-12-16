package dyanamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartReview {

	
		public static void main(String[] args) throws InterruptedException
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\16th July Even\\Selenium\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.name("q")).sendKeys(" I phone 14 pro max");
			Thread.sleep(100);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
//			Thread.sleep(1000);
//			String reviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
//			
//			
//			System.out.println("Todays reviews are "+reviews);

	}

}
