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

    public WebElement item(){
        return Hooks.driver.findElement(By.className("prices"));
    }



}
