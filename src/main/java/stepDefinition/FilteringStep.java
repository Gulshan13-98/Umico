package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FilteringPage;



public class FilteringStep {

    public FilteringPage filteringPage;

    public FilteringStep(){
        filteringPage = new FilteringPage();
    }

    @When("the user searches for Smart TV")
    public void userSearchesForSmartTv() throws InterruptedException {
        filteringPage.clickSearchBar();
    }

    @When("the search results should display Smart TVs")
    public void theSearchResultsShouldDisplaySmartTvs() throws InterruptedException {
        filteringPage.clickSearch();
    }

    @And("the user is on the product listing page")
    public void userIsOnTheProductListingPage() {
        filteringPage.clickProductListing();
    }

    @And("the user applies the cheapest first filter")
    public void userAppliesTheCheapestFilter() throws InterruptedException {
        filteringPage.clickCheapestFilter();
    }

    @And("the user applies the  expensive filter")
    public void userAppliesTheExpensiveFilter() throws InterruptedException {
        filteringPage.clickExpensiveFilter();
    }

    @And("the user applies the popular filter")
    public void userAppliesThePopularFilter() throws InterruptedException {
        filteringPage.clickPopularFilter();
    }

    @And("the user applies the biggest discount filter")
    public void userAppliesTheBiggestDiscountFilter() throws InterruptedException {
        filteringPage.clickDiscountFilter();
    }

    @Then("user applies the Newcomers filter")
    public void userppliesTheNewcomersFilter() throws InterruptedException {
        filteringPage.clickNewcomersFilter();
    }



}
