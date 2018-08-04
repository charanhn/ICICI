package scripts;
import org.testng.annotations.*;

import generic.Base_Test;
import pom.*;
public class ToVerifyAddtoShoppingCart extends Base_Test {
	
	@BeforeMethod
	@AfterMethod
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
	SCP.testproductname();
	
}

	

}
