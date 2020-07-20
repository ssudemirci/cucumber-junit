package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearLoginPage;
import com.cybertek.pages.SmartBear_WebordersPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmartBearStepDefinitions {
    SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
    SmartBear_WebordersPage smartBear_webordersPage=new SmartBear_WebordersPage();
    @Given("User is on the SmartBear login page")
    public void userIsOnTheSmartBearLoginPage() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @Then("User is logged into SmartBear Tester account")
    public void user_is_logged_into_smart_bear_tester_account() {
        smartBearLoginPage.username.sendKeys("Tester");
        smartBearLoginPage.password.sendKeys("test");
        smartBearLoginPage.loginButton.click();

    }

    @And("User clicks to Order")
    public void user_clicks_to_order() {
        smartBear_webordersPage.orderLink.click();

    }


    @Then("User selects FamilyAlbum")
    public void userSelectsFamilyAlbum() {

    }

    @Then("User enters {string} to quantity")
    public void userEntersToQuantity(String arg0) {
    }

    @Then("User enters John Wick to costumer name")
    public void userEntersJohnWickToCostumerName() {
    }

    @Then("User enters Kinzie Ave to street")
    public void userEntersKinzieAveToStreet() {
    }

    @Then("User enters Chicago to city")
    public void userEntersChicagoToCity() {
    }

    @Then("User enters IL to state")
    public void userEntersILToState() {
    }

    @Then("User enters {string}")
    public void userEnters(String arg0) {
    }

    @Then("User selects Visa as card type")
    public void userSelectsVisaAsCardType() {
    }

    @Then("User enters {string} to card number")
    public void userEntersToCardNumber(String arg0) {
    }

    @Then("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String arg0) {
    }

    @Then("User clicks process button")
    public void userClicksProcessButton() {
    }

    @Then("User verifies John Wick is in the list")
    public void userVerifiesJohnWickIsInTheList() {
    }


}
