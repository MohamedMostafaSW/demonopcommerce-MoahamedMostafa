package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user click on dropdown")
    public void userClickOnDropdown(){
        WebElement dropdownLlist = homePage.clickDropDown();
        Select select = new Select(dropdownLlist);
        select.selectByVisibleText("Euro");


    }
    @Then("user could see changes happen to items")
    public void userCouldSeeChangesHappenToItems(){

        for (int i = 0; i < homePage.listOfItems().size(); i++ ){
            Assert.assertTrue(homePage.listOfItems().get(i).getText().contains("€"),"wrong solution");
            System.out.println(homePage.listOfItems().get(i).getText());
        }

        System.out.println(homePage.listOfItems().size());


    }
}
