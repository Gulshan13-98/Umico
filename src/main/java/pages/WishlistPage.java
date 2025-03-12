package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class WishlistPage extends BasePage{

    public WishlistPage(){
        }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/div[1]/div[1]/div/div[4]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div")
    private WebElement favorite;

    public void clickFavorite() throws InterruptedException {
     favorite.click();
     Thread.sleep(2000);
    }

    @FindBy(xpath = "//*[@id=\"__layout\"]/section/section/header/section/div[5]")
    private WebElement favoriteList;

    public void clickFavoriteList() throws InterruptedException {
        favoriteList.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//*[@id=\"FavoriteProducts\"]/div/div[1]/div[1]/div")
    private WebElement removeTheProduct;

    public void clickRemoveTheProduct() throws InterruptedException {
        removeTheProduct.click();
        Thread.sleep(2000);
    }


}

