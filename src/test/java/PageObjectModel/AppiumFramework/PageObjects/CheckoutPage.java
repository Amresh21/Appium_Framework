package PageObjectModel.AppiumFramework.PageObjects;

import org.testng.Assert;
import PageObjectModel.AppiumFramework.ObjectRepository.CheckoutScreen;
import PageObjectModel.AppiumFramework.common.ActionKeyword;
import PageObjectModel.AppiumFramework.common.Driver;

public class CheckoutPage extends ActionKeyword
{
	public static void verifyProductDetails()
	{
		try
		{
		String expectedProductPrice   = PDPPage.productDetails.get("productPrice");
		String actualProductPrice=Driver.driver.findElement(OC(CheckoutScreen.ProductDescription,expectedProductPrice.replace("rupees ", ""))).getText();
		       actualProductPrice=actualProductPrice.replace("   ", "").replace(".00", "");
			if(expectedProductPrice.contains(actualProductPrice))
			{
				Assert.assertTrue(true, "Verifying the Expected price equals Actual Price");
			}
			else
			{
				Assert.assertTrue(false, "Expected ["+expectedProductPrice+"], Actual Price ["+actualProductPrice+"]");	
			}
		}
		catch(Exception e)
		{
			System.out.println("exception in product details "+e.getMessage());
		}
	}
	public static void continueScreen()
	{
		scrolldown("Continue");
		for(int i=0;i<=3;i++)
		{
			Tap(CheckoutScreen.proceedToContinue);
		}
	}
	
	public static void proceedtoBuy()
	{
		Tap(CheckoutScreen.proceedToBuy);
	}
}
