package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class MngSelfRegisterPage {
    private WebDriver driver;

    public MngSelfRegisterPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Pendaftaran Sendiri']")
    private WebElement selfRegister;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearch;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement btnReset;
    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[2]/div/form/div/div/div/div/div")
    private WebElement dropdownSearchName;
    @FindBy(xpath = "//*[@id=\"mui-1\"]/li[2]")
    private WebElement dropdownSearchNik;
    @FindBy(xpath = "//h6[normalize-space()='anwar']")
    private WebElement resultName;
    @FindBy(xpath = "//h6[normalize-space()='31777777777772']")
    private WebElement resultNik;
    @FindBy(xpath = "//h6[normalize-space()='ganjar']")
    private WebElement resultName2;
    @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/input[1]")
    private WebElement checkboxUser;
    @FindBy(xpath = "//button[normalize-space()='Update dichecklist']")
    private WebElement updateDichecklist;
    @FindBy(xpath = "//input[@id='free-solo-with-text-demo']")
    private WebElement editDivisi;
    @FindBy(xpath = "//input[@id='mui-20']")
    private WebElement editPosisi;
    @FindBy(xpath = "(//input[@id='free-solo-with-text-demo'])[2]")
    private WebElement editJabatan;
    @FindBy(xpath = "(//input[@id='free-solo-with-text-demo'])[3]")
    private WebElement editAtasan;
    @FindBy(xpath = "(//input[@id='free-solo-with-text-demo'])[4]")
    private WebElement editKontrak;
    @FindBy(xpath = "(//input[@id='free-solo-with-text-demo'])[5]")
    private WebElement editLokasi;
    @FindBy(xpath = "(//input[@id='free-solo-with-text-demo'])[6]")
    private WebElement editJadwal;
    @FindBy(xpath = "//div[2]/form/div/div")
    private WebElement teksInformasi;
    @FindBy(xpath = "//button[@id='mui-23']")
    private WebElement btnSubmit;
    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement btnView;
    @FindBy(xpath = "//input[@id='divisi']")
    private WebElement inputDivisi;
    @FindBy(xpath = "//input[@id='unit']")
    private WebElement inputUnit;
    @FindBy(xpath = "//input[@id='tipe-kontrak']")
    private WebElement inputKontrak;
    @FindBy(xpath = "//input[@id='posisi-kerja']")
    private WebElement inputPosisi;
    @FindBy(xpath = "//input[@id='jabatan']")
    private WebElement inputJabatan;
    @FindBy(xpath = "//input[@id='lokasi-kerja']")
    private WebElement inputLokasi;
    @FindBy(xpath = "//input[@id='jadwal-kerja']")
    private WebElement inputJadwal;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btnSubmit2;
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1kei35f']")
    private WebElement teksPendUser;
    @FindBy(xpath = "(//button[@type='button'])[9]")
    private WebElement btnDeleteUser;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement btnYa;
    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement teksBerhasilDihapus;
    @FindBy(xpath = "//div[@id='mui-24']")
    private WebElement rowPerPageButton;
    @FindBy(xpath = "//*[@id=\"mui-23\"]/li[1]")
    private WebElement rowPerPage;
    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/p[2]")
    private WebElement Overlay;



    public void clickSelfRegister() {
        selfRegister.click();
    }

    public void inputSearch(String cari) {
        inputSearch.sendKeys(cari);
    }

    public String getResultName() {
        return resultName.getText();
    }

    public String getTxtPendUser() {
        return teksPendUser.getText();
    }

    public String getTxtDataUser() {
        return teksBerhasilDihapus.getText();
    }
    public void inputDivisi(String div) {
        editDivisi.sendKeys(div);
    }

    public void clickBtnDelUser() {
        btnDeleteUser.click();
    }

    public void clickBtnYa() {
        btnYa.click();
    }

    public void inputPosisi(String pos) {
        editPosisi.sendKeys(pos);
    }

    public void inputJabatan(String jab) {
        editJabatan.sendKeys(jab);
    }

    public void inputKontrak(String kon) {
        editKontrak.sendKeys(kon);
    }

    public void inputLokasi(String lok) {
        editLokasi.sendKeys(lok);
    }

    public void inputJadwal(String jad) {
        editJadwal.sendKeys(jad);
    }

    public void inputDivisi2(String div) {
        inputDivisi.sendKeys(div);
    }

    public void inputPosisi2(String pos) {
        inputUnit.sendKeys(pos);
    }

    public void inputUnit(String unit) {
        inputUnit.sendKeys(unit);
    }

    public void inputKontrak2(String kon) {
        inputKontrak.sendKeys(kon);
    }

    public void inputJabata2n(String jab) {
        inputJabatan.sendKeys(jab);
    }

    public void inputLokasi2(String lok) {
        inputLokasi.sendKeys(lok);
    }

    public void inputJadwal2(String jad) {
        inputJadwal.sendKeys(jad);
    }

    public void clickViewUserData() {
        btnView.click();
    }

    public void clickBtnSubmitDataView() {
        btnSubmit2.click();
    }


    public void clickCheckboxUser() {
        checkboxUser.click();
    }

    public void clickUpdateDichecklist() {
        updateDichecklist.click();
    }

    public void clickBtnSubmit() {
        btnSubmit.click();
    }
    public String getTxtInformasi() {
        return teksInformasi.getText();
    }

    public String getResultNik() {
        return resultNik.getText();
    }

    public void clickButtonSearch() {
        btnSearch.click();
    }

    public void clickDropdownName() {
        dropdownSearchName.click();
        DriverSingleton.delay(3);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        dropdownSearchNik.click();
        DriverSingleton.delay(3);
    }
    public void clickBtnReset() {
        btnReset.click();
    }

    public String getResultName2() {
        return resultName2.getText();
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
}
