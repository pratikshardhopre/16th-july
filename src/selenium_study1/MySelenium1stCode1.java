package selenium_study1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium1stCode1 {

	public static void main(String[] args)
	{
         System.setProperty("webdriver.chrome.driver", "D:\\16th july selenium\\selenium-java-4.4.0\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com/");
	}

}
