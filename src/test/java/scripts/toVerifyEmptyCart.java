package scripts;


import org.testng.annotations.Test;

import generic.Base_Test;
import pom.HomePage;
import pom.ProductDetailsPage;
import pom.ProductListPage;
import pom.ShoppingCartPage;

public class toVerifyEmptyCart extends Base_Test {
	

	@Test
public void testToVerifyAddtoShoppingCart()
{
	HomePage home = new HomePage(driver);
	home.menMouseAction();
	home.runningClick();
	ProductListPage PLP= new ProductListPage(driver);
	PLP.shoesclick();
	ProductDetailsPage PDP= new ProductDetailsPage(driver);
	PDP.testsizedropdown();
	PDP.testselectsize();
	PDP.testaddtocart();
	ShoppingCartPage SCP = new ShoppingCartPage(driver);
	SCP.testemptycart();
	SCP.testemptycarttext();
}

	

}
