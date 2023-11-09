package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementUserPage {

    private WebDriver driver;
    private JavascriptExecutor js;

    public ManagementUserPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //ManagementPage Button
    @FindBy(xpath = "//div[@id='__next']/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[3]/div/div/div[2]")
    private WebElement managementButton;


    //ManagementPage Menu Unit
    @FindBy(xpath = "//p[normalize-space()='Unit']")
    private WebElement unitButton;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//h6[normalize-space()='AMEX MERCHANT']")
    private WebElement namaDepartment;

    @FindBy(xpath = "//h6[normalize-space()='11 Jan 2023']")
    private WebElement tanggalBuat;

    @FindBy(xpath = "//h6[normalize-space()='21 Aug 2023']")
    private WebElement tanggalUpdate;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement reset;

    @FindBy(xpath = "//h6[normalize-space()='ABC Compe']")
    private WebElement defaultDepartment;


    //ManagementPage Tambahkan Unit
    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div/button")
    private WebElement tambahkanButton;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement namaDepartmentInput;

    @FindBy(xpath = "//button[normalize-space()='Tambah']")
    private WebElement tambahButton;

    @FindBy(xpath = "//h6[normalize-space()='AAA Compe']")
    private WebElement txtNamaDepartment;

    @FindBy(xpath = "//button[normalize-space()='Batal']")
    private WebElement batalButton;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[3]/div/div/p[2]")
    private WebElement dataCount;

    //ManagementPage Button
    public void setManagementButton(){
        managementButton.click();
    }

    //ManagementPage Menu Unit
    public void setUnitButton(){
        unitButton.click();
    }

    public void setSearch(String search){
        this.search.sendKeys(search);
    }

    public void setSearchButton(){
        searchButton.click();
    }

    public String getNamaDepartment(){
        return namaDepartment.getText();
    }

    public String getTanggalBuat(){
        return tanggalBuat.getText();
    }

    public String getTanggalUpdate(){
        return tanggalUpdate.getText();
    }

    public void setReset(){
        reset.click();
    }

    public String getDefaultDepartment(){
        return defaultDepartment.getText();
    }

    //ManagementPage Tambahkan Unit
    public void setTambahkanButton(){
        tambahkanButton.click();
    }

    public void sendTambahkan(String tambahkan){
        namaDepartmentInput.sendKeys(tambahkan);
    }

    public void setTambahButton(){
        tambahButton.click();
    }

    public void setBatalButton(){
        batalButton.click();
    }

    public String getDataCount(){
        return dataCount.getText();
    }

    public String setTxtNamaDepartment(){
        return txtNamaDepartment.getText();
    }
}
