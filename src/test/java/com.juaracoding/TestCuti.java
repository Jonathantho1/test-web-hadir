package com.juaracoding;


import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.Cuti;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCuti {

    private static WebDriver driver;
    private static Cuti cuti = new Cuti();
    private static ExtentTest extentTest;

    public TestCuti(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User login, cuti")
    public  void usrLogin(){
        driver.get(Constant.url);
        cuti.loginPage("admin@hadir.com","admin@hadir");
        extentTest.log(LogStatus.PASS,"User login, cuti");
    }
    @When("User click menu laporan, cuti")
    public  void clickLaporan(){
        cuti.clickBtnLaporan();
        extentTest.log(LogStatus.PASS,"User click menu laporan, cuti");
    }

    @And("User click submenu Cuti")
    public  void clickCuti(){
        cuti.clickBtnCuti();
        extentTest.log(LogStatus.PASS,"User click submenu Cuti");
    }

    @And("User input date, cuti")
    public void inputDate1(){
        cuti.inputTanggal1("Jul 1, 2023","Aug 31, 2023");
        extentTest.log(LogStatus.PASS,"User input date, cuti");
    }

    @And("User click search btn, cuti")
    public void searchBtn(){
        cuti.searchClick();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User click search btn, cuti");
    }
    @Given("User click reset button, cuti")
    public void resetButton(){
        cuti.resetButton();
        extentTest.log(LogStatus.PASS,"User click reset button, cuti");
    }
    @When("User input date and press enter, cuti")
    public void inputDate2(){
        cuti.inputTanggal2("Jul 1, 2023","Aug 31, 2023");
        extentTest.log(LogStatus.PASS,"User input date and press enter, cuti");
    }

    @Then("User get search Validation, cuti")
    public void searchValidation(){
        Assert.assertEquals(cuti.validSearch(),"Cuti");
        System.out.printf(cuti.validSearch());
        extentTest.log(LogStatus.PASS,"User get search Validation, cuti");
    }

    @Then("User get reset Validation, cuti")
    public void user_get_reset_Validation(){
        cuti.sd();
        Assert.assertEquals(cuti.validReset(),cuti.currDate());
        System.out.printf(cuti.validReset());
        extentTest.log(LogStatus.PASS,"User get reset Validation, cuti");
    }

    @And("User input name, cuti")
    public void inptName(){
        cuti.inputName("Elpa");
        extentTest.log(LogStatus.PASS,"User input name, cuti");
    }
    @Then("User get invalid message, cuti")
    public void invalidReset(){
        Assert.assertEquals(cuti.invalidReset(),"Elpa");
        System.out.printf(cuti.invalidReset());
        extentTest.log(LogStatus.PASS,"User get invalid message, cuti");
    }

    @And("User input new date, cuti")
    public void inptNewDate(){
        cuti.inputDate("02-06-2023");
        extentTest.log(LogStatus.PASS,"User input new date, cuti");
    }
    @Then("User get invalid date, cuti")
    public void invalidDate(){
        Assert.assertEquals(cuti.invalidDate(),"Jun 2, 2023");
        System.out.printf(cuti.invalidDate());
        extentTest.log(LogStatus.PASS,"User get invalid date, cuti");
    }

    @Then("User get name Validation, cuti")
    public void validName(){
        Assert.assertEquals(cuti.validName(),"Elpa");
        System.out.printf(cuti.validName());
        extentTest.log(LogStatus.PASS,"User get name Validation, cuti");
    }


    @And("Change page, cuti")
    public void customPage() {
        cuti.rowPage();
        extentTest.log(LogStatus.PASS, "Change page, cuti");
    }

    @Then("User get page Validation, cuti")
    public void pageValidation() {
        Assert.assertEquals(cuti.validPage(), "25");
        System.out.printf(cuti.validPage());
        extentTest.log(LogStatus.PASS, "User get page Validation, cuti");
    }
}
