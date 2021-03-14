package pages;

import org.openqa.selenium.WebDriver;

import maps.TermsCheckMap;

public class TermsCheckPage extends BasePage{
	
	TermsCheckMap termsCheckMap = new TermsCheckMap();

	public TermsCheckPage(WebDriver driver) {
		super(driver); 
	}
	
	public void confirmTermsCheck() {
		this.clickOn(termsCheckMap.searchTermsCheckBox);
		
	}
	
	public void  confirmTermsProceed() {		
		this.clickOn(termsCheckMap.searchProceedTermsButton);
		
	}

}

