package Filpcart.QA.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//form[@class='_2rslOn header-form-search']")
	WebElement searchBoxWebElement;

	@FindBy(xpath = "//div[text()='Newest First']")
	WebElement newestproductWebElement;

	public void launchapp(String urlString) {
		driver.get(urlString);
	}

	public Shoppage searchingProduct() {
		Actions a = new Actions(driver);
		a.moveToElement(searchBoxWebElement).click().sendKeys("Laptop").sendKeys(Keys.ENTER).perform();
	    Shoppage shop_page = new Shoppage(driver);
	    return shop_page;
	
	}

	
}