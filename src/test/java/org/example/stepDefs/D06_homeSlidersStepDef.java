package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();



    @When("user click on first slider")
    public void userClickOnFirstSlider()  {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.clickOnSlider().get(1)));
        homePage.clickOnSlider().get(1).click();

    }

    @Then("user go to {string}")
    public void userGoTo(String arg0) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.getCurrentUrl().contains(arg0),"incorrect execution ");
        softAssert.assertAll();
    }

    @When("user click on second slider")
    public void userClickOnSecondSlider() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(homePage.clickOnSlider().get(0)));
        homePage.clickOnSlider().get(0).click();
    }
}
