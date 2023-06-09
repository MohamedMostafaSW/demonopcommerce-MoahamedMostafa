package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    By registerlink = By.className("ico-register");
    By selectGenderType= By.id("gender-male");
    By enterFirstName= By.id("FirstName");
    By enterLastName= By.id("LastName");
    By userEnterDay= By.name("DateOfBirthDay");
    By userEnterMonth= By.name("DateOfBirthMonth");
    By userEnterYear=By.name("DateOfBirthYear");
    By userEnterEmail = By.id("Email");
    By userEnterPassword= By.id("Password");
    By userEnterPasswordConfirm= By.id("ConfirmPassword");
    By userClickOnRegister= By.id("register-button");
    By assertMessage = By.className("ico-logout");
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(registerlink);
    }
    public WebElement selectGenderType(){
        return Hooks.driver.findElement(selectGenderType);
    }
    public WebElement  enterFirstName(){
        return Hooks.driver.findElement(enterFirstName);
    }
    public WebElement enterLastName(){
        return Hooks.driver.findElement(enterLastName);
    }
    public WebElement userEnterDay(){
        return Hooks.driver.findElement(userEnterDay);
    }
    public WebElement userEnterMonth(){
        return Hooks.driver.findElement(userEnterMonth);
    }
    public WebElement userEnterYear(){
        return Hooks.driver.findElement(userEnterYear);
    }
    public WebElement userEnterEmail(){
        return Hooks.driver.findElement(userEnterEmail);
    }
    public WebElement userEnterPassword(){
        return Hooks.driver.findElement(userEnterPassword);
    }
    public WebElement userEnterPasswordConfirm(){
        return Hooks.driver.findElement(userEnterPasswordConfirm);
    }
    public WebElement userClickOnRegister(){
        return Hooks.driver.findElement(userClickOnRegister);
    }
    public WebElement assertMessage(){
        return Hooks.driver.findElement(assertMessage);
    }













}

