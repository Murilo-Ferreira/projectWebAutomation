package steps;

import static core.DriverFactory.getDriver;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AdressCheckPage;
import pages.CartCheckPage;
import pages.HomePage;
import pages.NewRegisterPage;
import pages.PaymentPage;
import pages.ProductPage;
import pages.PurchaseConfirmationPage;
import pages.SearchPage;
import pages.TermsCheckPage;
import pages.ValidatePricePage;

public class MainTestCase {
	
	HomePage homePage; 
	SearchPage searchPage;
	ProductPage productPage;
	CartCheckPage cartCheckPage;
	NewRegisterPage newRegisterPage;
	AdressCheckPage adressCheckPage;
	TermsCheckPage termsCheckPage;
	ValidatePricePage validatePricePage;
	PaymentPage paymentPage;
	PurchaseConfirmationPage purchaseConfirmationPage;
	
	public MainTestCase(){
		homePage = new HomePage(getDriver());
		searchPage = new SearchPage(getDriver());
		productPage = new ProductPage(getDriver());
		cartCheckPage = new CartCheckPage(getDriver());
		newRegisterPage = new NewRegisterPage(getDriver());
		adressCheckPage = new AdressCheckPage(getDriver());
		termsCheckPage = new TermsCheckPage(getDriver());
		validatePricePage = new ValidatePricePage(getDriver());
		paymentPage = new PaymentPage(getDriver());
		purchaseConfirmationPage = new PurchaseConfirmationPage(getDriver());
	}
		
	@Given("^I choose a Blouse in the web store$")
	public void chooseAnyProductInTheWebstore() throws Throwable {
	    homePage.searchProduct();	    
	}

	@Given("^Add the product in your Cart$")
	public void addAProductInYourCart() throws Throwable {	   
		searchPage.selectProduct();
		productPage.addProduct();
		assertTrue(productPage.confirmProduct());
	}

	@Given("^I proceed to checkout$")
	public void proceedToCheckout() throws Throwable {
		productPage.proceedtoCheckout();
	    	   
	}

	@Then("^Validate the product was added correctly and proceed to checkout if the product is correct$")
	public void validateTheProductWasAddedCorrectly() throws Throwable {
		assertTrue(cartCheckPage.getfirstproductText().contains("Blouse"));
		cartCheckPage.confirmCheckout();	    	    
	}
	
	@Given("^Create an account filling in all requireds fields$")
	public void createAnAccountFillingInAllRequiredsFields() throws Throwable {
		newRegisterPage.searchRegisterField();
		newRegisterPage.fillingRegisterFields();
	}
	
	@Then("^Validate the adress and proceed$")
	public void validateTheAdressAndProceed() throws Throwable {
	    assertTrue(adressCheckPage.getAdressText().contains("1212A Carolina Ave"));
	    assertTrue(adressCheckPage.getCityText().contains("Elizabeth City, North Carolina 27909"));
	    adressCheckPage.confirmAdressCheckout();
	    
	}
		
	@Then("^Agree with Terms of Service and proceed$")
	public void agreeWithTermsOfServiceAndProceed() throws Throwable {
		termsCheckPage.confirmTermsCheck();
		termsCheckPage.confirmTermsProceed();
	    
	}
	
	@Then("^Validate total price$")
	public void validateTotalPrice() throws Throwable {
		assertTrue(validatePricePage.searchFieldProductsPrice().contains("$27.00"));
		assertTrue(validatePricePage.searchFieldShippingPrice().contains("$2.00"));
		assertTrue(validatePricePage.searchFieldTotalPrice().contains("$29.00"));

	}

	@Then("^Choose the payment method$")
	public void chooseThePaymentMethod() throws Throwable {
		paymentPage.choosePaymentMethod();
		
	}

	@Then("^Confirm the purchase and validate that it has been successfully completed$")
	public void confirmThePurchaseAndValidateThatItHasBeenSuccessfullyCompleted() throws Throwable {
		purchaseConfirmationPage.getOrderConfirmation();
		assertTrue(purchaseConfirmationPage.getPurchaseConfirmatiom().contains("Your order on My Store is complete."));
	    
	}
}
