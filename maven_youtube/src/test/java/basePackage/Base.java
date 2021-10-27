package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
