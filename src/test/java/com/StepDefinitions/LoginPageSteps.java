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
    public void page_title_should_be(String string) {

        Assert.assertTrue(title.contains(string));
    }

}
