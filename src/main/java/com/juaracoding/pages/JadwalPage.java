package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class JadwalPage {

    private WebDriver driver;

    public JadwalPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    // locator use Page Factory
    // Fitur Tambahkan Jadwal
    @FindBy(xpath = "//p[normalize-space()='Jadwal']")
    private WebElement menuJadwal;
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement btnTambahkanJadwal;
    @FindBy(xpath = "//div[@id='typeJadwal']")
    private WebElement pilihTipeJadwal;
    @FindBy(xpath = "//li[normalize-space()='Jadwal kerja flexible']")
    private WebElement klikTipeJadwal;
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    private WebElement inputTangal;
    @FindBy(xpath = "(//input[@id='nameJadwal'])[1]")
    private WebElement inputNamaJadwal;
    @FindBy(xpath = "(//button[@type='button'])[23]")
    private WebElement klikBtnHariKerja;
    @FindBy(xpath = "(//div[contains(@role,'combobox')][normalize-space()='Libur'])[1]")
    private WebElement pilihHariSenin;
    @FindBy(xpath = "//li[normalize-space()='Permata Bank']")
    private WebElement klikHariSenin;
    @FindBy(xpath = "//button[normalize-space()='Terapkan']")
    private WebElement klikBtnTerapkan;
    @FindBy(xpath = "//input[@id='t_keterlambatan']")
    private WebElement inputToleransi;

    @FindBy(xpath = "//button[normalize-space()='Tambah']")
    private WebElement btnTambahJadwal;
    @FindBy(xpath = "//button[normalize-space()='Batal']")
    private WebElement btnBatalJadwal;
    @FindBy(xpath = "//button[normalize-space()='Kembali']")
    private WebElement btnKembali;



    // Fitur Search
    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearchJadwal;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement btnSearchJadwal;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement btnResetJadwal;

    // Fitur Titik Tiga
    @FindBy(xpath = "(//*[name()='svg'][contains(@class,'feather feather-more-vertical')])[1]")
    private WebElement titikTigaJadwal;
    @FindBy(xpath = "//div[@id='card-actions-menu']/div")
    private WebElement titikTigaTutupJadwal;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Edit'])[1]")
    private WebElement editDataJadwal;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Delete'])[1]")
    private WebElement deleteDataJadwal;
    @FindBy(xpath = "//button[normalize-space()='Ya']")
    private WebElement btnYaJadwal;
    @FindBy(xpath = "//button[normalize-space()='Tidak']")
    private WebElement btnTidakJadwal;
    @FindBy(xpath = "//button[normalize-space()='Simpan']")
    private WebElement btnSimpanJadwal;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Detail'])[1]")
    private WebElement detailJadwal;



    // Fitur Tambahkan Shifting
    public void clickMenuJadwal() {
        DriverSingleton.delay(2);
        menuJadwal.click();
        DriverSingleton.delay(2);
    }

    public void clickTambahkanJadwal() {
        DriverSingleton.delay(3);
        btnTambahkanJadwal.click();
        DriverSingleton.delay(1);
    }
    public void pilihTipeJadwal() {
        pilihTipeJadwal.click();
        DriverSingleton.delay(2);
    }
    public void klikTipeJadwal() {
        klikTipeJadwal.click();
        DriverSingleton.delay(2);
    }

    public void inputTanggal(String inputTanggal) {
        this.inputTangal.sendKeys(inputTanggal);
    }
    public void inputNamaJadwal(String inputNamaJadwal) {
        this.inputNamaJadwal.sendKeys(inputNamaJadwal);
    }

    public void klikBtnHariKerja() {
        klikBtnHariKerja.click();
        DriverSingleton.delay(2);
    }
    public void pilihHariSenin() {
        pilihHariSenin.click();
        DriverSingleton.delay(2);
    }
    public void klikHariSenin() {
        klikHariSenin.click();
        DriverSingleton.delay(2);
    }
    public void klikBtnTerapkan() {
        klikBtnTerapkan.click();
        DriverSingleton.delay(2);
    }
    public void inputToleransi(String inputToleransi) {
        this.inputToleransi.sendKeys(inputToleransi);
    }
    public void clickTambahJadwal() {
        DriverSingleton.delay(3);
        btnTambahJadwal.click();
    }
    public void clickBatalJadwal() {
        DriverSingleton.delay(5);
        btnBatalJadwal.click();
    }


    // Fitur Titik Tiga
    public void clickTitikTigaJadwal() {
        DriverSingleton.delay(5);
        titikTigaJadwal.click();
    }

    public void clickTitikTigaTutupJadwal() {
        DriverSingleton.delay(5);
        titikTigaTutupJadwal.click();
    }
    public void clickDetailJadwal() {
        DriverSingleton.delay(5);
        detailJadwal.click();
    }

    public void clickEditJadwal() {
        DriverSingleton.delay(5);
        editDataJadwal.click();
    }

    public void clickDeleteJadwal() {
        DriverSingleton.delay(5);
        deleteDataJadwal.click();
    }

    public void clickYaJadwal() {
        DriverSingleton.delay(5);
        btnYaJadwal.click();
    }

    public void clickTidakJadwal() {
        DriverSingleton.delay(4);
        btnTidakJadwal.click();
    }
    public void clickSimpanJadwal() {
        DriverSingleton.delay(4);
        btnSimpanJadwal.click();
    }
    public void clickBtnKembali() {
        DriverSingleton.delay(2);
        btnKembali.click();
        DriverSingleton.delay(2);
    }

    // Fitur Search
    public void inputSearchJadwal(String inputSearchJadwal){
        DriverSingleton.delay(1);
        this.inputSearchJadwal.sendKeys(inputSearchJadwal);
    }
    public void clickSearchJadwal(){
        DriverSingleton.delay(1);
        btnSearchJadwal.click();
    }
    public void clickResetJadwal(){
        DriverSingleton.delay(2);
        btnResetJadwal.click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }


    public void clearInputTanggal(){
        inputTangal.sendKeys(Keys.CONTROL+"a");
        DriverSingleton.delay(2);
        inputTangal.sendKeys(Keys.DELETE);
    }
    public void clearInputNamaJadwal(){
        inputNamaJadwal.sendKeys(Keys.CONTROL+"a");
        DriverSingleton.delay(2);
        inputNamaJadwal.sendKeys(Keys.DELETE);
    }
    public void clearInputToleransi(){
        inputToleransi.sendKeys(Keys.CONTROL+"a");
        DriverSingleton.delay(2);
        inputToleransi.sendKeys(Keys.DELETE);
    }
}
