package pages;

import org.openqa.selenium.WebDriver;

import maps.ValidatePriceMap;

public class ValidatePricePage extends BasePage{
	
	ValidatePriceMap validatePriceMap = new ValidatePriceMap();

	public ValidatePricePage(WebDriver driver) {
		super(driver);
	}	
	
	public String searchFieldProductsPrice() {
		return this.getElementText(validatePriceMap.searchFielProductsPrice);		
		
	}
	
	public String searchFieldShippingPrice() {
		return this.getElementText(validatePriceMap.searchFielShippingPrice);		
		
	}
	
	public String searchFieldTotalPrice() {
		return this.getElementText(validatePriceMap.searchFielTotalPrice);		
		
	}
 
}
