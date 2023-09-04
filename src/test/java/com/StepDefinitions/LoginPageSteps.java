package com.StepDefinitions;

import com.Factory.DriverFactory;
import com.Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private static String title;
    private static String homepageTitle;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = loginPage.getLoginPageTitle();
        System.out.println("Login page title is : " + title);
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String loginpageTitle) {

        Assert.assertTrue(title.contains(loginpageTitle));
    }

    @When("user enters Username {string}")
    public void user_enters_username(String username) {
        loginPage.enterUserName(username);
    }
    @When("user enters Password {string}")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }
    @When("user click on Submit button")
    public void user_click_on_submit_button() {
        loginPage.clickOnLogin();
    }
    @Then("user get the title of the Homepage")
    public void user_get_the_title_of_the_homepage() {
        homepageTitle = loginPage.getLoginPageTitle();
        System.out.println("HomePage Title is : " + homepageTitle);
    }
    @Then("the page title should be {string}")
    public void the_page_title_should_be(String homeTitle) {
        Assert.assertTrue(homepageTitle.equals(homeTitle));
    }

}
