package pages;

import org.openqa.selenium.WebDriver;

import maps.NewRegisterFailMap;

public class NewRegisterFailPage extends BasePage{
	
	String email = "maria.souza@mail.com";//change email address for every cycle
	String firstName = "Maria";
	String lastName = "Souza";
	String password = "asdf12345";
	String adress =  "1212A Carolina Ave";
	String zipcode = "27909";
	String mobilePhone = "3128792345";
 	
	NewRegisterFailMap newRegisterFailMap = new NewRegisterFailMap();

	public NewRegisterFailPage(WebDriver driver) {
		super(driver); 
	}
	
	public void searchRegisterFailField() {		
		this.sendKeys(newRegisterFailMap.searchNewRegisterFailField, email);
		this.clickOn(newRegisterFailMap.searchNewRegisterFailButton);
		
	}	
	
	public void fillingRegisterFailFields() {
		this.clickOn(newRegisterFailMap.searchGenderFail);
		this.sendKeys(newRegisterFailMap.searchFirstNameFail, firstName);
		this.sendKeys(newRegisterFailMap.searchLastNameFail, lastName);		
		this.sendKeys(newRegisterFailMap.searchPasswordFail, password);
		this.sendKeys(newRegisterFailMap.searchAdressFail, adress);
		this.clickOn(newRegisterFailMap.selectStateFail);
		this.sendKeys(newRegisterFailMap.searchZipcodeFail, zipcode );
		this.sendKeys(newRegisterFailMap.searchPhoneMobileFail, mobilePhone);
		this.clickOn(newRegisterFailMap.searchConcludeRegisterFailButton);		
				
	}

}
