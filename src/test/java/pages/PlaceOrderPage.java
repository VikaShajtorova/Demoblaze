package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage extends BasePage{
    public static final By PLACE_ORDER_TITLE = By.id("orderModalLabel");
    String input = "//label[text()='Name:']/ancestor::div[@class='form-group']/input";


    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
