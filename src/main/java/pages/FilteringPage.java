package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FilteringPage extends BasePage{

    public FilteringPage(){
    }

  @FindBy(xpath = "//*[@id=\"__layout\"]/section/section/header/section/div[4]/form/input[1]")
    private WebElement searchBar;

    public void clickSearchBar() throws InterruptedException {
        searchBar.click();
        searchBar.sendKeys("Smart televizor");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/section/header/section/div[4]/form/button")
    private WebElement search;

    public void clickSearch() throws InterruptedException {
        search.click();
        search.click();
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1000).perform();
        Thread.sleep(2000);
        actions.scrollByAmount(0, -1000).perform();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div/div[4]/div/div[1]/div[1]/div[1]/div[1]")
    private WebElement productListing;

    public void clickProductListing(){
        productListing.click();

    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div/div[4]/div/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span")
    private WebElement cheapestFilter;

    public void clickCheapestFilter() throws InterruptedException {
        cheapestFilter.click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1000).perform();
        Thread.sleep(2000);
        actions.scrollByAmount(0, -1000).perform();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div/div[4]/div/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span")
      private WebElement expensiveFilter;

    public void clickExpensiveFilter() throws InterruptedException {
        productListing.click();
        expensiveFilter.click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1000).perform();
        Thread.sleep(2000);
        actions.scrollByAmount(0, -1000).perform();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div/div[4]/div/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/span")
    private WebElement popularFilter;

    public void clickPopularFilter() throws InterruptedException {
        productListing.click();
        popularFilter.click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1000).perform();
        Thread.sleep(2000);
        actions.scrollByAmount(0, -1000).perform();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div/div[4]/div/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/span")
     private WebElement discountFilter;

    public void clickDiscountFilter() throws InterruptedException {
        productListing.click();
        discountFilter.click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1000).perform();
        Thread.sleep(2000);
        actions.scrollByAmount(0, -1000).perform();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div/div[4]/div/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/span")
    private WebElement newcomersFilter;

    public void clickNewcomersFilter() throws InterruptedException {
        productListing.click();
        newcomersFilter.click();
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1000).perform();
        Thread.sleep(2000);
        actions.scrollByAmount(0, -1000).perform();
    }

}
