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
	
	public void forcedWait(int time) {
		time = 10; 
		
		try {
			System.out.println("Waiting for %d seconds..."+time);
			Thread.sleep(time*1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
