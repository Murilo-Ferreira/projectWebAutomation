package pages;

import org.openqa.selenium.WebDriver;

import maps.PaymentMap;

public class PaymentPage extends BasePage{
	
	PaymentMap paymentMap = new PaymentMap();

	public PaymentPage(WebDriver driver) {
		super(driver); 
	}
	
	public void choosePaymentMethod() {	
		this.clickOn(paymentMap.paymentButton);		
	}		

}
