package com.wag;

import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    }





}
