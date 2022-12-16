package Iframe;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[5]")).click();
		
		//driver.switchTo().frame("iframeResult");
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String mainPage = it.next();
		String secondPage = it.next();
		
		Thread.sleep(5000);
		driver.switchTo().window(secondPage);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Run SQL »']")).click();

	}

}
