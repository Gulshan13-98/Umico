package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShoppingCartPage;

public class ShoppingCartStep  {
    public static ShoppingCartPage shoppingCartPage;

    public ShoppingCartStep(){
        shoppingCartPage = new ShoppingCartPage();
    }

    @When("user Navigates To The Shopping Cart")
    public void userNavigatesToTheShoppingCart() {
        shoppingCartPage.clickCart();
    }

    @When("the user enters the product catalog")
    public void userEntresTheProductCatalog() {
       shoppingCartPage.clickProducts();
    }

    @And("the user clicks on smart device items from the product catalog")
    public void userClicksOnSmartDevicesItems() {
       shoppingCartPage.clickSmartDevices();


    }

    @And("the user clicks on mobile phones and smartphones")
    public void userClicksOnMobile() {
        shoppingCartPage.clickMobilePhone();
    }

    @And("user selects apple iphone pro max desert titanium")
    public void theUserAddsIphoneToTheCart() {
        shoppingCartPage.clickIphonePro();

    }

    @Then("product successfully added to shopping cart")
    public void productAddedToShoppingCart() throws InterruptedException {
        shoppingCartPage.clickAddToCartButton();
        shoppingCartPage.clickChooseShopButton();
    }



      @Given("the user increases the quantity of the smartphone")
    public void theProductIncreases() throws InterruptedException {
        shoppingCartPage.clickTheProductIncreases();

    }

    @When("the user decreases the smartphone quantity")
    public void theProductDecreases() {
        shoppingCartPage.clickTheProductDecreases();
    }

    @And("the smartphone is being removed from the cart")
    public void smartPhoneRemovedFromTheCart() {
        shoppingCartPage.clickTheProductRemoves();
    }

    @Then("the product was successfully removed from the cart")
    public void the_smartphone_should_no_longer_be_in_the_shopping_cart() {
        shoppingCartPage.clickProductRemoved();
    }




}
