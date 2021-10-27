package test_classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_classes.youtube_Homepage;
import basePackage.Base;

public class ToPlayTheSong extends Base
{
	private WebDriver driver;
	private youtube_Homepage homepage;
	
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browser)
	{
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver =openChromeBrowser();
		}
		else
		{
			driver=openFirefoxBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
	}
	@BeforeClass
	public void applicationLaunch()
	{
		
		homepage=new youtube_Homepage(driver);
	}
	
	@BeforeMethod
	public void pre()
	{
		homepage.enterIntoSearchbar("Ranjha");
	}
	
	@Test
	public void playTheSong()
	{
		homepage.selectSong();
		homepage.clickToFullscreen();
	}
	
	@AfterClass
	public void exit()
	{
		driver.close();
	}
	
	
}
