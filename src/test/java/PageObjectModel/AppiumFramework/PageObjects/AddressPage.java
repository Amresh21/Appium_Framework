package PageObjectModel.AppiumFramework.PageObjects;

import PageObjectModel.AppiumFramework.ObjectRepository.AddressScreen;
import PageObjectModel.AppiumFramework.common.ActionKeyword;
import PageObjectModel.AppiumFramework.common.ReadData;

public class AddressPage extends ActionKeyword {

	public static void addNewAddress() {
		
		enterText(AddressScreen.addressFullName, ReadData.data.get("addressFullName"));
		enterText(AddressScreen.addressPhoneNumber,ReadData.data.get("phonenumber"));
		enterText(AddressScreen.addressPostalcode, ReadData.data.get("addresspincode"));
		enterText(AddressScreen.addressLine1, ReadData.data.get("addressline1"));
		enterText(AddressScreen.addressLine2, ReadData.data.get("addressline2"));
		enterText(AddressScreen.addressLandmark, ReadData.data.get("addresslandmark"));
		enterText(AddressScreen.addressCity, ReadData.data.get("addresscity"));
		if(verfyIfObjectIsPresent(AddressScreen.newAddress))
		{
			Tap(AddressScreen.newAddress);
		}
	}

}
