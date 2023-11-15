package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.MngDivisionPage;
import com.juaracoding.pages.MngRegisterUserPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MngDivisionTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static MngDivisionPage mngDivisionPage = new MngDivisionPage();

    public MngDivisionTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("Click menu division")
    public void click_menu_division() {
        mngDivisionPage.clickDivisi();
    }

    @And("Input the correct division")
    public void input_the_correct_division() {
        mngDivisionPage.inputSearch("Bank Jago");
    }

    @And("Click button search div")
    public void click_button_search_div() {
        mngDivisionPage.clickBtnSearch();
        DriverSingleton.delay(3);
    }

    @Then("Get valid result division")
    public void get_valid_result_division() {
        Assert.assertEquals(mngDivisionPage.getTxtResult(), "Bank Jago");
    }

    @Then("Display all division")
    public void display_all_division() {
        DriverSingleton.delay(3);
        Assert.assertEquals(mngDivisionPage.getTxtResult2(), "Bank Ayam KFC");
    }

    @And("Click button add")
    public void click_button_add() {
        DriverSingleton.delay(3);
        mngDivisionPage.clickBtnAdd();
    }

    @And("Input new division")
    public void input_new_division() {
        mngDivisionPage.inputDivision("IT Support");
    }

    @And("Click button add division")
    public void click_button_add_division() {
        mngDivisionPage.clickBtnAddDiv();
    }

    @Then("Success add new division")
    public void success_add_new_division() {
        DriverSingleton.delay(3);
        Assert.assertEquals(mngDivisionPage.getResultAddDiv(), "IT Support");
    }
}
