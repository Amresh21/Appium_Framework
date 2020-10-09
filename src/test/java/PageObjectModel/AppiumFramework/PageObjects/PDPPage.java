package PageObjectModel.AppiumFramework.PageObjects;

import java.util.HashMap;
import PageObjectModel.AppiumFramework.ObjectRepository.PDPScreen;
import PageObjectModel.AppiumFramework.ObjectRepository.SearchScreen;
import PageObjectModel.AppiumFramework.common.ActionKeyword;

public class PDPPage extends ActionKeyword
{
	public static HashMap<String,String> productDetails;
	
	public static void addToCart()
	{
		scrolldown("Add to Cart");
		Tap(PDPScreen.addToCart);
		Tap(PDPScreen.cartCount);
	}
	public static void clickonSearchResults()
	{
		Tap(SearchScreen.searchResultsLbl);

	}
	
	public static void getProductDetails()
	{
		try
		{
		productDetails = new HashMap<String,String>();
		productDetails.put("customerReview", getText(PDPScreen.customerReviewLink));
		productDetails.put("productDescription", getText(PDPScreen.productDescription));
		productDetails.put("productPrice", getText(PDPScreen.productPrice));
		}
		catch(Exception e)
		{
			System.out.println("exception in storing values in map object  "+e.getMessage());
		}
	}
}
