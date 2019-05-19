package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }


    @FindBy(css = ".sc-bdVaJa.sc-bwzfXH.jUXfpw button p")
    private WebElement walkFreeButton;

    @FindBy(css = ".sc-EHOje.hjXGpR")
    private List<WebElement> headerButtons;

    @FindBy(css =".sc-EHOje.cWxJHM")
    private WebElement becomeWalkerButton;

    public WalkerPage clickWalkerButton(){
        wait.until(ExpectedConditions.elementToBeClickable(becomeWalkerButton));
        becomeWalkerButton.click();
        return new WalkerPage(driver);
    }

    public LoginPage clickLoginButton(){
        headerButtons.get(3).click();
        return new LoginPage(driver);
    }

    public PromotionPage clickWalkFreeButton(){
        wait.until(ExpectedConditions.elementToBeClickable(walkFreeButton));
        walkFreeButton.click();
        return new PromotionPage(driver);
    }


}
