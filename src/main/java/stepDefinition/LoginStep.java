package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static pages.BasePage.driver;

public class LoginStep {

    public LoginPage loginPage;

    public LoginStep() {
        loginPage = new LoginPage();

        }

    @Given("User is on the homepage")
    public void homepage() {
        String firstPage = "https://umico.az/";
        driver.get(firstPage);
        driver.manage().window().maximize();
    }


    @When("User clicks on the city")
    public void clickCity(){
        loginPage.clickCity();
    }

    @And("User clicks on the cabinet button")
    public void clicksOnTheButton() {
        loginPage.clickCabinet();
    }

    @And("User enters {string} and SMS code")
    public void userEntersNumber(String number) throws InterruptedException {
        loginPage.inputNumber(number);
    }

    @Then("Clicks on the Daxil ol button and proceeds to the homepage")
    public void proceedsToTheHomepage() {

    }






}






