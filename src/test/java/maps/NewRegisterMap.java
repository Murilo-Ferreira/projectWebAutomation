package maps;

import org.openqa.selenium.By;

public class NewRegisterMap {
	public By searchNewRegisterField = By.id("email_create");
	public By searchNewRegisterButton = By.xpath("//button[@id='SubmitCreate']/span");
	public By searchGender = By.id("id_gender2");
	public By searchFirstName = By.id("customer_firstname");
	public By searchLastName = By.id("customer_lastname");
	public By searchEmail = By.id("email");
	public By searchPassword = By.id("passwd");
	public By searchAdress = By.id("address1");
	public By searchCity = By.id("city");
	public By selectState = By.xpath("//option[@value='33']");
	public By searchZipcode = By.id("postcode");
	public By searchPhoneMobile = By.id("phone_mobile");
	public By searchConcludeRegisterButton = By.xpath("//button[@id='submitAccount']/span");	
 	
}
