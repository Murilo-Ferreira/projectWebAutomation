package pages;

import org.openqa.selenium.WebDriver;

import maps.RegisterFailCheckMap;

public class RegisterFailCheckPage extends BasePage{
	
	RegisterFailCheckMap registerFailCheckMap = new RegisterFailCheckMap(); 
	
	
	public RegisterFailCheckPage(WebDriver driver) {
		super(driver);
	}
	
	public String getRegistrationFailNotification() {
		return this.getElementText(registerFailCheckMap.checkRegisterFailNotification);
		
	}	
	
	public String getRegistrationFieldFail() {
		return this.getElementText(registerFailCheckMap.checkRegisterFail);
	}

}
