package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //login using Page Factory
    @FindBy(xpath = "//input[@id='email']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonMasuk;
    @FindBy(xpath = "//p[normalize-space()='Dashboard']")
    private WebElement txtDashboard;

    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        buttonMasuk.click();
    }

    public void inputUsername(String username){
        this.username.sendKeys(username);
    }
    public void inputPassword(String password){
        this.password.sendKeys(password);
    }
    public void loginBtn(){
        buttonMasuk.click();
    }

    public void clearUsername(){
        username.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        //username.sendKeys(Keys.DELETE);
    }
    public void clearPassword(){
        password.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        //password.sendKeys(Keys.DELETE);
    }

    public String getlogoHadir(){
        return txtDashboard.getText();
    }

}
