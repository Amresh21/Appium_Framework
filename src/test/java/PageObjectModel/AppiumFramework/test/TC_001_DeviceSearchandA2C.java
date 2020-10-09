package PageObjectModel.AppiumFramework.test;
import org.testng.annotations.Test;

import PageObjectModel.AppiumFramework.ObjectRepository.LoginScreen;
import PageObjectModel.AppiumFramework.PageObjects.AddressPage;
import PageObjectModel.AppiumFramework.PageObjects.CheckoutPage;
import PageObjectModel.AppiumFramework.PageObjects.LoginPage;
import PageObjectModel.AppiumFramework.PageObjects.PDPPage;
import PageObjectModel.AppiumFramework.PageObjects.SearchPage;
import PageObjectModel.AppiumFramework.common.Driver;
import PageObjectModel.AppiumFramework.common.ReadData;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TC_001_DeviceSearchandA2C {
 
 @BeforeTest
 public void beforeTest() throws Exception 
 {
	  ReadData.fromExternalSource();
	  Driver.Launch("ANDROID");
 }

	
 
  @Test
  public void eComTesting_AddProduct2Cart() 
  
  {
	  LoginPage.login(ReadData.data.get("username"), ReadData.data.get("username"));
	  SearchPage.selectLanguage();
	  SearchPage.searchTV();
	  SearchPage.clickonSearchResults();
	  PDPPage.getProductDetails();
	  PDPPage.addToCart();
	  CheckoutPage.verifyProductDetails();
	  CheckoutPage.proceedtoBuy();
	  AddressPage.addNewAddress();
	  CheckoutPage.continueScreen();
	  
  }
 
  @AfterTest
  public void afterTest()
  {
	  Driver.quitDriver();
  }

}
