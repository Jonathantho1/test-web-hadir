package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ShiftingPage {

    private WebDriver driver;
    private JavascriptExecutor js;

    public ShiftingPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // locator use Page Factory
    // Fitur Tambahkan Shifting
    @FindBy(xpath = "//p[normalize-space()='Shifting']")
    private WebElement menuShifting;
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement btnTambahkanShifting;
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement inputNameJamKerja;
    @FindBy(xpath = "//button[@title='Open']//*[name()='svg']")
    private WebElement inputUnit;
    @FindBy(xpath = "//li[@id='job_departement-option-2']")
    private WebElement klikUnit;
    @FindBy(xpath = "//div[@id='alert-dialog-slide-description']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']//*[name()='path' and contains(@d,'m22 5.72-4')]")
    private WebElement klikLogoJamMasuk;
    @FindBy(xpath = "/html[1]/body[1]/div[14]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement pilihJamMasuk;
    @FindBy(xpath = "/html[1]/body[1]/div[13]")
    private WebElement klikJamMasuk;
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[3]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    private WebElement klikLogoJamKeluar;
    @FindBy(xpath = "(//div[@class='MuiClock-squareMask css-1umqo6f'])[1]")
    private WebElement pilihJamKeluar;
    @FindBy(xpath = "/html[1]/body[1]/div[13]")
    private WebElement klikJamKeluarDua;
    @FindBy(xpath = "//button[normalize-space()='Tambah']")
    private WebElement btnTambahShifting;
    @FindBy(xpath = "//button[normalize-space()='Batal']")
    private WebElement btnBatalShifting;

    // Fitur Search
    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearchShifting;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement btnSearchShifting;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement btnResetShifting;

    // Fitur Titik Tiga
    @FindBy(xpath = "(//*[name()='svg'][contains(@class,'feather feather-more-vertical')])[1]")
    private WebElement titikTigaShifting;
    @FindBy(xpath = "//div[@id='card-actions-menu']/div")
    private WebElement titikTigaTutupShifting;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Edit'])[1]")
    private WebElement editDataShifting;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Delete'])[1]")
    private WebElement deleteDataShifting;
    @FindBy(xpath = "//button[normalize-space()='Ya']")
    private WebElement btnYaShifting;
    @FindBy(xpath = "//button[normalize-space()='Tidak']")
    private WebElement btnTidakShifting;
    @FindBy(xpath = "//button[normalize-space()='Simpan']")
    private WebElement btnSimpanShifting;

    // Fitur Tambahkan Shifting
    public void clickMenuShifting() {
        DriverSingleton.delay(2);
        menuShifting.click();
        DriverSingleton.delay(1);
    }

    public void clickTambahkanShifting() {
        DriverSingleton.delay(1);
        btnTambahkanShifting.click();
        DriverSingleton.delay(1);
    }

    public void inputNameJamKerja(String inputNameJamKerja) {
        DriverSingleton.delay(2);
        this.inputNameJamKerja.sendKeys(inputNameJamKerja);
        DriverSingleton.delay(2);
    }

    public void inputUnit() {
        inputUnit.click();
        DriverSingleton.delay(2);

    }

    public void klikUnit() {
        klikUnit.click();
    }

    public void klikLogoJamMasuk() {
        DriverSingleton.delay(2);
        klikLogoJamMasuk.click();
    }
    public void pilihJamMasuk() {
        DriverSingleton.delay(2);
        pilihJamMasuk.click();
    }
    public void klikJamMasuk() {
        DriverSingleton.delay(1);
        klikJamMasuk.click();
    }

    public void klikLogoJamKeluar() {
        DriverSingleton.delay(2);
        klikLogoJamKeluar.click();
    }
    public void pilihJamKeluar() {
        DriverSingleton.delay(2);
        pilihJamKeluar.click();
    }
    public void klikJamKeluarDua() {
        DriverSingleton.delay(2);
        klikJamKeluarDua.click();
    }

    public void clickTambahShifting() {
        DriverSingleton.delay(1);
        btnTambahShifting.click();
    }

    public void clickBatalShifting() {
        DriverSingleton.delay(4);
        btnBatalShifting.click();
    }

    // Fitur Titik Tiga
    public void clickTitikTigaShifting() {
        DriverSingleton.delay(4);
        titikTigaShifting.click();
    }

    public void clickTitikTigaTutupShifting() {
        DriverSingleton.delay(4);
        titikTigaTutupShifting.click();
    }

    public void clickEditShifting() {
        DriverSingleton.delay(4);
        editDataShifting.click();
    }

    public void clickDeleteShifting() {
        DriverSingleton.delay(3);
        deleteDataShifting.click();
    }

    public void clickYaShifting() {
        DriverSingleton.delay(3);
        btnYaShifting.click();
    }

    public void clickTidakShifting() {
        DriverSingleton.delay(3);
        btnTidakShifting.click();
    }

    public void clickSimpanShifting() {
        DriverSingleton.delay(3);
        btnSimpanShifting.click();
    }

    // Fitur Search
    public void inputSearchShifting(String inputSearchJabatan){
        DriverSingleton.delay(3);
        this.inputSearchShifting.sendKeys(inputSearchJabatan);
    }
    public void clickSearchShifting(){
        DriverSingleton.delay(3);
        btnSearchShifting.click();
    }
    public void clickResetShifting(){
        DriverSingleton.delay(3);
        btnResetShifting.click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    public void clearNameJamKerja(){
        inputNameJamKerja.sendKeys(Keys.CONTROL+"a");
        DriverSingleton.delay(2);
        inputNameJamKerja.sendKeys(Keys.DELETE);
    }
}
