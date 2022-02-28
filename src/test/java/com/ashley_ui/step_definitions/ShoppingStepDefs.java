 package com.ashley_ui.step_definitions;

 import com.ashley_ui.pages.SearchPage;
 import com.ashley_ui.pages.SignUpPage;
 import com.ashley_ui.utilities.BrowserUtils;
 import com.ashley_ui.utilities.Driver;
 import io.cucumber.java.en.Given;
 import io.cucumber.java.en.Then;
 import io.cucumber.java.en.When;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.ui.ExpectedCondition;
 import org.openqa.selenium.support.ui.ExpectedConditions;
 import org.openqa.selenium.support.ui.WebDriverWait;

 import java.nio.file.WatchEvent;
 import java.time.Duration;


 public class ShoppingStepDefs {

    SearchPage shoppingPage = new SearchPage();
    SignUpPage signUpPage = new SignUpPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Given("user clicks on start shopping link")
    public void user_clicks_on_start_shopping_link() {
        signUpPage.startShopping.click();
    }

    @When("user hovers over to Furniture, chooses Tv-Stand and clicks")
    public void userHoversOverToFurnitureChoosesTvStandAndClicks() {
        BrowserUtils.waitForVisibility(shoppingPage.furniture, Duration.ofSeconds(5));
        BrowserUtils.hover((shoppingPage.furniture));
        BrowserUtils.waitForVisibility(shoppingPage.tvStand, Duration.ofSeconds(5)).click();
    }

    @When("user navigates to last page")
    public void user_navigates_to_last_page() {
        BrowserUtils.scrollToElement(shoppingPage.lastPageBtn);
        BrowserUtils.waitForVisibility(shoppingPage.lastPageBtn, Duration.ofSeconds(5)).click();
    }

    @Then("user chooses last available product and clicks on it")
    public void user_chooses_last_available_product_and_clicks_on_it() {
        BrowserUtils.scrollToElement(shoppingPage.lastTvStand);
        shoppingPage.lastTvStand.click();
    }

    @Then("user adds 2 products to his cart")
    public void user_adds_max_amount_allowed_product_to_his_cart() {
        BrowserUtils.waitForClickability(shoppingPage.qty, Duration.ofSeconds(5)).click();
        BrowserUtils.sleep(1);
        BrowserUtils.waitForClickability(shoppingPage.addToCart, Duration.ofSeconds(5)).click();
    }

    @Then("user checks his cart with total amount")
    public void user_checks_his_cart_with_total_amount() {
        shoppingPage.cart.click();
        String itemCount = shoppingPage.totalCount.getText();
        System.out.println("Total price for " + itemCount + "items: " + shoppingPage.totalPrice.getText());
    }

}
