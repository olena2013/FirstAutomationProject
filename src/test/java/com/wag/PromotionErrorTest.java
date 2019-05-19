package com.wag;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromotionErrorTest extends BaseTest {
    private PromotionPage promotionPage;
    private HomePage homepage;


    @Test
    public void testError() {
        homepage = new HomePage(driver);
        promotionPage = homepage.clickWalkFreeButton();

        promotionPage.clickEmailField();
        promotionPage.clickFirstName();
        promotionPage.clickLastName();
        promotionPage.clickPhoneField();
        promotionPage.clickEmailField();

        String error = promotionPage.getErrorForEmalField();
        System.out.println(error);
        Assert.assertEquals("required", error);

        String error1 = promotionPage.getErrorForFirstNameField();
        System.out.println(error1);
        Assert.assertEquals("required",error1);

        String error2 = promotionPage.getErrorForLastNameField();
        System.out.println(error2);
        Assert.assertEquals("required",error2);

        String error3 = promotionPage.getErrorForPhoneField();
        System.out.println(error3);
        Assert.assertEquals("required",error3);
    }
    //add some code
}
