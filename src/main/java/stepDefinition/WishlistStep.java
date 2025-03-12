package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WishlistPage;

public class WishlistStep {

    public static WishlistPage wishlistPage;

    public WishlistStep (){
        wishlistPage = new WishlistPage();
    }

    @When("the user is on the product details page")
    public void productDetailsPage() {

    }

    @And("the user clicks on the add to favorites button")
    public void userClicksOnTheButton() throws InterruptedException {
       wishlistPage.clickFavorite();
    }

    @And("the product should be added to the favorites list")
    public void theProductAddedToTheFavoritesList() throws InterruptedException {
      wishlistPage.clickFavoriteList();
    }

    @And("The user removes the product from favorites")
    public void userRemovesTheProductFromFavorites() throws InterruptedException {
    wishlistPage.clickRemoveTheProduct();
    }

    @Then("There are no products in the selection")
    public void thereAreNoProductsInTheSelection() {
    }





}
