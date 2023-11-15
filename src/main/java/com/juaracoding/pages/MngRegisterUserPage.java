package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MngRegisterUserPage {
    private WebDriver driver;

    public MngRegisterUserPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1ub5lza'][normalize-space()='Management']")
    private WebElement menuManagement;
    @FindBy(xpath = "//p[normalize-space()='Pendaftaran User']")
    private WebElement userRegister;
    @FindBy(xpath = "//label[@role='button']")
    private WebElement btnUpload;
    @FindBy(xpath = "//input[@id='nik']")
    private WebElement nik;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement name;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//input[@id='divisi']")
    private WebElement division;
    @FindBy(xpath = "//input[@id='unit']")
    private WebElement unit;
    @FindBy(xpath = "//input[@id='posisi-kerja']")
    private WebElement workPosition;
    @FindBy(xpath = "//input[@id='jabatan']")
    private WebElement position;
    @FindBy(xpath = "//*[@id=\"divisi\"]")
    private WebElement superior;
    @FindBy(xpath = "//input[@id='tipe-kontrak']")
    private WebElement typeContract;
    @FindBy(xpath = "//input[@id='lokasi-kerja']")
    private WebElement workLocation;
    @FindBy(xpath = "//div[@id='shift_type']")
    private WebElement typeShift;
    @FindBy(xpath = "//input[@id='jadwal-kerja']")
    private WebElement workSchedule;
    @FindBy(xpath = "//div[@id='required_selfie']")
    private WebElement selfie;
    @FindBy(xpath = "//input[@id='jumlah-cuti']")
    private WebElement leaves;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btnSubmit;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/div/p")
    private WebElement txtRegUser;
    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement alertEmailTerdaftar;

    public void clickManagement() {
        menuManagement.click();
    }

    public String getValidationNik() {
        return nik.getAttribute("validationMessage");
    }

    public String getValidationName() {
        return name.getAttribute("validationMessage");
    }

    public String getValidationEmail() {
        return email.getAttribute("validationMessage");
    }

    public String getValidationPassword() {
        return password.getAttribute("validationMessage");
    }

    public String getValidationDivision() {
        return division.getAttribute("validationMessage");
    }

    public String getValidationUnit() {
        return unit.getAttribute("validationMessage");
    }

    public String getValidationWorkPos() {
        return workPosition.getAttribute("validationMessage");
    }

    public String getValidationLocation() {
        return workLocation.getAttribute("validationMessage");
    }

    public String getValidationContract() {
        return typeContract.getAttribute("validationMessage");
    }

    public String getValidationPosition() {
        return position.getAttribute("validationMessage");
    }

    public String getValidationSchedule() {
        return workSchedule.getAttribute("validationMessage");
    }

    public String getValidationSelfie() {
        return selfie.getAttribute("validationMessage");
    }

    public String getTxtRegUser() {
        return txtRegUser.getText();
    }

    public void clearEmail() {
       email.sendKeys(Keys.CONTROL + "a");
       email.sendKeys(Keys.DELETE);
    }

    public void clearPassword() {
        password.sendKeys(Keys.CONTROL + "a");
        password.sendKeys(Keys.DELETE);
    }

    public String getAlert() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(alertEmailTerdaftar));
        return alertEmailTerdaftar.getText();
    }

    public void clickUserRegister() {
        userRegister.click();
    }

    public void clearEmployeePhoto() {
        // Menunggu elemen tombol unggah menjadi interaktif
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btnUpload));

        // Mengganti elemen tombol unggah dengan versi baru
        replaceUploadButton(btnUpload);
    }

    private void replaceUploadButton(WebElement uploadButton) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Buat elemen baru yang mirip dengan elemen lama
        String newButtonHtml = "<label role='button'></label>";

        // Ganti elemen lama dengan elemen baru
        js.executeScript("arguments[0].outerHTML = arguments[1];", uploadButton, newButtonHtml);
    }

    public void uploadEmployeePhoto(String filePath) {
        btnUpload.sendKeys(filePath);
    }

    public void inputEmployeeNik(String niK) {
        nik.sendKeys(niK);
    }

    public void inputEmployeeEmail(String em) {
        email.sendKeys(em);
    }

    public void inputEmployeeName(String nm) {
        name.sendKeys(nm);
    }

    public void inputPassword(String pw) {
        password.sendKeys(pw);
    }

    public void inputDivision(String dvs) {
        division.sendKeys(dvs);
    }

    public void clickBtnSubmit() {
        btnSubmit.click();
    }

    public void clearDivision() {
        division.clear();
    }

    public void clearUnit() {
        unit.clear();
    }

    public void clearWorkPosition() {
        workPosition.clear();
    }

    public void clearPosition() {
        position.clear();
    }

    public void clearTypeContract() {
        typeContract.clear();
    }

    public void clearWorkLocation() {
        workLocation.clear();
    }

    public void clearWorkSchedule() {
        workSchedule.clear();
    }

    public void clearSelfie() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].value = '';", selfie);
    }

    public void inputPosition(String pst) {
        position.sendKeys(pst);
    }

    public void inputUnit(String unt) {
        unit.sendKeys(unt);
    }

    public void inputWorkPosition(String wpst) {
        workPosition.sendKeys(wpst);
    }

    public void inputSuperior(String spr) {
        superior.sendKeys(spr);
    }

    public void inputContractType(String contract) {
        typeContract.sendKeys(contract);
    }

    public void inputWorkLocation(String wloc) {
        workLocation.sendKeys(wloc);
    }

    public void inputShiftType(String shift) {
        typeShift.sendKeys(shift);
    }

    public void inputWorkSchedule(String schedule) {
        workSchedule.click();
        workSchedule.sendKeys(schedule);
    }

    public void inputSelfie(String selfi) {
        selfie.sendKeys(selfi);
    }

    public void inputLeaves(String lvs) {
        leaves.sendKeys(lvs);
    }

    public void clearFieldNik() {
        nik.sendKeys(Keys.CONTROL + "a");
        nik.sendKeys(Keys.DELETE);
    }

    public void clearFieldName() {
        name.sendKeys(Keys.CONTROL + "a");
        name.sendKeys(Keys.DELETE);
    }
}
