package pages;

import org.openqa.selenium.WebDriver;

import maps.HomeSearchFailCaseMap;

public class HomeSearchFailCasePage extends BasePage{
	
	HomeSearchFailCaseMap homeSearchFailCaseMap = new HomeSearchFailCaseMap();

	public HomeSearchFailCasePage(WebDriver driver) {
		super(driver);
	}
	
	public void searchWrongProduct() {
		this.goToURL("http://automationpractice.com/index.php");
		this.sendKeys(homeSearchFailCaseMap.searchFailField, "Coat");
		this.clickOn(homeSearchFailCaseMap.searchFailButton);		 
	}	

}