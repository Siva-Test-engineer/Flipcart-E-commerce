package Filpcart.QA.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.performance.Performance;
import org.openqa.selenium.interactions.Actions;

public class standaloneTest {

	public static void main(String[] args) throws InterruptedException {
		String laptop_need_to_select_in_shoppage = "Apple MacBook Air Apple M3 - (8 GB/256 GB SSD/macOS Sonoma) MRXT3HN/A";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement move = driver.findElement(By.xpath("//form[@class='_2rslOn header-form-search']"));
		Actions a = new Actions(driver);
		a.moveToElement(move).click().sendKeys("Laptop").sendKeys(Keys.ENTER).perform();
		a.moveToElement(driver.findElement(By.xpath("//div[text()='Newest First']"))).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);
		a.moveToElement(driver.findElement(By.xpath("//*[text()='Add to cart']"))).click().build().perform();
		driver.findElement(By.xpath("//*[text()='Place Order']")).click();

	}
}

/*
 * int flag = 0; while (flag == 0) { for (int j = 2; j <= 10; j++) {
 * 
 * for (WebElement i : driver.findElements(By.xpath("//div[@class='_4rR01T']")))
 * { if (i.getText().contentEquals(laptop_need_to_select_in_shoppage)) { String
 * laptopname = i.getText(); i.click(); flag = 1; break; } }
 * driver.findElement(By.xpath("//nav[@class='yFHi8N']/a[@class='_1LKTO3']")).
 * click(); } }
 * 
 * Thread.sleep(5000); WebElement cartbuttonElement =
 * driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
 * a.moveToElement(cartbuttonElement).contextClick().build().perform();
 */

/*
 * Open Flipkart Website: Open the ShopNow website: https://www.flipkart.com
 * Verify that the homepage loads successfully.
 * --------------------------------------------- Search and Add to Cart: In the
 * search bar, type "laptop" and press Enter. Click on one of the search results
 * to view the product details. Add the selected laptop to the shopping cart.
 * ------------------------------------------------ Proceed to Checkout:
 * Navigate to the shopping cart. Verify that the correct item is in the cart.
 * Click on the "Proceed to Checkout" button. User Authentication: On the login
 * page, enter valid credentials (username and password) to log in. Verify that
 * the user is successfully logged in. Shipping Information: Enter valid
 * shipping information (address, city, state, and zip code). Proceed to the
 * next step. Payment Information: Choose a payment method (credit card, for
 * example). Review Order: Verify the order summary. Do not proceed to the final
 * order placement.
 */
