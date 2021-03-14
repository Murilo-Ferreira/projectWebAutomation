package pages;

import org.openqa.selenium.WebDriver;

import maps.HomeMap;

public class CheckoutPage extends BasePage{
	
	HomeMap homeMap = new HomeMap();

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public void searchProduct() {
		this.goToURL("http://automationpractice.com/index.php");
		this.sendKeys(homeMap.searchField, "Blouse");
		this.clickOn(homeMap.searchButton);		
	}	

}
