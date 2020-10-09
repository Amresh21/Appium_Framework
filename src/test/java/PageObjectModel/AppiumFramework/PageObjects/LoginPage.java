package PageObjectModel.AppiumFramework.PageObjects;

import PageObjectModel.AppiumFramework.ObjectRepository.LoginScreen;
import PageObjectModel.AppiumFramework.ObjectRepository.SearchScreen;
import PageObjectModel.AppiumFramework.common.ActionKeyword;


public class LoginPage extends ActionKeyword
{

	
	public static void login(String email,String password)
	{
		Tap(LoginScreen.signInButton);
		waitForObjectToLoad(LoginScreen.emailID,20);
		
		enterText(LoginScreen.emailID,email);
		Tap(LoginScreen.continueButton);
		enterText(LoginScreen.emailPwd,password);
		Tap(LoginScreen.loginButton);
		waitForObjectToLoad(SearchScreen.languageSelection,20);
		
	}
	
	
	
	
}
