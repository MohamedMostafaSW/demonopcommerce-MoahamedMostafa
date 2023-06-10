package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();


    @When("user hover to category and click on one of sub-category")
    public void userHoverToCategoryAndClickOnOneOfSub_category() throws InterruptedException {
        Actions actions = new Actions(driver);
        Random random = new Random();
        int nuOfCategories ;
        int subCategory ;
        nuOfCategories = 1 + random.nextInt(2);
        subCategory = 1 + random.nextInt(2);
        actions.moveToElement( homePage.categories().get(nuOfCategories)).perform();
        Thread.sleep(2000);
        String categoriesText = homePage.categories().get(nuOfCategories).getText();
        if (categoriesText.contains("computer")) {
            actions.moveToElement(homePage.computerSubCategory(subCategory));
            actions.click().perform();
       }
        else if (categoriesText.contains("Electronics")) {
            actions.moveToElement(homePage.electronicsSubCategory(subCategory));
            actions.click().perform();
       }
        else {
          actions.moveToElement(homePage.apparelSubCategory(subCategory));
          actions.click().perform();

       }


        Thread.sleep(2000);
    }


    @Then("user go to sub-category")
    public void userGoToSubCategory() {
        Random random = new Random();
        int nuOfCategories ;
        int subCategory ;
        nuOfCategories = 1 + random.nextInt(2);
        subCategory = 1 + random.nextInt(2);
        String categoriesText = homePage.categories().get(nuOfCategories).getText();
        if (categoriesText.contains("computer")) {
            Assert.assertTrue(homePage.getCurrentUrl().toLowerCase().trim()
                            .contains(homePage.computerSubCategory(subCategory).getText().toLowerCase().trim()),
                    "not found it");
            System.out.println(homePage.computerSubCategory(subCategory).getText());
        } else if (categoriesText.contains("Electronics")) {
            Assert.assertTrue(homePage.getCurrentUrl().toLowerCase().trim()
                            .contains(homePage.electronicsSubCategory(subCategory).getText().toLowerCase().trim()),
                    "not found it");
            System.out.println(homePage.electronicsSubCategory(subCategory).getText());
        } else {
            Assert.assertTrue(homePage.getCurrentUrl().toLowerCase().trim().
                            contains(homePage.apparelSubCategory(subCategory).getText().toLowerCase().trim()),
                    "not found it");
            System.out.println(homePage.apparelSubCategory(subCategory).getText());
        }


    }
}

