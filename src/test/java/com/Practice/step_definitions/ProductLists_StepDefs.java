package com.Practice.step_definitions;

import com.Practice.utilities.ConfigurationReader;
import com.Practice.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductLists_StepDefs {

    @Given("user is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {
        String url = ConfigurationReader.getProperty("etsyUrl");
        Driver.getDriver().get(url);
    }

    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
       String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and" +
               " unique gifts for everyone";
       String actualTitle = Driver.getDriver().getTitle();
//        Assert.assertTrue(actualTitle.equals(expectedTitle));
        Assert.assertEquals("Assertion failed",actualTitle,expectedTitle);
    }

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @When("User types Wooden Spoon in the search bar")
    public void user_types_wooden_spoon_in_the_search_bar() {
    etsySearchPage.searchbar.sendKeys("Wooden spoon");
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
    etsySearchPage.searchButton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
    String expectedTitle = "Wooden spoon | Etsy";
    String actualTitle = Driver.getDriver().getTitle();
    Assert.assertTrue(actualTitle.equals(expectedTitle));

    }
}
