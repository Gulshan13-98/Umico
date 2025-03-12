package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchFunctionalityPage extends BasePage {

    public SearchFunctionalityPage() {
    }


    @FindBy(xpath = "//*[@id=\"__layout\"]/section/section/header/section/div[4]/form/input[1]")
    private WebElement searchBar;

    public void clickSearchBar(){
        searchBar.click();

    }

    public void typeIphone() throws InterruptedException {
        searchBar.sendKeys("Iphone");
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/section/header/section/div[4]/form/button")
    private WebElement searchButton;

    public void clickSearchButton(){
        searchButton.click();
        searchButton.click();
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 200).perform();
    }



}
