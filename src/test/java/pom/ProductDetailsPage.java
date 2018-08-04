package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class ProductDetailsPage extends Base_Page {
	
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	
	}
	
	//Declaration
	
	@FindBy(xpath = "//div[@class='product-size-click-btn' ]//span[@class='caret']")
	private WebElement sizedropdown;

	
	@FindBy(xpath = "(//span[@class='swatch-label2'])[1]")
	private WebElement selectsize;

	@FindBy(xpath = "(//span[.='Add to Cart'])[2]")
	private WebElement addtocart;

	
	// Utilization
	
	public void testsizedropdown()
	{
		clickLink(sizedropdown);
	}
	
	public void testselectsize()
	{
		clickLink(selectsize);
	}
	
	public void testaddtocart()
	{
		clickLink(addtocart);
	}
	
	
	}
	
