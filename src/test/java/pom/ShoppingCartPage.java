package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class ShoppingCartPage extends Base_Page {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);

	}

	// Declaration

	@FindBy(xpath = "//h2[@class='product-name']")
	private WebElement productname;

	@FindBy(xpath = "(//span[.='Empty Cart'])[2]")
	private WebElement emptycart;

	@FindBy(xpath = "//h1[.='Shopping Cart is Empty']")
	private WebElement emptycarttext;
	//
	// Utilization

	public void testproductname() {
		isdisplayed(productname);
	}

	public void testemptycart() {
		clickLink(emptycart);
	}

	public void testemptycarttext() {
		clickLink(emptycarttext);
	}

}