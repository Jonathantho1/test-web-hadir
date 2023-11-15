package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator
    @FindBy(xpath = "//div[@class='MuiBox-root css-1qd452l']")
    private WebElement totalEmployees;

    @FindBy(xpath = "//div[@class='MuiBox-root css-1qd452l']")
    private WebElement totalAbsenToday;

    public String getTotalEmployees() {
        return totalEmployees.getText();
    }

    public String getAbsenToday() {
        return totalAbsenToday.getText();
    }
}
