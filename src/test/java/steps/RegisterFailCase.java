package steps;

import static core.DriverFactory.getDriver;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import pages.CartCheckPage;
import pages.HomePage;
import pages.NewRegisterFailPage;
import pages.ProductPage;
import pages.RegisterFailCheckPage;
import pages.SearchPage;

public class RegisterFailCase {
	
	HomePage homePage; 
	SearchPage searchPage;
	ProductPage productPage;
	CartCheckPage cartCheckPage;
	NewRegisterFailPage newRegisterFailPage;
	RegisterFailCheckPage registerFailCheckPage;
	
	
	public RegisterFailCase(){
		homePage = new HomePage(getDriver());
		searchPage = new SearchPage(getDriver());
		productPage = new ProductPage(getDriver());
		cartCheckPage = new CartCheckPage(getDriver());
		newRegisterFailPage = new NewRegisterFailPage(getDriver());
		registerFailCheckPage = new RegisterFailCheckPage(getDriver());
		
	}
		
	@Then("^Create an account without filling in all requireds fields$")
	public void createAnAccountWithoutFillingInAllRequiredsFields() throws Throwable {
	    newRegisterFailPage.searchRegisterFailField();
	    newRegisterFailPage.fillingRegisterFailFields();
		
	}

	@Then("^I should see an error message with required fields$")
	public void iShouldSeeAnErrorMessageWithRequiredFields() throws Throwable {
		assertTrue(registerFailCheckPage.getRegistrationFailNotification().contains("There is 1 error"));
		assertTrue(registerFailCheckPage.getRegistrationFieldFail().contains("city is required."));
	    
	}

}
