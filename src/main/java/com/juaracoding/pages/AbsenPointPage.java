package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AbsenPointPage {

    private WebDriver driver;
    private JavascriptExecutor js;

    public AbsenPointPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    // locator use Page Factory
    @FindBy(xpath = "//p[normalize-space()='Management']")
    private WebElement menuManagement;
    @FindBy(xpath = "//p[normalize-space()='Absen Point']")
    private WebElement menuAbsenPoint;
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement btnTambahkan;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputName;
    @FindBy(xpath = "//div[@id='alert-dialog-slide-description']/div[4]/div/div/div/div/div/div")
    private WebElement klikMaps;
    @FindBy(xpath = "//input[@id='description']")
    private WebElement inputDeskripsi;
    @FindBy(xpath = "//button[normalize-space()='Tambah']")
    private WebElement btnTambah;

    @FindBy(xpath = "//button[normalize-space()='Batal']")
    private WebElement btnBatal;

    // Fitur Titik Tiga
    @FindBy(xpath = "//button[normalize-space()='Simpan']")
    private WebElement btnSimpan;

    @FindBy(xpath = "(//*[name()='svg'][contains(@class,'feather feather-more-vertical')])[1]")
    private WebElement titikTiga;
    @FindBy(xpath = "//div[@id='card-actions-menu']/div")
    private WebElement titikTigaTutup;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Edit'])[1]")
    private WebElement editData;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Delete'])[1]")
    private WebElement deleteData;
    @FindBy(xpath = "//button[normalize-space()='Ya']")
    private WebElement btnYa;
    @FindBy(xpath = "//button[normalize-space()='Tidak']")
    private WebElement btnTidak;


    // Fitur Search
    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement btnSearch;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement btnReset;






    public void clickMenuManagement(){
        DriverSingleton.delay(2);
        menuManagement.click();
    }
    public void clickMenuAbsen(){
        menuAbsenPoint.click();
    }
    public void clickTambahkan(){
        btnTambahkan.click();
    }

    public void inputName(String inputName){
        this.inputName.sendKeys(inputName);
    }
    public void clickMaps(){
        klikMaps.click();
    }
    public void inputDeskripsi(String inputDeskripsi){
        this.inputDeskripsi.sendKeys(inputDeskripsi);
    }
    public void inputSearch(String inputSearch){
        this.inputSearch.sendKeys(inputSearch);
    }


    public void clickTambah(){
        DriverSingleton.delay(2);
        btnTambah.click();
    }
    public void clickBatal(){
        btnBatal.click();
    }
    public void clickSimpan(){
        DriverSingleton.delay(1);
        btnSimpan.click();
    }

    public void clickTitikTiga(){
        DriverSingleton.delay(2);
        titikTiga.click();
    }
    public void clickTitikTigaTutup(){
        DriverSingleton.delay(2);
        titikTigaTutup.click();
    }
    public void clickEdit(){
        editData.click();
    }
    public void clickDelete(){
        DriverSingleton.delay(2);
        deleteData.click();
    }
    public void clickYa(){
        DriverSingleton.delay(2);
        btnYa.click();
    }
    public void clickTidak(){
        DriverSingleton.delay(2);
        btnTidak.click();
    }


    public void clearName(){
        inputName.sendKeys(Keys.CONTROL+"a");
        inputName.sendKeys(Keys.DELETE);
    }
    public void clearDeskripsi(){
        inputDeskripsi.sendKeys(Keys.CONTROL+"a");
        inputDeskripsi.sendKeys(Keys.DELETE);
    }

    // Fitur Search
    public void clickSearch(){
        DriverSingleton.delay(1);
        btnSearch.click();
    }
    public void clickReset(){
        DriverSingleton.delay(1);
        btnReset.click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }
}
