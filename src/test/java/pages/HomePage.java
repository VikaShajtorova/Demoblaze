package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{
    public static final By HOME_TITLE = By.id("nava");

    public void getNameProductFromList(){
        List<WebElement> list = driver.findElements(By.xpath("//h4[@class='card-title']//a"));
        list.get(0).click();
    }
    public HomePage open() {
        driver.get(BASE_URL);
        return this;
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(HOME_TITLE);
    }
}
