package PageObjectModel.AppiumFramework.common;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ActionKeyword extends ObjectConverter
{

	public static void Tap(String [] Object)
	{
		try
		{
			Driver.driver.findElement(OC(Object)).click();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while tapping an Element "+Object[4]);
		}
	}
	
	public static String getText(String [] Object)
	{
		String textvalue="";
		try
		{
			textvalue=Driver.driver.findElement(OC(Object)).getText();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while tapping an Element "+Object[4]);
		}
		return textvalue;
	}
	
	public static void enterText(String [] Object,String valueToEnter)
	{
		try
		{
			Driver.driver.findElement(OC(Object)).clear();
			Driver.driver.findElement(OC(Object)).sendKeys(valueToEnter);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while enterin text in the Element "+Object[4]);
		}	
	}
	
	public static void tapbyIndex(String [] Object, int index)
	{
		try
		{
			List<MobileElement> element=Driver.driver.findElements(OC(Object));
			element.get(index).click();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while tapping the Element "+Object[4]+" using Index "+index);
		}
	}

	public static ArrayList<String> getvaluesinList(String []Object)
	{
		ArrayList<String> listofvalues=new ArrayList<String>();
		
		try
		{
			List<MobileElement> listofelement= (List<MobileElement>)Driver.driver.findElements(OC(Object));
			for(MobileElement eachelement:listofelement)
			{
				listofvalues.add(eachelement.getText());
			}
			System.out.println(listofvalues);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while retrieving text from an Element "+Object[4] +"  "+ e.getLocalizedMessage());
	
		}
		return listofvalues;
	}
	
	@SuppressWarnings("unchecked")
	public static void switchToWebView()
	{
		Set<String> contextNames = Driver.driver.getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		}
		Driver.driver.context((String) contextNames.toArray()[1]); // set context to WEBVIEW_1
		sleep(5000);
	}
	
	public static void navigateBack()
	{
		Driver.driver.navigate().back();
	}
	
	public static void sleep(int timeinMS)
	{
		try
		{
			Thread.sleep(timeinMS);
		}
		catch (Exception e)
		{
			System.out.println("Exception occured while retrieving text from an Element "+timeinMS);
		}
	}
	
	public static void clickusingJS(String Object)
	{
		try
		{
			 JavascriptExecutor js = (JavascriptExecutor)Driver.driver;	
			 MobileElement elementToClick =(MobileElement) Driver.driver.findElement(By.xpath(Object));
			 js.executeScript("arguments[0].click();", elementToClick);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while retrieving text from an Element "+e.getMessage());
		}
	}
	
	public static void waitForObjectToLoad(String[] Object,int seconds)
	{
		try
		{	
			WebDriverWait wait=new WebDriverWait(Driver.driver, seconds);
			MobileElement element;
			element= (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(OC(Object)));
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while waiting for element to present in DOM "+Object[4]);
		}	
		
	}
	public static void scrolldown(String text)
	{
		try
		{
			Driver.driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
	                ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
		}
			catch(Exception e)
		{
				System.out.println("Exception occured while scrolling  for text "+text);

		}
	}
	public static void selectAnyItemfromList(String[] Object)
	{
		try
		{
			List<MobileElement> textViews =	(List<MobileElement>)Driver.driver.findElements(OC(Object));
			textViews.get(textViews.size()-1).click();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while waiting for element to present in DOM "+Object[4]);
		}	
		
	}
	public static boolean verfyIfObjectIsPresent(String[] Object)
	{
		boolean isElementFound=false;
		try
		{	
			 isElementFound = Driver.driver.findElement(OC(Object))!=null;
			 
		}
		catch(Exception e)
		{
			System.out.println(" element is NOT present in DOM "+Object[4]);
		}	
		return isElementFound;
	}	

	
}
