package pages;

import org.openqa.selenium.WebDriver;

import maps.CartCheckFailMap;

public class CartCheckFailPage extends BasePage{
	
	CartCheckFailMap cartCheckFailMap = new CartCheckFailMap();

	public CartCheckFailPage(WebDriver driver) {
		super(driver);
	}
	
	public String getWrongProductText() {
		return this.getElementText(cartCheckFailMap.checkCartProductFailField);
		
	}	

}
