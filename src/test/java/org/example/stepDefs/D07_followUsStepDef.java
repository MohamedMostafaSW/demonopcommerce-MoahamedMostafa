package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("user opens facebook link")
    public void userOpensFacebookLink() throws InterruptedException {
        homePage.facebookIcon().click();
        Thread.sleep(2000);

    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 2 "+homePage.getCurrentUrl());
        Assert.assertTrue(homePage.getCurrentUrl().contains(arg0),"not found it ");
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 1:  " + homePage.getCurrentUrl());

    }
    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        homePage.twitterIcon().click();
        Thread.sleep(2000);
    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        homePage.rssIcon().click();
        Thread.sleep(2000);
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        homePage.youtubeIcon().click();
        Thread.sleep(2000);
    }
}
