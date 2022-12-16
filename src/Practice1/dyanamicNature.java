package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dyanamicNature {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
		ChromeOptions chrome=new ChromeOptions();
		//chrome.addArguments("headless");
		//chrome.addArguments("incognito");
		//chrome.addArguments("start-maximized");
		chrome.addArguments("version");
		
		
		
		
		WebDriver driver= new ChromeDriver(chrome);
		driver.manage().window().maximize();
		
		driver.get("https://www.moneycontrol.com/stocksmarketsindia/");
		String money = driver.findElement(By.xpath("((//table[@class='mctable1'])[20]//tbody//td)[2]")).getText();
         System.out.println(money);
	}
	

}
