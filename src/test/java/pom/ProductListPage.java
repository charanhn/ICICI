package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class ProductListPage extends Base_Page {
	
	public ProductListPage(WebDriver driver) {
		super(driver);
	
	}
	
	//Declaration
	
	@FindBy(xpath = "(//h2[@class='product-name']//a)[2]")
	private WebElement shoes;

	
	// Utilization
	
	public void shoesclick()
	{
		clickLink(shoes);
	}
	
	
	}
	
