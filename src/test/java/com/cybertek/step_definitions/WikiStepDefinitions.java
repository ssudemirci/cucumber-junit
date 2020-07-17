package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    @Given("User is on the Wiki home page")
    public void user_is_on_the_wiki_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");


    }
    @When("User searches {string} in the  wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {
        wikiSearchPage.searchBox.sendKeys(string+ Keys.ENTER);

    }
    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String string) {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(string));


    }


    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expected) {
        String actualHeaderText=wikiSearchPage.mainHeader.getText();

        Assert.assertEquals(actualHeaderText,expected);
    }
}
