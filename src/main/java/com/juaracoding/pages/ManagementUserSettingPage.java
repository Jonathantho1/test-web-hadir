package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ManagementUserSettingPage {
    private WebDriver driver;

    public ManagementUserSettingPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //Management User Setting Page
    @FindBy(xpath = "//p[normalize-space()='Unit Setting']")
    private WebElement unitSettingButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]/span/span[1]/input")
    private WebElement selfieButton;//input[@type='checkbox']

    @FindBy(xpath = "//h6[normalize-space()='ABC Compe']")
    private WebElement namaDepartment;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/h6[1]")
    private WebElement tanggalBuat;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/h6[1]")
    private WebElement tanggalUpdate;

    @FindBy(xpath = "//div[@id='mui-2']")
    private WebElement rowPerPageButton;

    @FindBy(xpath = "//ul[@id='mui-1']/li")
    private WebElement rowPerPage;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[3]/div/div/p[2]")
    private WebElement overlay;

    //Management User Setting Tambahkan Page
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement tambahkanButton;

    @FindBy(xpath = "//*[@id=\"alert-slide-description\"]/div/div")
    private WebElement listBox;

    @FindBy(xpath = "//div[3]/ul/li[4]")
    private WebElement department;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement tambahButton;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[2]/button[2]")
    private WebElement batalButton;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div/div")
    private WebElement alert;

    //Management Unit Setting Delete Page
    @FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]//*[name()='svg']")
    private WebElement deleteButton;

    @FindBy(xpath = "(//button[@type='button'])[19]")
    private WebElement tidakButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement yaButton;

    //Management User Setting Page
    public void setUnitSettingButton(){
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        unitSettingButton.click();
    }

    public void setSelfieButton(){
        selfieButton.click();
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

    //Management User Setting Tambahkan Page
    public void setTambahkanButton(){
        DriverSingleton.delay(5);
        tambahkanButton.click();
    }

    public void setListBox(){
        DriverSingleton.delay(5);
        listBox.click();
    }

    public void setDepartment(){
        DriverSingleton.delay(5);
        department.click();
    }

    public void setTambahButton(){
        DriverSingleton.delay(5);
        tambahButton.click();
    }

    public void setBatalButton(){
        DriverSingleton.delay(5);
        batalButton.click();
    }

    public String getAlert(){
        DriverSingleton.delay(3);
        return alert.getText();
    }

    //Management Unit Setting Delete Page
    public void setDeleteButton(){
        deleteButton.click();
    }

    public void setTidakButton(){
        tidakButton.click();
    }

    public void setYaButton(){
        yaButton.click();
    }
}
