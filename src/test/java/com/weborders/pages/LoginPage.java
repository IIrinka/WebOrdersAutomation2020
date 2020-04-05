package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userName;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;

    public void login() {
        String userNameValue = ConfigurationReader.getProperty("username");
        String passeordValue = ConfigurationReader.getProperty("password");
        userName.sendKeys(userNameValue);
        password.sendKeys(passeordValue, Keys.ENTER);
    }

    public void login(String userNameValue, String passwordValue) {

        userName.sendKeys(userNameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }
}