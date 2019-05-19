package com.wag;

import org.junit.Assert;
import org.junit.Test;

public class IncorrectEmailTest extends BaseTest{
    private PromotionPage promotionPage;
    private HomePage homepage;

    @Test
    public void testIncorrectEmail(){
        homepage = new HomePage(driver);
        promotionPage = homepage.clickWalkFreeButton();

        promotionPage.inputEmailField(user.getIncorrectEmail());
        promotionPage.clickFirstName();

        String error = promotionPage.getErrorForEmalField();
        System.out.println(error);
        Assert.assertEquals("please provide a valid email",error);
    }
}
