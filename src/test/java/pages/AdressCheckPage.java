package pages;

import org.openqa.selenium.WebDriver;

import maps.AdressCheckMap;

public class AdressCheckPage extends BasePage{
	
	AdressCheckMap adressCheckMap = new AdressCheckMap();

	public AdressCheckPage(WebDriver driver) {
		super(driver);
	}
	
	public String getAdressText() {
		return this.getElementText(adressCheckMap.checkAdress);		
	}
	
	public String getCityText() {
		return this.getElementText(adressCheckMap.checkCity);		
	}
	
	public void confirmAdressCheckout() {
		this.clickOn(adressCheckMap.proceedAdressCheckout);
	}
	
	

}
