package com.wag;

import helper.EmailGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PromotionActionTest extends BaseTest {
    private PromotionPage promotionPage;
    protected WebDriverWait driverWait;
    protected HomePage homePage;
    protected EmailGenerator emailGenerator;

    @Test
    public void testPromotionAction() {
        homePage = new HomePage(driver);
        promotionPage = homePage.clickWalkFreeButton();

        promotionPage.inputEmailField(user.getEmail());



        promotionPage.inputPasswordField(user.getPassword());

        promotionPage.inputFirstNameField(user.getFirstName());

        promotionPage.inputLastNameField(user.getLastName());

        promotionPage.inputPhoneField(user.getPhoneNumber());

        String res = promotionPage.clickNextButton();
        Assert.assertEquals("NEXT", res);

        String email = promotionPage.getEmail();
        Assert.assertEquals(user.getEmail(), email);

        String password = promotionPage.getPassword();
        Assert.assertEquals(user.getPassword(), password);

        String firstName = promotionPage.getFirstName();
        Assert.assertEquals(user.getFirstName(), firstName);

        String lastName = promotionPage.getLastName();
        Assert.assertEquals(user.getLastName(), lastName);

        String phone = promotionPage.getPhone();
        Assert.assertEquals(user.getPhoneNumber(), phone);

        String notification = promotionPage.getConfirmedNotification();
        Assert.assertEquals("Let's start with the basics", notification);



    }

}
