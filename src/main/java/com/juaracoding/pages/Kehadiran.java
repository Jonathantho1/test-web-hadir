package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class Kehadiran {
    private WebDriver driver;


    public Kehadiran() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator use Page Factory
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnlogin;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1ub5lza'][normalize-space()='Laporan']")
    private WebElement laporanMenu;

    @FindBy(xpath = "//p[normalize-space()='Kehadiran']")
    private WebElement kehadiranSubMenu;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resethBtn;

    //button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1k0lhp1']//*[name()='svg']
    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1k0lhp1']//*[name()='svg']")
    private WebElement filterBtn;

    @FindBy(xpath = "//*[@id=\"job_departement\"]")
    private WebElement jobDepartField;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/form/div/div[1]/div[2]/div[1]/div/div/button")
    private WebElement starDate;

    @FindBy(xpath = "//input[@placeholder='Early']")
    private WebElement firstDate;

    @FindBy(xpath = "//input[@placeholder='Continuous']")
    private WebElement secondDate;

    @FindBy(xpath = "//input[@placeholder='Start Date']")
    private WebElement inputSD;
    @FindBy(xpath = "//input[@placeholder='End Date']")
    private WebElement inputED;

    @FindBy(xpath = "//button[normalize-space()='save']")
    private WebElement saveBtn;

    @FindBy(xpath = "//button[normalize-space()='Export']")
    private WebElement exportBtn;

    @FindBy(xpath = "//*[@id=\"generate-report\"]/div[2]/button[1]")
    private WebElement exportPopUp;

    @FindBy(xpath = "//*[@id=\"generate-report\"]/div[2]/button[2]")
    private WebElement cancelExport;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1kei35f']")
    private WebElement validSearch;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/button[1]/h6[1]")
    private WebElement validName;

    @FindBy(xpath = "//*[@id=\"alert-dialog-title\"]")
    private WebElement validasiExport;

    @FindBy(xpath = "//*[@id=\"mui-4\"]")
    private WebElement rowPerPage1;
    @FindBy(xpath = "//*[@id=\"mui-3\"]/li[3]")
    private WebElement rowPerPage2;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[2]/div/div[3]/div/table/tbody/tr[1]/td[3]/h6")
    private WebElement validDepart;


    public void loginPage(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        btnlogin.click();
    }

    public void clickBtnLaporan() {
        laporanMenu.click();
        DriverSingleton.delay(1);
    }

    public void clickBtnKehadiran() {
        kehadiranSubMenu.click();
    }

    public void inputTanggal1(String tanggal1, String tanggal2) {
        starDate.click();
        firstDate.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        firstDate.sendKeys(tanggal1);
        DriverSingleton.delay(2);
        secondDate.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        secondDate.sendKeys(tanggal2);
        DriverSingleton.delay(2);
        saveBtn.click();
    }

    public void inputTanggal2(String tanggal1, String tanggal2) {
        starDate.click();
        firstDate.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        firstDate.sendKeys(tanggal1);
        DriverSingleton.delay(2);
        secondDate.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        secondDate.sendKeys(tanggal2);
        DriverSingleton.delay(2);
        secondDate.sendKeys(ENTER);
    }

    public void inputDate(String tanggal1) {
        inputSD.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        inputSD.sendKeys(tanggal1);

    }

    public void resetButton() {
        resethBtn.click();
    }

    public void inputName(String name) {
        this.searchField.sendKeys(name);
    }

    public void inputDepart(String department) {
        filterBtn.click();
        this.jobDepartField.sendKeys(department);
        DriverSingleton.delay(3);
        jobDepartField.sendKeys(ARROW_DOWN,ENTER,ENTER);
        DriverSingleton.delay(3);
        searchBtn.click();

    }

    public void searchClick() {
        searchBtn.click();
    }

    public void rowPage(){
        rowPerPage1.click();
        DriverSingleton.delay(2);
        rowPerPage2.click();
        DriverSingleton.delay(2);
    }

    public void export(){
        exportBtn.click();
        exportPopUp.click();
    }
    public void cancelExport(){
        cancelExport.click();
    }

    public String currDate(){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        String formattedDate = dateFormat.format(currentDate);
        return formattedDate;
    }


    //    valid search
    public String validSearch() {
        return validSearch.getText();
    }

    //    validasi reset
    public void sd() {
        starDate.click();
    }

    public String validReset() {
        return firstDate.getAttribute("value");
    }

    //    invalid reset
    public String invalidReset() {
        return searchField.getAttribute("value");
    }

    //    Negatif Date
    public String invalidDate() {
        starDate.click();
        return firstDate.getAttribute("value");
    }
//    valid name
    public String validName() {
        return validName.getText();
    }

    public String validExport() {
        return validasiExport.getText();
    }

    public String validPage() {
        return rowPerPage1.getText();
    }

    public String validDepart() {
        return validDepart.getText();
    }



}
