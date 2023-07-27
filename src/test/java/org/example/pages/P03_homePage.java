package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement clickDropDown() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> listOfItems() {
        return Hooks.driver.findElements(By.className("prices"));
    }

    public WebElement clickSearch() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement clickOnSearchButton() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
    }

    public String getCurrentUrl() {
        return Hooks.driver.getCurrentUrl();
    }

    public List<WebElement> searchResults() {
        return Hooks.driver.findElements(By.className("item-box"));
    }

    public List<WebElement> categories() {
        return Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li"));

    }

    public WebElement computerSubCategory(int i) {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[" + i + "]/a"));
    }

    public WebElement apparelSubCategory(int i) {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[" + i + "]/a"));
    }

    public WebElement electronicsSubCategory(int i) {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[" + i + "]/a"));
    }
    public WebElement facebookIcon(){
        return Hooks.driver.findElement(By.className("facebook"));
    }
    public WebElement twitterIcon(){
        return Hooks.driver.findElement(By.className("twitter"));
    }
    public WebElement rssIcon(){
        return Hooks.driver.findElement(By.className("rss"));
    }
    public WebElement youtubeIcon(){
        return Hooks.driver.findElement(By.className("youtube"));
    }
    public WebElement wishlistMessage(){
        return Hooks.driver.findElement(By.id("bar-notification"));
    }
    public WebElement wishListButtonForItems(){
        return Hooks.driver.findElement(By.xpath(
                "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }
    public WebElement wishListButtonForPage(){
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public List<WebElement> clickOnSlider(){
        return Hooks.driver.findElements(By.xpath("//*[@id=\"nivo-slider\"]/a"));
    }

}
