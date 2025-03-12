package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/section/header/section/div[6]")
    private WebElement cart;

    public void clickCart() {
        cart.click();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div[1]/div[2]/div/a[2]")
    private WebElement products;


    public void clickProducts() {
        products.click();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div/div[2]/div[2]/div/a[6]")
    private WebElement smartDevices;

    public void clickSmartDevices() {
        smartDevices.click();

    }


    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div[2]/div/div[2]/div/a[1]")
    private WebElement mobilePhone;



    public void clickMobilePhone() {
        mobilePhone.click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1500)");

    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[12]/div[1]/a/span[2]/span[2]")
    private WebElement iphonePro;

    public void clickIphonePro(){
        iphonePro.click();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div/div[3]/div/div[2]/div[11]/button[1]")
    private WebElement addToCartButton;

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[3]/span/div/div/section[3]/button")
    private WebElement chooseShopButton;

    public void clickChooseShopButton() throws InterruptedException {
        chooseShopButton.click();
        Thread.sleep(3000);
    }


    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div/div/button[2]")
    private WebElement theProductIncreases;

    public void clickTheProductIncreases() throws InterruptedException {
        theProductIncreases.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/div/button[1]")
    private WebElement theProductDecreases;

    public void clickTheProductDecreases(){
        theProductDecreases.click();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/a")
    private WebElement theProductRemoves;

    public void clickTheProductRemoves(){
        theProductRemoves.click();
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[2]/div/div/div/button")
    private WebElement productRemoved;

    public void clickProductRemoved(){
        productRemoved.click();
    }
}






