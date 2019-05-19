package com.wag;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginInvalidDataTest extends BaseTest {
    protected HomePage homePage;
    protected WebDriverWait driverWait;
    private LoginPage loginPage;

    @Test
    public void testLoginInvalidData(){
        homePage = new HomePage(driver);

        loginPage = homePage.clickLoginButton();
        loginPage.inputEmail(user.getEmail());
        loginPage.inputPassword(user.getPassword());
        loginPage.clickLoginButton();


        String errorMessage = loginPage.getErrorForInvalidCredentials();
        System.out.println(errorMessage);
        Assert.assertEquals("Invalid credentials",errorMessage);
    }




}

