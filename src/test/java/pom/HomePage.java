package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class HomePage extends Base_Page {
	
	public HomePage(WebDriver driver) {
		super(driver);
	
	}
	
	//Declaration
	
	@FindBy(xpath = "(//a[@class='digimeg-nav-item'])[1]")
	private WebElement men;

	
	@FindBy(xpath = "(//div[@class='digimeg-nav-chunk']//a[.='Running'])[1]")
	private WebElement running;


	// Utilization
	public void menMouseAction() {
		mouseHoverAction(driver, men);
	}
	
	public void runningClick()
	{
		clickLink(running);
	}
	
	
	}
	
