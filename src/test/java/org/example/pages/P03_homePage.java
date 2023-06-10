package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement clickDropDown(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> listOfItems(){
        return Hooks.driver.findElements(By.className("prices"));
    }

    public WebElement clickSearch(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement clickOnSearchButton(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
    }
    public String getCurrentUrl(){
        return Hooks.driver.getCurrentUrl();
    }
    public List<WebElement> searchResults(){
        return Hooks.driver.findElements(By.className("item-box"));
    }
    public List<WebElement> categories(){
        return Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li"));

    }
    public WebElement computerSubCategory(int i){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li["+i+"]/a"));
    }

    public WebElement apparelSubCategory(int i ){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li["+i+"]/a"));
    }
 public WebElement electronicsSubCategory(int i ){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li["+i+"]/a"));
    }

}
