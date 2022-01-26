package com.Practice.step_definitions;

import com.Practice.pages.AshleyMPLinksPage;
import com.Practice.utilities.BrowserUtils;
import com.Practice.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AshleyMPLinks_StepDefs {
    AshleyMPLinksPage amazon;
    WebDriverWait wait;
    double singlePriceForHat;
    Select selectQuantity;
    double priceForTwo;

    @When("User is on the Amazon Home Page")
    public void user_is_on_the_Amazon_Home_Page() {
        Driver.getDriver().get("https://www.amazon.com");
    }

    @When("User search for hats for men")
    public void user_search_for_hats_for_men() {
        amazon = new AshleyMPLinksPage();
        amazon.searchBox.sendKeys("hats for men"+ Keys.ENTER);
    }

    @When("User Add the first hat appearing to Cart with quantity {int}")
    public void user_Add_the_first_hat_appearing_to_Cart_with_quantity(Integer int1) {
        wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(amazon.firstHat));
        amazon.firstHat.click();
        // get the single price for the hat
        String priceText = amazon.price.getText();
        // Select the quatity as 2
        selectQuantity = new Select(amazon.quantityDropDown);
        selectQuantity.selectByVisibleText("2");
        // add to cart
        amazon.addToCart.click();
    }

    @Then("the total price and quantity should be correct")
    public void the_total_price_and_quantity_should_be_correct() {
        // go to cart
        amazon.cart.click();
        // assert that there are 2 items
        Assert.assertTrue(amazon.subTotalText.getText().contains("2 items"));
        // the price from the cart
        priceForTwo = Double.parseDouble(amazon.subTotalAmount.getText().substring(2));
        Assert.assertTrue(2*singlePriceForHat==priceForTwo);
    }

    @When("User Reduce the quantity from {int} to {int} in Cart for the item selected")
    public void user_Reduce_the_quantity_from_to_in_Cart_for_the_item_selected(Integer int1, Integer int2) {
        selectQuantity.selectByVisibleText("1");
        BrowserUtils.sleep(2);
    }

    @Then("total price and quantity has been correctly changed")
    public void total_price_and_quantity_has_been_correctly_changed() {
        Assert.assertTrue(amazon.subTotalText.getText().contains("1 item"));
        double priceForOne = Double.parseDouble(amazon.subTotalAmount.getText().substring(2));
        Assert.assertTrue(priceForTwo/priceForOne==2);


    }
}
