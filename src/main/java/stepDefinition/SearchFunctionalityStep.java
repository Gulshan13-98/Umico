package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchFunctionalityPage;

public class SearchFunctionalityStep {

    public static SearchFunctionalityPage searchFunctionalityPage;

    public SearchFunctionalityStep(){
        searchFunctionalityPage = new SearchFunctionalityPage();
    }

    @When("the user clicks on the search bar")
    public void theUserClicksOnTheSearchBar() {
        searchFunctionalityPage.clickSearchBar();
    }

    @And("the user types iphone in the search bar")
    public void theUserTypesIphoneInTheSearchBar() throws InterruptedException {
        searchFunctionalityPage.typeIphone();
    }

    @Then("the search results page is displayed")
    public void theSearchResultsPageIsDisplayed() {
       searchFunctionalityPage.clickSearchButton();
    }


}
