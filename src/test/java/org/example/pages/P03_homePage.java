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
        return Hooks.driver.findElements(By.className("product-item"));
    }
//    public WebElement emailField(){
//        return Hooks.driver.findElement(By.id("Email"));
//    }
//    public WebElement passwordField(){
//        return Hooks.driver.findElement(By.id("Password"));
//    }
//    public WebElement clickLogin(){
//        return Hooks.driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
//    }



}
