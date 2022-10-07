package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;
   // 1.Create your page object/object repository in the form of By Locators.

    By registerLink = By.className("ico-register");
    By gender = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dobDay = By.name("DateOfBirthDay");
    By dobMonth = By.name("DateOfBirthMonth");
    By dobYear = By.name("DateOfBirthYear");
    By email= By.id("Email");
    By companyName = By.id("Company");
    By password = By.id("Password");
    By confPassword = By.id("ConfirmPassword");
    By registerButton = By.xpath("//*[@id=\"register-button\"]");

    //    2. Create a constructor of page class
    public RegisterPage (WebDriver driver){
        this.driver=driver;
        utils = new Utils(driver);
    }
    //3. Page Action

    public void clickOnRegisterLink(){
        utils.doClick(registerLink);
    }
    public void doRegister(String FirstName,String LastName,String DobDay,String DobMonth,String DobYear,String Email,String CompanyName,String Password,String ConfirmPassword){
        utils.doClick(gender);
        utils.doSendkey(firstName,FirstName);
        utils.doSendkey(lastName,LastName);
        utils.doSendkey(dobDay,DobDay);
        utils.doSendkey(dobMonth,DobMonth);
        utils.doSendkey(dobYear,DobYear);
        utils.doSendkey(email,Email);
        utils.doSendkey(companyName,CompanyName);
        utils.doSendkey(password,Password);
        utils.doSendkey(confPassword,ConfirmPassword);
        utils.doClick(registerButton);
    }


}
