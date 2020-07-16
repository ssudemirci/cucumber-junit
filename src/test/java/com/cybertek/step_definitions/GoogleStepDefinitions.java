package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {
    @Given("user is on the google search page")
    public void user_is_on_the_google_search_page() {

//        Assert.fail("Unpurpose failing here!!!");
//        Driver.getDriver().get("https://www.google.com");


    }

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Google";


        Assert.assertEquals("Actual title does not match expected title!",actualTitle,expectedTitle);

    }

    @Given("User is on the Google search page")
    public void userIsOnTheGoogleSearchPage() {
    }

    @When("User search apple")
    public void userSearchApple() {
    }

    @Then("User should see apple in  the title")
    public void userShouldSeeAppleInTheTitle() {
    }
}
