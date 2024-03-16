package Flipcart.QA.cucumber;

import java.io.IOException;

import Filpcart.QA.pageobject.Cartpage;
import Filpcart.QA.pageobject.Homepage;
import Filpcart.QA.pageobject.Productdescription;
import Filpcart.QA.pageobject.Shoppage;
import Flipcart.QA.TestComponent.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Stepdefinitionimpl extends Baseclass{
	Homepage home_page;
	Shoppage shop_page;
	Cartpage cart_page;
	Productdescription prod;
	
	@Given("I landed on filpcart Website")
	public void I_landed_on_filpcart_Website() throws IOException {
		home_page = launchApplication();
	}
	
	@Given("^Searching the product in search box$")
	public void Searching_the_product_in_searchBox() throws IOException {
		shop_page = home_page.searchingProduct();
	}
	
	@When("Select the newest laptop filter")
	public void Select_the_newest_laptop_filter() {
		shop_page.newestProduct();
	}
	
	@Then("Select the laptop")
	public void Select_the_laptop() throws InterruptedException {
		 prod = shop_page.selectingproduct();
	}
	@And("Add the product to cart")
	public void Add_the_product_to_cart() {
		 cart_page = prod.productcartpage();
	}
	@And("place the order")
	public void place_the_order() {
		cart_page.placeorder();
	}
}
