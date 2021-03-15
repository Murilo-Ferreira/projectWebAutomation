package pages;

import org.openqa.selenium.WebDriver;

import maps.CartCheckMap;

public class CartCheckPage extends BasePage{
	
	CartCheckMap cartcheckMap = new CartCheckMap();

	public CartCheckPage(WebDriver driver) {
		super(driver);
	}
	
	public String getfirstproductText() {
		return this.getElementText(cartcheckMap.firstcartproduct);
	}	
	
	public void confirmCheckout() {
		this.clickOn(cartcheckMap.searchButton);
	}

}
