package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @Given("user go to register page")
    public void userGoToRegisterPage(){

        register.registerlink().click();

    }
    @When("user select gender type")
    public void userSelectGenderType(){
        register.selectGenderType().click();
    }
    @When("user enter first name")
    public void userEnterFirstName() {
    register.enterFirstName().sendKeys("automation");


    }
    @When("user enter last name")
    public void userEnterLastName(){
        register.enterLastName().sendKeys("tester");
    }
    @When("user enter date of day")
    public void userEnterDay(){
        WebElement birth = register.userEnterDay();
        Select select= new Select(birth);
        select.selectByValue("15");
    }
    @When("user enter date of month")
    public void userEnterMonth() {
        WebElement birth = register.userEnterMonth();
        Select select = new Select(birth);
        select.selectByValue("9");
    }
    @When("user enter date of year")
    public void userEnterYear() {
        WebElement birth = register.userEnterYear();
        Select select = new Select(birth);
        select.selectByValue("2000");
    }
    @When("user enter email")
    public void userEnterEmail(){
        register.userEnterEmail().sendKeys("test@example12549.com");
    }
    @When("user fills Password fields")
    public void userFillsPasswordFields(){
        register.userEnterPassword().sendKeys("P@ssw0rd");
    }
    @When("user fills Confirm Password fields")
    public void userFillsConfirmPasswordFields(){
        register.userEnterPasswordConfirm().sendKeys("P@ssw0rd");
    }

    @When("user clicks on register button")
    public void userClicksOnRegisterButton(){
        register.userClickOnRegister().click();
    }
    @Then("success message is displayed")
    public void successMessageIsDisplayed(){
        SoftAssert softAssert = new SoftAssert();
        //softAssert.assertTrue(register.assertMessage().isDisplayed(),"not exist ");
        String actualColor =register.assertMessage().getCssValue("color");
        String actualColorHex = Color.fromString(actualColor).asHex();
        softAssert.assertTrue(actualColorHex.equals("#4cb17c"));
        softAssert.assertAll();

    }


    @And("user enter {string}")
    public void userEnter(String arg0) {
        register.enterFirstName().sendKeys(arg0);
    }
}
