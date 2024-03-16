package Filpcart.QA.Test;

import java.io.IOException;

import org.testng.annotations.Test;
import Filpcart.QA.pageobject.*;
import Flipcart.QA.TestComponent.Baseclass;

public class Filpcartorderplacing extends Baseclass {
	Homepage home_page;
	String laptop_need_to_select_in_shoppage = "Apple MacBook Air Apple M3 - (8 GB/256 GB SSD/macOS Sonoma) MRXT3HN/A";

	@Test
	public void orderplacing() throws IOException, InterruptedException {
		home_page = launchApplication();
		
		Shoppage shop_page = home_page.searchingProduct();
		shop_page.newestProduct();
		Productdescription prod = shop_page.selectingproduct();
		Cartpage cart_page = prod.productcartpage();
		cart_page.placeorder();
	}
}
