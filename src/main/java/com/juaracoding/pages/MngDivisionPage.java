package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MngDivisionPage {
    private WebDriver driver;

    public MngDivisionPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator
    @FindBy(xpath = "//div[@id='__next']/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div[4]")
    private WebElement division;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearch;
    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr/td/h6")
    private WebElement txtResult;
    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr/td/h6")
    private WebElement txtResult2;
    @FindBy(xpath = "(//button[@type='button'])[5]")
    private WebElement btnAdd;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputDivisi;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement btnAddDiv;
    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr[8]/td/h6")
    private WebElement txtAddResult;


    public void clickDivisi() {
        division.click();
    }

    public void clickBtnAdd() {
        btnAdd.click();
    }

    public void inputDivision(String div) {
        inputDivisi.sendKeys(div);
    }

    public void clickBtnAddDiv() {
        btnAddDiv.click();
    }

    public String getResultAddDiv() {
        return txtAddResult.getText();
    }

    public void inputSearch(String div) {
        inputSearch.sendKeys(div);
    }

    public void clickBtnSearch() {
        btnSearch.click();
    }

    public String getTxtResult() {
        return txtResult.getText();
    }

    public String getTxtResult2() {
        return txtResult2.getText();
    }
}
