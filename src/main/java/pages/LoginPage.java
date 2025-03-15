package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage() {

    }

    @FindBy(xpath= "//*[@id=\"__layout\"]/section/div[2]/span/div/div/div[2]/ul/li[1]/span/span")
    private WebElement city;



    @FindBy(xpath = "//*[@id=\"__layout\"]/section/section/div/div/div[4]/div/a")
    private WebElement cabinet;

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div/section/div/div[2]/div/section/div[1]/form/div[1]/div/input")
    private WebElement numberInput;

    @FindBy (xpath = "//*[@id=\"__layout\"]/section/div/section/div/div[2]/div/section/div[1]/form/button[1]")
    private WebElement numberSubmitButton;


    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div/section/div/div[2]/div/section/div[2]/form/div[3]/button[1]")
    private WebElement logIn;




    public void clickCity (){
        city.click();
    }

    public void clickCabinet() {
        cabinet.click();
    }

    public void inputNumber(String number) throws InterruptedException {
        numberInput.click();
        numberInput.sendKeys(number);
        numberSubmitButton.click();
        Thread.sleep(15000);
        logIn.click();
    }













}
