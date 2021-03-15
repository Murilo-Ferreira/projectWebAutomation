package steps;

import static core.DriverFactory.getDriver;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CartCheckFailPage;
import pages.HomeSearchFailCasePage;

public class ProductFailCase {
	
	HomeSearchFailCasePage homeSearchFailCasePage; 
	CartCheckFailPage cartCheckFailPage;

	
	public ProductFailCase(){
		
		homeSearchFailCasePage = new HomeSearchFailCasePage(getDriver()); 
		cartCheckFailPage = new CartCheckFailPage(getDriver());

	}
	
	@Given("^Search a product that don't existe in web store$")
	public void searchAProductThatDonTExisteInWebStore() throws Throwable {
		homeSearchFailCasePage.searchWrongProduct();
	}
	

	@Then("^Validate the product don't exist$")
	public void validateTheProductDonTExist() throws Throwable {
		assertTrue(cartCheckFailPage.getWrongProductText().contains("No results were found for your search \"Coat\""));	    
	    
	}

}
