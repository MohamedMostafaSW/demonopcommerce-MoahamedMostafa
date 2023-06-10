package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("user click on search {string}")
    public void userClickOnSearch(String product){
        homePage.clickSearch().sendKeys(product);
        homePage.clickOnSearchButton().click();

    }
    @Then("user could see relative {string}")
    public void userCouldSeeRelative(String arg0) {
        SoftAssert softAssert =new SoftAssert();
        for (int i=1; i<homePage.searchResults().size(); i++){
            softAssert.assertTrue(homePage.searchResults().get(i).getText().toLowerCase().trim().contains(arg0),"NOt Exist");
            //System.out.println(homePage.searchResults().get(i).getText().toLowerCase().trim());
        }

    }
}
