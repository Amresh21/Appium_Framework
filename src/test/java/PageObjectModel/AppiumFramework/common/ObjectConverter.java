package PageObjectModel.AppiumFramework.common;
import org.openqa.selenium.By;

public class ObjectConverter
{

	public static By OC(String [] objectProperty)
	{
		By by=null;
		if(Driver.isAndroidDriver)
		{
			by=setlocator(objectProperty[0],objectProperty[1]);
		}
		else
		{
			by=setlocator(objectProperty[2],objectProperty[3]);
		}
		return by;
	}
	
	public static By setlocator(String type,String value)
	{
		By by = null;
		if(type.equals("xpath"))
		{
			by=(By.xpath(value));		
		}
		else if(type.equals("id"))
		{
			by=(By.id(value));		
		}
		else if(type.equals("name"))
		{
			by=(By.name(value));		
	
		}
		else if(type.equals("classname"))
		{
			by=(By.className(value));		

		}
		else if(type.equals("css"))
		{
			by=(By.cssSelector(value));		
		}
		else
		{
			try 
			{
				throw new Exception("Object Property is Invalid "+type);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return by;
	}
	
	public static By OC(String [] objectProperty,String textToreplace)
	{
		By by=null;
		String actualAndroidXpath=objectProperty[1];
		String actualiOSXpath=objectProperty[3];

		if(Driver.isAndroidDriver)
		{
			objectProperty[1]=objectProperty[1].replace("??", textToreplace);
			by=setlocator(objectProperty[0],objectProperty[1]);
			objectProperty[1]=actualAndroidXpath;
		}
		else
		{
			objectProperty[3]=objectProperty[3].replace("??", textToreplace);
			by=setlocator(objectProperty[2],objectProperty[3]);
			objectProperty[3]=actualiOSXpath;
		}
		return by;
	}
}
