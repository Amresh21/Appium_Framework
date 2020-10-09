package PageObjectModel.AppiumFramework.ObjectRepository;

public class PDPScreen 
{
	
	
public static String [] addToCart = {"xpath","//*[@resource-id='add-to-cart-button']","xpath","iosXpath","addToCart"};

//if proceed cart not found
public static String [] cartCount = {"id","action_bar_cart_count","xpath","iosXpath","cartCount"};
public static String [] continueButton = {"xpath","//*[@text='Continue']","xpath","iosXpath","continueButton"};

//if proceed cart found
public static String [] proceedToCheckout = {"xpath","//*[@text='Proceed to checkout']","xpath","iosXpath","proceedToCheckout"};

public static String [] customerReviewLink = {"xpath","//*[@resource-id='acrCustomerReviewLink']","xpath","iosXpath","customerReviewLink"};
public static String [] productDescription = {"xpath","//*[@resource-id='acrCustomerReviewLink']/following::*[1]","xpath","iosXpath","productDescription"};
public static String [] productPrice = {"xpath","//*[contains(@text,'rupees')]","xpath","iosXpath","productPrice"};

}
