package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnMasuk;
    @FindBy(xpath = "//h5[@class='MuiTypography-root MuiTypography-h5 css-5shv7u']")
    private WebElement adminName;
    @FindBy(xpath = "//*[@id='profile-menu']/div[3]/ul/div/button[2]")
    private WebElement btnLogout;
    @FindBy(xpath = "//button[@aria-label='menu']//div[@class='MuiBox-root css-70qvj9']")
    private WebElement adminProfile;
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-a97271']")
    private WebElement txtLogin;
    @FindBy(xpath = "//div[@class='MuiBox-root css-17e0a0a']")
    private WebElement txt404;
    @FindBy(xpath = "//p[normalize-space()='Dashboard']")
    private WebElement txtDashboard;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/p")
    private WebElement txtWrongEmail;
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1qamc72']")
    private WebElement txtUserNotFound;
    @FindBy(xpath = "//button[@aria-label='menu']//div[@class='MuiBox-root css-70qvj9']")
    private WebElement menuUserProfile;

    public String getLoginText() {
        return txtLogin.getText();
    }

    public String getDashboardText() {
        return txtDashboard.getText();
    }

    public void clickMenuUserProfile() {
        menuUserProfile.click();
    }

    public String getTxtUserNotFound() {
        return txtUserNotFound.getText();
    }

    public String getTxtWrongEmail() {
        return txtWrongEmail.getText();
    }

    public void inputEmail(String email) {
        this.email.sendKeys(email);
    }

    public void inputPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnMasuk.click();
    }

    public void clickBtnLogout() {
        btnLogout.click();
    }

    public String getAdminName() {
        return adminName.getText();
    }

    public String getTxt404() {
        return txt404.getText();
    }
}
