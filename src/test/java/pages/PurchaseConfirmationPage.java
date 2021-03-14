package pages;

import org.openqa.selenium.WebDriver;

import maps.PurchaseConfirmationMap;

public class PurchaseConfirmationPage extends BasePage{
	
	PurchaseConfirmationMap purchaseConfirmationMap = new PurchaseConfirmationMap();

	public PurchaseConfirmationPage(WebDriver driver) {
		super(driver); 
	}
	
	public void getOrderConfirmation() {
		this.clickOn(purchaseConfirmationMap.confirmOrderButton);		
	}	
	
	public String getPurchaseConfirmatiom() {
		return this.getElementText(purchaseConfirmationMap.confirmOrderCheck);
	}
	
}
