package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class youtube_Homepage 
{
	private WebDriver driver;
	@FindBy (xpath="//input[@id='search']")
	private WebElement searchbar;
	
	@FindBy (xpath="//button[@id='search-icon-legacy']")
	private WebElement searchbutton;
	
	@FindBy (xpath="(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")
	private WebElement selectsong;
	
	@FindBy (xpath="//div[text()='Skip Ads']")
	private WebElement skip;
	
	@FindBy (xpath="(//button[@class='ytp-fullscreen-button ytp-button'])[1]")
	private WebElement fullscreen;
	
	public youtube_Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterIntoSearchbar(String content)
	{
		searchbar.sendKeys(content);
		searchbutton.click();
	}
	
	public void selectSong()
	{
		
		selectsong.click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(skip));
		skip.click();
	}
	
	public void clickToFullscreen()
	{
		fullscreen.click();
	}
}
