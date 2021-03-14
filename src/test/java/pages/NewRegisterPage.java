package pages;

import org.openqa.selenium.WebDriver;

import maps.NewRegisterMap;

public class NewRegisterPage extends BasePage{
	
	String email = "maria3@mail.com";//change email address for every cycle
	String firstName = "Maria";
	String lastName = "Souza";
	String password = "asdf12345";
	String adress =  "1212A Carolina Ave";
	String city = "Elizabeth City";
	String zipcode = "27909";
	String mobilePhone = "3128792345";
 	
	NewRegisterMap newregisterMap = new NewRegisterMap();

	public NewRegisterPage(WebDriver driver) {
		super(driver); 
	}
	
	public void searchRegisterField() {		
		this.sendKeys(newregisterMap.searchNewRegisterField, email);
		this.clickOn(newregisterMap.searchNewRegisterButton);
		
	}	
	
	public void fillingRegisterFields() {
		this.clickOn(newregisterMap.searchGender);
		this.sendKeys(newregisterMap.searchFirstName, firstName);
		this.sendKeys(newregisterMap.searchLastName, lastName);		
		this.sendKeys(newregisterMap.searchPassword, password);
		this.sendKeys(newregisterMap.searchAdress, adress);
		this.sendKeys(newregisterMap.searchCity, city);
		this.clickOn(newregisterMap.selectState);
		this.sendKeys(newregisterMap.searchZipcode, zipcode );
		this.sendKeys(newregisterMap.searchPhoneMobile, mobilePhone);
		this.clickOn(newregisterMap.searchConcludeRegisterButton);		
				
	}

}
