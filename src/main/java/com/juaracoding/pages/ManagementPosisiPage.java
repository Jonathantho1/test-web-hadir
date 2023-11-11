package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ManagementPosisiPage {

    private WebDriver driver;

    public ManagementPosisiPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //Management posisi menu page
    @FindBy(xpath = "//p[normalize-space()='Posisi']")
    private WebElement posisiButton;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//h6[normalize-space()='ABC HRD']")
    private WebElement namaDivisi;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/h6[1]")
    private WebElement tanggalBuat;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/h6[1]")
    private WebElement tanggalUpdate;

    @FindBy(xpath = "//*[@id=\"mui-5\"]")
    private WebElement rowPerPageButton;

    @FindBy(xpath = "//*[@id=\"mui-4\"]/li[3]")
    private WebElement rowPerPage;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[3]/div/div/p[2]")
    private WebElement overlay;

    //Management posisi tambahakan page
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement tambahkanButton;

    @FindBy(xpath = "//*[@id=\"alert-dialog-title\"]")
    private WebElement titleTambah;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement namaPosition;

    @FindBy(xpath = "//*[@id=\"alert-slide-description\"]/div[2]/div")
    private WebElement listBoxButton;

    @FindBy(xpath = "//*[@id=\"mui-7\"]/li[4]")
    private WebElement listBoxDepartment;

    @FindBy(xpath = "//*[@id=\"mui-4\"]/li[4]")
    private WebElement listBoxDepartment2;

    @FindBy(xpath = "/html/body/div[28]/div[3]/div/form/div[2]/button[1]")
    private WebElement tambahButton;
    @FindBy(xpath = "//div[2]/button[2]")
    private WebElement batalButton;

    //Management posisi edit page
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]//*[name()='svg']")
    private WebElement kebabButton;

    @FindBy(xpath = "//*[@id=\"card-actions-menu\"]/div[3]/ul/li[1]")
    private WebElement editButton;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement namaPosisiEdit;

    @FindBy(xpath = "//h6[normalize-space()='ABC IT Team']")
    private WebElement namaDivisiBaru;

    @FindBy(xpath = "/html/body/div[28]/div[3]/div/form/div[2]/button[1]")
    private WebElement simpanButtonEdit;

    @FindBy(xpath = "//div[2]/button[2]")
    private WebElement batalButtonEdit;

    //Management posisi menu page
    public void setPosisiButton(){
        DriverSingleton.delay(5);
        posisiButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void setInputSearch(String inputSearch){
        DriverSingleton.delay(5);
        this.inputSearch.sendKeys(inputSearch);
    }

    public void setSearchButton(){
        DriverSingleton.delay(5);
        searchButton.click();
    }

    public void setResetButton(){
        DriverSingleton.delay(5);
        resetButton.click();
    }

    public String getNamaDivisi(){
        DriverSingleton.delay(5);
        return namaDivisi.getText();
    }

    public String getTanggalBuat(){
        DriverSingleton.delay(5);
        return tanggalBuat.getText();
    }

    public String getTanggalUpdate(){
        DriverSingleton.delay(5);
        return tanggalUpdate.getText();
    }

    public void setRowPerPageButton(){
        DriverSingleton.delay(5);
        rowPerPageButton.click();
    }

    public void setRowPerPage(){
        DriverSingleton.delay(5);
        rowPerPage.click();
    }

    public String getOverlay(){
        DriverSingleton.delay(5);
        return overlay.getText();
    }

    //Management posisi tambahkan page
    public void setTambahkanButton(){
        DriverSingleton.delay(5);
        tambahkanButton.click();
    }

    public String getTitleTambahkan(){
        DriverSingleton.delay(5);
        return titleTambah.getText();
    }

    public String setNamaPositionAlert(){
        DriverSingleton.delay(5);
        return namaPosition.getAttribute("required");
    }

    public void setNamaPosition(String namaPosition){
        DriverSingleton.delay(5);
        this.namaPosition.sendKeys(namaPosition);
    }

    public void setListBox(){
        DriverSingleton.delay(5);
        listBoxButton.click();
    }

    public void setListBoxDepartment(){
        DriverSingleton.delay(5);
        listBoxDepartment.click();
    }

    public void setListBoxDepartment2(){
        DriverSingleton.delay(5);
        listBoxDepartment2.click();
    }

    public void setTambahButton(){
        DriverSingleton.delay(5);
        tambahButton.click();
    }

    public void setBatalButton(){
        DriverSingleton.delay(5);
        batalButton.click();
    }

    //Management edit page
    public void setKebabButton(){
        DriverSingleton.delay(5);
        kebabButton.click();
    }

    public void setEditButton(){
        DriverSingleton.delay(5);
        editButton.click();
    }

    public void setDeleteNamaPosisiEdit(){
        namaPosisiEdit.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }

    public void setNamaPosisiEdit(String namaDivisiEdit){
        DriverSingleton.delay(5);
        this.namaPosisiEdit.sendKeys(namaDivisiEdit);
    }

    public String setAlertNamaPosisiEdit(){
        DriverSingleton.delay(5);
        return namaPosisiEdit.getAttribute("required");
    }

    public void setSimpanButtonEdit(){
        DriverSingleton.delay(5);
        simpanButtonEdit.click();
    }

    public String getNamaDivisiBaru(){
        DriverSingleton.delay(5);
       return namaDivisiBaru.getText();
    }

    public void setBatalButtonEdit(){
        DriverSingleton.delay(5);
        batalButtonEdit.click();
    }


}
