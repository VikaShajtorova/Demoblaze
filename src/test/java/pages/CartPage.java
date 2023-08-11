package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public static final By PLACE_ORDER_BUTTON = By.xpath("//button[@type='button' and text()='Place Order']");


    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void clickPlaceOrder(){
        driver.findElement(PLACE_ORDER_BUTTON).click();
    }

    public CartPage open() {
        driver.get(BASE_URL+"cart.html");
        return this;
    }

    @Override
    public boolean isPageOpen() {
        return isExist(PLACE_ORDER_BUTTON);
    }
}
