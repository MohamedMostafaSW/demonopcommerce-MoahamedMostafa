package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage homePage =new P03_homePage();
    @When("user click on wishList button")
    public void userClickOnWishListButton() throws InterruptedException {
        homePage.wishListButtonForItems().click();
        Thread.sleep(2000);
    }

    @Then("wishList message display")
    public void wishlistMessageDisplay() {
        Assert.assertTrue(homePage.wishlistMessage().isDisplayed(),"not found it ");
    }

    @When("user click on wishList button beside login")
    public void userClickOnWishListButtonBesideLogin() throws InterruptedException {

        homePage.wishListButtonForItems().click();
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(8));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.invisibilityOf(homePage.wishlistMessage()));
        homePage.wishListButtonForPage().click();



    }

    @Then("wishList page should appear")
    public void wishlistPageShouldAppear() {
        Assert.assertTrue(homePage.getCurrentUrl().contains("wishlist"),"not exist");
    }
}
