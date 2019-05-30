package com.wag;

import helper.EmailGenerator;
import helper.User;
import helper.UserWalker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    protected WebDriver driver;
    protected User user;
    protected WebDriverWait wait;
    protected UserWalker userWalker;
    protected EmailGenerator emailGenerator;

    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Lena/IdeaProjects/drivers/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver",
//                "C:/Users/Otunyk/IdeaProjects/TestAutomation-master/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://wagwalking.com/");
        String titleExpected = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";
        String titleActual = driver.getTitle();
        //Assert.assertTrue(titleExpected.equals(titleActual));
        Assert.assertEquals(titleExpected, titleActual);
        user = new User();
        wait = new WebDriverWait(driver,10);
        userWalker = new UserWalker();
        emailGenerator = new EmailGenerator();
    }

//    @After
//    public void close() {
//        driver.quit();
    }


