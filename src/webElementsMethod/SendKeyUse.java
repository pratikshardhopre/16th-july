package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyUse {

	public static void main(String[] args) throws InterruptedException //throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://vctcpune.com/");
//		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("Hi I'm velocity");
//		Thread.sleep(1000);
        driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Open FB");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		WebElement emailIdField=driver.findElement(By.xpath("//input[@id='email']"));
		emailIdField.sendKeys("1234");
		Thread.sleep(1000);
		emailIdField.clear();
		
		emailIdField.sendKeys("xyz");
		Thread.sleep(1000);
		
		;
	}

}
