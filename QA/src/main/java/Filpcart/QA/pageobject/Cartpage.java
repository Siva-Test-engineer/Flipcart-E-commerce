package Filpcart.QA.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	WebDriver driver;

	public Cartpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Place Order']")
	WebElement placeorderbuttonWebElement;

	public void placeorder() {
		placeorderbuttonWebElement.click();
	}	
}
