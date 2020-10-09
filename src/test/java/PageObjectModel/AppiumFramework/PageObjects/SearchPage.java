package PageObjectModel.AppiumFramework.PageObjects;

import java.util.Random;
import PageObjectModel.AppiumFramework.ObjectRepository.SearchScreen;
import PageObjectModel.AppiumFramework.common.ActionKeyword;
import PageObjectModel.AppiumFramework.common.ReadData;

public class SearchPage extends ActionKeyword
{

	public static void selectLanguage()
	{
		waitForObjectToLoad(SearchScreen.languageSelection,20);
		Tap(SearchScreen.languageSelection);
		Tap(SearchScreen.saveChangesButton);
		

	}
	public static void searchTV()
	{
		waitForObjectToLoad(SearchScreen.searchTxt,20);
		Tap(SearchScreen.searchTxt);
		sleep(3000);
		enterText(SearchScreen.searchTxt, ReadData.data.get("product"));
	}
	public static void clickonSearchResults()
	{
		selectAnyItemfromList(SearchScreen.search65InchTV);
		Random rand = new Random();
		int randomIndex =rand.nextInt(4);
		tapbyIndex(SearchScreen.searchProductList,randomIndex);
	}
	
	public static void deliveryLocation()
	{
		System.out.println("searchResultsLbl"+SearchScreen.searchResultsLbl+" searchProductList"+SearchScreen.searchProductList);
		tapbyIndex(SearchScreen.searchProductList,1);
	}
		
	
}
