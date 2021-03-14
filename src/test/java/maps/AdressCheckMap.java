package maps;

import org.openqa.selenium.By;

public class AdressCheckMap {		
	public By checkAdress = By.xpath("//ul[@id='address_delivery']/li[3]");
	public By checkCity = By.xpath("//ul[@id='address_delivery']/li[4]");
	public By proceedAdressCheckout = By.xpath("//div[@id='center_column']/form/p/button/span");
	
}
