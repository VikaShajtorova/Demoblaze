package pages;

import elements.Input;
import models.Contact;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.l;

public class PlaceOrderPage extends BasePage{
    public static final By PLACE_ORDER_TITLE = By.id("orderModalLabel");
    public static final By PURCHASE_BUTTON = By.xpath("//button[@onclick='purchaseOrder()']");
    public static final By OK_BUTTON = By.xpath("//button[text()='OK']");

    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }

    public PlaceOrderPage create(Contact contact){
        new Input(driver,"Name:").write(contact.getName());
        new Input(driver,"Country:").write(contact.getCountry());
        new Input(driver,"City:").write(contact.getCity());
        new Input(driver,"Credit card:").write(contact.getCreditCard());
        new Input(driver,"Month:").write(contact.getMonth());
        new Input(driver,"Year:").write(contact.getYear());
        return this;
    }

    public HomePage closeAlert(){
        driver.findElement(OK_BUTTON).click();
        return new HomePage(driver);
    }


    public PlaceOrderPage clickPurchaseButton(){
        driver.findElement(PURCHASE_BUTTON).click();
        return this;
    }

    public String getText(){
      return driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']")).getText();
    }



    @Override
    public boolean isPageOpen() {
        return isExist(PLACE_ORDER_TITLE);
    }
}
