package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();
    Actions actions = new Actions(driver);
    Random random = new Random();
    int nuOfCategories = random.nextInt(2);

    int subCategory = 1 + random.nextInt(2);


    @When("user hover to category and click on one of sub-category")
    public void userHoverToCategoryAndClickOnOneOfSub_category() throws InterruptedException {
        actions.moveToElement(homePage.categories().get(nuOfCategories)).perform();
        Thread.sleep(2000);
        String categoriesText = homePage.categories().get(nuOfCategories).getText();
        if (categoriesText.contains("Computers")) {
            actions.moveToElement(homePage.computerSubCategory(subCategory)).click().perform();
        }
        else if (categoriesText.contains("Electronics")) {
            actions.moveToElement(homePage.electronicsSubCategory(subCategory)).click().perform();

        }
        else {
            actions.moveToElement(homePage.apparelSubCategory(subCategory)).click().perform();

        }
        Thread.sleep(2000);
    }
    @Then("user go to sub-category")
    public void userGoToSubCategory() {

        String categoriesText = homePage.categories().get(nuOfCategories).getText();
        if (categoriesText.contains("Computers")) {
            Assert.assertTrue(homePage.getCurrentUrl().toLowerCase().trim()
                            .contains(homePage.computerSubCategory(subCategory).getText().toLowerCase().trim()),
                    "not found it");
            System.out.println(homePage.getCurrentUrl().toLowerCase().trim());
        } else if (categoriesText.contains("Electronics")) {
            Assert.assertTrue(homePage.getCurrentUrl().toLowerCase().trim()
                            .contains(homePage.electronicsSubCategory(subCategory).getText().toLowerCase().trim()),
                    "not found it");
            System.out.println(homePage.getCurrentUrl().toLowerCase().trim());
        } else {
            Assert.assertTrue(homePage.getCurrentUrl().toLowerCase().trim().
                            contains(homePage.apparelSubCategory(subCategory).getText().toLowerCase().trim()),
                    "not found it");
            System.out.println(homePage.getCurrentUrl().toLowerCase().trim());
        }


    }
}

