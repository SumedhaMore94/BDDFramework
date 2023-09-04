package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // By Locators
    private By id = By.id("username");
    private By password = By.id("password");
    private By logInButton = By.id("submit");

    // Constructor of the page class
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        System.out.println("Hello");
    }

    // Page Actions

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void enterUserName(String username) {
        driver.findElement(id).sendKeys(username);
    }

    public void enterPassword(String Password) {
        driver.findElement(password).sendKeys(Password);
    }

    public void clickOnLogin() {
        driver.findElement(logInButton).click();
    }
}
