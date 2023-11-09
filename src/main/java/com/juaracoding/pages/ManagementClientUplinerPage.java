package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementClientUplinerPage {

    private WebDriver driver;
    private JavascriptExecutor js;

    public ManagementClientUplinerPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //ManagementPage Button
    @FindBy(xpath = "//div[@id='__next']/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[3]/div/div/div[2]")
    private WebElement managementButton;

    //ManagementPage Client Upliner
    @FindBy(xpath = "//p[normalize-space()='Client Upliner']")
    private WebElement clientUplinerButton;


    //ManagementPage Client Upliner Tambahkan
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement tambahkanButton;

    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement fullnameInput;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='free-solo-with-text-demo']")
    private WebElement unitInput;

    @FindBy(xpath = "//div[@id='role_id']")
    private WebElement tipeUplinerButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement daftarButton;

    //Management Page
    public void setManagementButton(){
        managementButton.click();
    }

    //Management Client Upliner Page
    public void setClientUplinerButton(){
        clientUplinerButton.click();
    }

    public void setTambahkanButton(){
        tambahkanButton.click();
    }

    public void setFullnameInput(String fullnameInput){
        this.fullnameInput.sendKeys(fullnameInput);
    }

    public void setEmailInput(String emailInput){
        this.emailInput.sendKeys(emailInput);
    }

    public void setPasswordInput(String passwordInput){
        this.passwordInput.sendKeys(passwordInput);
    }

    public void setUnitInput(String unitInput) {
        this.unitInput.sendKeys(unitInput);
    }

    public void setTipeUplinerButton(){
        tipeUplinerButton.click();
    }

    public void setDaftarButton(){
        daftarButton.click();
    }
}
