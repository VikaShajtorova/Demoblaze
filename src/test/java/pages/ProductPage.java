package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage{
    public static final By ADD_TO_CART_BUTTON = By.xpath("//a[@onclick='addToCart(1)']");


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton(){
        driver.findElement(ADD_TO_CART_BUTTON).click();
    }

    public void getAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Override
    public boolean isPageOpen() {
        return isExist(ADD_TO_CART_BUTTON);
    }
}
