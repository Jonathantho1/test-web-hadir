package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class ManagementClientUplinerPage {

    private WebDriver driver;
    private JavascriptExecutor js;

    public ManagementClientUplinerPage(){
        this.driver = DriverSingleton.getDriver();
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver,this);
    }

    //ManagementPage Client Upliner Menu
    @FindBy(xpath = "//p[normalize-space()='Client Upliner']")
    private WebElement clientUplinerButton;

    @FindBy(xpath = "//h6[normalize-space()='Alif Client V3']")
    private WebElement namaMenu;

    @FindBy(xpath = "//h6[normalize-space()='alifclient2@gmail.com']")
    private WebElement emailMenu;

    @FindBy(xpath = "//tbody/tr[2]/td[4]/h6[1]")
    private WebElement unitMenu;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/h6[1]")
    private WebElement tipeUplinerGetMenu;

    @FindBy(xpath = "//tbody/tr[2]/td[6]/h6[1]")
    private WebElement tanggalBuatMenu;

    @FindBy(xpath = "//h6[normalize-space()='John Doe']")
    private WebElement nama;

    @FindBy(xpath = "//h6[normalize-space()='JohnDoe@yahoo.com']")
    private WebElement email;

    @FindBy(xpath = "//h6[normalize-space()='ABC Compe']")
    private WebElement unit;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/h6[1]")
    private WebElement tipeUplinerMenu;

    @FindBy(xpath = "//h6[normalize-space()='13 Nov 2023']")
    private WebElement tanggalDiBuat;

    @FindBy(xpath = "//div[@id='mui-3']")
    private WebElement rowPerPageButton;

    @FindBy(xpath = "//*[@id=\"mui-2\"]/li[3]")
    private WebElement rowPerPage;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[3]/div/div/p[2]")
    private WebElement Overlay;

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

    @FindBy(xpath = "//li[@id='free-solo-with-text-demo-option-0']")
    private WebElement unitInputButton;

    @FindBy(xpath = "//div[@id='role_id']")
    private WebElement tipeUplinerButton;

    @FindBy(xpath = "//*[@id=\"mui-8\"]/li[2]")
    private WebElement tipeUpliner;

    @FindBy(xpath = "//div[3]/ul/li[2]")
    private WebElement tipeUpliner2;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement daftarButton;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement alertTerdaftar;

    //Management Client Upliner Edit Page
    @FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]//*[name()='svg']")
    private WebElement kebabButton;

    @FindBy(xpath = "//*[@id=\"card-actions-menu\"]/div[3]/ul/li[1]")
    private WebElement editButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div[1]/div[1]/label/input")
    private WebElement inputPathImage;

    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement fullnameEdit;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailEdit;

    @FindBy(xpath = "//input[@id='free-solo-with-text-demo']")
    private WebElement pilihUnitEdit;

    @FindBy(xpath = "//li[@id='free-solo-with-text-demo-option-0']")
    private WebElement unitEdit;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonUbah;

    @FindBy(xpath = "//h6[normalize-space()='John Tyler Doe']")
    private WebElement namaEdit;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]")
    private WebElement alertEdit;

    //Management Client Upliner Menu Page
    public void setClientUplinerButton(){
        driver.navigate().refresh();
        DriverSingleton.delay(3);
        clientUplinerButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void setClientUplinerButton2(){
        DriverSingleton.delay(3);
        clientUplinerButton.click();
    }

    public String getNamaMenu(){
        DriverSingleton.delay(3);
        return namaMenu.getText();
    }

    public String getEmailMenu(){
        DriverSingleton.delay(3);
        return emailMenu.getText();
    }

    public String getUnitMenu(){
        DriverSingleton.delay(3);
        return unitMenu.getText();
    }

    public String getTipeUplinerGetMenu(){
        DriverSingleton.delay(3);
        return tipeUplinerGetMenu.getText();
    }

    public String getTanggalBuatMenu(){
        DriverSingleton.delay(3);
        return tanggalBuatMenu.getText();
    }

    public String getNama(){
        DriverSingleton.delay(3);
        return nama.getText();
    }

    public String getEmail(){
        DriverSingleton.delay(3);
        return email.getText();
    }

    public String getUnit(){
        DriverSingleton.delay(3);
        return unit.getText();
    }

    public void setRowPerPageButton(){
        driver.navigate().refresh();
        DriverSingleton.delay(3);
        rowPerPageButton.click();
    }

    public void setRowPerPage(){
        DriverSingleton.delay(3);
        rowPerPage.click();
    }

    public String getOverlay(){
        DriverSingleton.delay(3);
        return Overlay.getText();
    }

    public String getTanggalDiBuat(){
        DriverSingleton.delay(3);
        return tanggalDiBuat.getText();
    }

    //Management  Client Upliner Tambah Page
    public void setTambahkanButton(){
        DriverSingleton.delay(3);
        tambahkanButton.click();
    }

    public void setFullnameInput(String fullnameInput){
        DriverSingleton.delay(3);
        this.fullnameInput.sendKeys(fullnameInput);
    }

    public String setAlertFullname(){
        DriverSingleton.delay(3);
        return fullnameInput.getAttribute("required");
    }

    public void setEmailInput(String emailInput){
        DriverSingleton.delay(3);
        this.emailInput.sendKeys(emailInput);
    }

    public String setAlertEmail(){
        DriverSingleton.delay(3);
        return emailInput.getAttribute("required");
    }

    public void setPasswordInput(String passwordInput){
        DriverSingleton.delay(3);
        this.passwordInput.sendKeys(passwordInput);
    }

    public String setAlertPassword(){
        DriverSingleton.delay(3);
        return passwordInput.getAttribute("required");
    }

    public void setUnitInput(String unitInput) {
        DriverSingleton.delay(3);
        this.unitInput.sendKeys(unitInput);
    }

    public String setAlertUnitInput(){
        return unitInput.getAttribute("required");
    }

    public void setUnitInputButton(){
        DriverSingleton.delay(3);
        unitInputButton.click();
    }

    public void setTipeUplinerButton(){
        DriverSingleton.delay(3);
        tipeUplinerButton.click();
    }

    public void setTipeUpliner(){
        DriverSingleton.delay(3);
        tipeUpliner.click();
    }

    public void setTipeUpliner2(){
        DriverSingleton.delay(3);
        tipeUpliner2.click();
    }

    public void setDaftarButton(){
        DriverSingleton.delay(3);
        daftarButton.click();
    }

    public String setAlertTerdaftar(){
        DriverSingleton.delay(3);
        return alertTerdaftar.getText();
    }

    //Management Edit Client Upliner Page
    public void setKebabButton(){
        DriverSingleton.delay(3);
        kebabButton.click();
    }

    public void setEditButton(){
        DriverSingleton.delay(3);
        editButton.click();
    }

    public void setInputPathImage(String inputPathImage){
        DriverSingleton.delay(3);
        this.inputPathImage.sendKeys(inputPathImage);
    }

    public void setDeleteFullnameEdit(){
        DriverSingleton.delay(3);
        fullnameEdit.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }

    public String setFullnameEditAlert(){
        DriverSingleton.delay(3);
        return fullnameEdit.getAttribute("required");
    }

    public void setFullnameEdit(String FullnameEdit){
        DriverSingleton.delay(3);
        this.fullnameEdit.sendKeys(FullnameEdit);
    }

    public void setDeleteEmailEdit(){
        DriverSingleton.delay(3);
        emailEdit.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }

    public String setEmailEditAlert(){
        DriverSingleton.delay(3);
        return emailEdit.getAttribute("required");
    }

    public void setEmailEdit(String emailEdit){
        DriverSingleton.delay(3);
        this.emailEdit.sendKeys(emailEdit);
    }

    public void setDeletePilihUnitEdit(){
        DriverSingleton.delay(3);
        pilihUnitEdit.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }

    public String setPilihUnitEditAlert(){
        DriverSingleton.delay(3);
        return pilihUnitEdit.getAttribute("required");
    }

    public void setPilihUnitEdit(String pilihUnitEdit){
        DriverSingleton.delay(3);
        this.pilihUnitEdit.sendKeys(pilihUnitEdit);
    }

    public void setUnitEdit(){
        DriverSingleton.delay(3);
        unitEdit.click();
    }

    public void setButtonUbah(){
        DriverSingleton.delay(3);
        buttonUbah.click();
    }

    public String setNamaEdit(){
        DriverSingleton.delay(3);
        return namaEdit.getText();
    }

    public String setAlertEdit(){
        DriverSingleton.delay(3);
        return alertEdit.getText();
    }
}