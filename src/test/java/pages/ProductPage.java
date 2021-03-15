package pages;

import org.openqa.selenium.WebDriver;

import maps.ProductMap;

public class ProductPage extends BasePage{
	
	 
	ProductMap productMap = new ProductMap();
	

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public void addProduct() {
		this.clickOn(productMap.addtocartButton);	
	}
	
	public boolean confirmProduct() {
		return this.isElementDisplayed(productMap.confirmationCheck);
	}
	
	public void proceedtoCheckout() {
		this.clickOn(productMap.proceedtoCheckout);	
	}

}
