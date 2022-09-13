package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	
	public void initilizeBrowser() {
		//For opening the Browser.
				System.setProperty("webdriver.chrome.driver","C:\\Users\\rich\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				 driver=new ChromeDriver();
				
				//for opening the application.
				driver.get("https://kite.zerodha.com/");
				
				//Maximize the Browser.
				driver.manage().window().maximize();
				
				//Global wait.
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
}
