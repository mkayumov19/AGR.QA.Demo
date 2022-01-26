package com.Practice.step_definitions;

import com.Practice.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class MainSearchBox_StepDefs {

    WebDriver driver = Driver.getDriver();

    @Given("Maksim is on Ashley landing page")
    public void maksim_is_on_ashley_landing_page() {
        driver.get("https://www.ashleyfurniture.com/");
    }
    @When("Maksim searches for sofa")
    public void maksim_searches_for_sofa() {
        driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("Sofa"+ Keys.ENTER);

    }
    @Then("Maksim should be able to see sofas in result")
    public void maksim_should_be_able_to_see_sofas_in_result() {
    Assert.assertTrue(driver.getTitle().contains("Sites-Ashley-US-Site"));

    }
}
