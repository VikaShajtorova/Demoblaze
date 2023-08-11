package tests;

import models.Contact;
import models.ContactFactory;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class DemoblazeTest extends BaseTest {
    @Test
    public void Test(){
        homePage.open()
                .getNameProductFromList();
        productPage.isPageOpen();
        productPage.clickAddToCartButton();
        productPage.getAlert();
        cartPage.open()
                .isPageOpen();
        cartPage.clickPlaceOrder();
        placeOrderPage.isPageOpen();
        Contact contact = ContactFactory.get();
        placeOrderPage.create(contact)
                        .clickPurchaseButton();


        assertEquals(placeOrderPage.getText(),"Thank you for your purchase!");
        placeOrderPage.closeAlert();


        assertTrue(homePage.isPageOpen(),"Пользователь не перешел на страницу");



    }

}
