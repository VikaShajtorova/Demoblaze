package tests;

import org.testng.annotations.Test;

public class DemoblazeTest extends BaseTest {
    @Test
    public void Test(){
        homePage.open()
                .getNameProductFromList();
        productPage.isPageOpen();
        productPage.clickAddToCartButton();
        productPage.getAlert();


    }

}
