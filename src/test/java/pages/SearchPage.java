package pages;

import org.openqa.selenium.WebDriver;

import maps.SearchMap;

public class SearchPage extends BasePage{
	
	SearchMap searchMap = new SearchMap();

	public SearchPage(WebDriver driver) {
		super(driver); 
	}
	
	public void selectProduct() {
		this.clickOn(searchMap.resultField);	
	}	

}
