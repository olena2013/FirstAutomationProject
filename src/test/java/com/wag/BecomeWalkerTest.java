package com.wag;

import org.junit.Assert;
import org.junit.Test;

public class BecomeWalkerTest extends BaseTest {
    protected HomePage homePage;
    protected WalkerPage walkerPage;

    @Test
    public void testBecomeWalker() throws InterruptedException {
        homePage = new HomePage(driver);
        walkerPage = homePage.clickWalkerButton();

        walkerPage.inputFirstName(userWalker.getFirstName());
        walkerPage.inputLastName(userWalker.getLastName());
        walkerPage.inputEmail(userWalker.getEmail());
        walkerPage.inputPhone(userWalker.getPhone());
        walkerPage.inputAddress(userWalker.getAddress());
        walkerPage.selectAddress();
        walkerPage.inputApt(userWalker.getApt());
        walkerPage.inputCity(userWalker.getCity());
        walkerPage.clickStateField();
        walkerPage.selectState();
        walkerPage.inputZipCode(userWalker.getZipCode());
        walkerPage.clickApplyButton();
        String res = walkerPage.getErrorForEmailField();
        Assert.assertEquals("Enter a valid email address", res);


    }


}
