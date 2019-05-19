package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name =\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[name =\"password\"]")
    private WebElement passwordField;

    @FindBy(css = ".btn.btn-secondary.btn-block")
    private WebElement loginButton;

    @FindBy(css = "div[data-testid =\"login-error-alert\"]")
    private WebElement errorNotification;

    public void inputEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();

    }

    public String getEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        String res = emailField.getAttribute("value");
        return res;
    }

    public String getPassword() {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        String res = passwordField.getAttribute("value");
        return res;
    }

    public String getErrorForInvalidCredentials() {
        wait.until(ExpectedConditions.visibilityOf(errorNotification));
        String result = errorNotification.getText();
        return result;
    }

}





