package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    @Given("user go to login page")
    public void userGoToLoginPage(){
        login.loginLink().click();

    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {
        login.emailField().sendKeys(arg0);
        login.passwordField().sendKeys(arg1);
    }


    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.clickLogin().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(login.successMessageShow(),"https://demo.nopcommerce.com/");
        softAssert.assertAll();
    }
    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        login.passwordField().sendKeys(arg1);
        login.emailField().sendKeys(arg0);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert softAssert =new SoftAssert();
        String messageError = login.displayMessageError();
        String messageErrorHex = Color.fromString(messageError).asHex();
        softAssert.assertTrue(messageErrorHex.equals("#e4434b"));
        softAssert.assertAll();
    }

}
