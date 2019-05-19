package com.wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class WalkerPage extends BasePage {
    public WalkerPage(WebDriver driver){super(driver);}

    @FindBy(css = "#first_name")
    private WebElement firstNameField;

    @FindBy(css = "#last_name")
    private WebElement lastNameField;

    @FindBy(css = "#email")
    private WebElement emailField;

    @FindBy(css ="#phone")
    private WebElement phoneField;

    @FindBy(css = "#address__line-one")
    private WebElement addressField;

    @FindBy(css = "#address__line-two")
    private WebElement aptField;

    @FindBy(css = "#city")
    private WebElement cityField;

    @FindBy(css = ".btn.common-dropdown.common-dropdown-item")
    private WebElement stateField;

    @FindBy(css = ".common-dropdown-item-text")
    private List<WebElement> stateList;

    @FindBy(css = "#zipcode")
    private WebElement zipCodeField;

    @FindBy(css =".button-text")
    private WebElement applyButton;

    @FindBy(css = ".autocomplete-result span")
    private List<WebElement> addressList;

    public void selectAddress(){
        wait.until(ExpectedConditions.visibilityOfAllElements(addressList.get(0)));
        System.out.println(addressList.get(0).getText());
        addressList.get(0).click();
    }
    public void clickEmailField(){
        emailField.click();
    }


    public void inputFirstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }
    public void inputLastName(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }
    public void inputEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }
    public void inputPhone(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);
    }
    public void inputAddress(String address) {
        wait.until(ExpectedConditions.elementToBeClickable(addressField));
        addressField.sendKeys(address);
    }
    public void inputApt(String apt) {
        wait.until(ExpectedConditions.elementToBeClickable(aptField));
        aptField.sendKeys(apt);
    }
    public void inputCity(String city) {
        wait.until(ExpectedConditions.elementToBeClickable(cityField));
        cityField.sendKeys(city);
    }
    public void inputState(String state) {
        wait.until(ExpectedConditions.elementToBeClickable(stateField));
        stateField.sendKeys(state);
    }
    public void inputZipCode(String zipCode){
        wait.until(ExpectedConditions.elementToBeClickable(zipCodeField));
        zipCodeField.sendKeys(zipCode);

    }
    public void clickStateField(){
        wait.until(ExpectedConditions.elementToBeClickable(stateField));
        stateField.click();
    }
    public void selectState(){
        wait.until(ExpectedConditions.elementToBeClickable(stateList.get(3)));
        stateList.get(3).click();
    }
    public void clickApplyButton(){
        wait.until(ExpectedConditions.elementToBeClickable(applyButton));
        applyButton.click();
    }

}
