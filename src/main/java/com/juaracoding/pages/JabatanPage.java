package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class JabatanPage {

    private WebDriver driver;
    private JavascriptExecutor js;

    public JabatanPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    // locator use Page Factory
    // Fitur Tambahkan Jabatan
    @FindBy(xpath = "//p[normalize-space()='Jabatan']")
    private WebElement menuJabatan;
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement btnTambahkanJabatan;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputNameJabatan;
    @FindBy(xpath = "//input[@id='level']")
    private WebElement inputLevelJabatan;
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[3]/div[1]/form[1]/div[2]/button[1]")
    private WebElement btnTambahJabatan;

    // Fitur Search
    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearchJabatan;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement btnSearchJabatan;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement btnReset;


    @FindBy(xpath = "//button[normalize-space()='Batal']")
    private WebElement btnBatalJabatan;

    @FindBy(xpath = "//button[normalize-space()='Simpan']")
    private WebElement btnSimpanJabatan;

    // Fitur Titik Tiga
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

    public void clickMenuJabatan(){
        DriverSingleton.delay(2);
        menuJabatan.click();
        DriverSingleton.delay(2);
    }
    public void clickTambahkanJabatan(){
        DriverSingleton.delay(2);
        btnTambahkanJabatan.click();
    }
    public void inputNameJabatan(String inputNameJabatan){
        DriverSingleton.delay(1);
        this.inputNameJabatan.sendKeys(inputNameJabatan);
    }
    public void inputLevelJabatan(String inputLevelJabatan){
        DriverSingleton.delay(1);
        this.inputLevelJabatan.sendKeys(inputLevelJabatan);
    }
    public void clickTambahJabatan(){
        DriverSingleton.delay(2);
        btnTambahJabatan.click();
    }

    // Fitur Search
    public void inputSearchJabatan(String inputSearchJabatan){
        DriverSingleton.delay(1);
        this.inputSearchJabatan.sendKeys(inputSearchJabatan);
    }
    public void clickSearchJabatan(){
        DriverSingleton.delay(1);
        btnSearchJabatan.click();
    }
    public void clickResetJabatan(){
        DriverSingleton.delay(2);
        btnReset.click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    // Fitur Titik Tiga
    public void clickTitikTiga(){
        DriverSingleton.delay(2);
        titikTiga.click();
    }
    public void clickTitikTigaTutup(){
        DriverSingleton.delay(2);
        titikTigaTutup.click();
    }
    public void clickEdit(){
        DriverSingleton.delay(2);
        editData.click();
        DriverSingleton.delay(1);
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
    public void clickBatalJabatan(){
        DriverSingleton.delay(2);
        btnBatalJabatan.click();

    }
    public void clickSimpanJabatan(){
        DriverSingleton.delay(2);
        btnSimpanJabatan.click();
        DriverSingleton.delay(2);
    }



    public void clearNameJabatan(){
        inputNameJabatan.sendKeys(Keys.CONTROL+"a");
        DriverSingleton.delay(2);
        inputNameJabatan.sendKeys(Keys.DELETE);
    }
    public void clearLevelJabatan(){
        inputLevelJabatan.sendKeys(Keys.CONTROL+"a");
        DriverSingleton.delay(2);
        inputLevelJabatan.sendKeys(Keys.DELETE);
    }
}
