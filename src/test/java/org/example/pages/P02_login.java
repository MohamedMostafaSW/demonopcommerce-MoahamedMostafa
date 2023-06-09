package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginLink(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement emailField(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordField(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement clickLogin(){
        return Hooks.driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
    }
    public String displayMessageError(){
       return Hooks.driver.findElement(By.className("message-error"))
                .getCssValue("color");
    }
    public String successMessageShow(){
        return Hooks.driver.getCurrentUrl();
    }


}
