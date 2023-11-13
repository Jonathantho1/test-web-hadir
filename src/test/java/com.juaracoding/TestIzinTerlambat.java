package com.juaracoding;


import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.IzinTerlambat;
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

public class TestIzinTerlambat {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static IzinTerlambat izinTerlambat = new IzinTerlambat();

    public TestIzinTerlambat(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User login, izinTerlamabat")
    public  void usrLogin(){
        driver.get(Constant.url);
        izinTerlambat.loginPage("admin@hadir.com","admin@hadir");
        extentTest.log(LogStatus.PASS,"User login, izinTerlamabat");
    }
    @When("User click menu laporan, izinTerlamabat")
    public  void clickLaporan(){
        izinTerlambat.clickBtnLaporan();
        extentTest.log(LogStatus.PASS,"User click menu laporan, izinTerlamabat");
    }

    @And("User click submenu Izin Terlambat")
    public  void clickizinTerlambat(){
        izinTerlambat.clickBtnIzinTerlambat();
        extentTest.log(LogStatus.PASS,"User click submenu Izin Terlambat");
    }

    @And("User input date, izinTerlamabat")
    public void inputDate1(){
        izinTerlambat.inputTanggal1("Jul 1, 2023","Aug 31, 2023");
        extentTest.log(LogStatus.PASS,"User input date, izinTerlamabat");
    }

    @And("User click search btn, izinTerlamabat")
    public void searchBtn(){
        izinTerlambat.searchClick();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User click search btn, izinTerlamabat");
    }

    @Then("User get search Validation, izinTerlamabat")
    public void searchValidation(){
        Assert.assertEquals(izinTerlambat.validSearch(),"Izin Terlambat");
        System.out.printf(izinTerlambat.validSearch());
        extentTest.log(LogStatus.PASS,"User get search Validation, izinTerlamabat");
    }
    @Given("User click reset button, izinTerlamabat")
    public void resetButton(){
        izinTerlambat.resetButton();
        extentTest.log(LogStatus.PASS,"User click reset button, izinTerlamabat");
    }
    @When("User input date and press enter, izinTerlamabat")
    public void inputDate2(){
        izinTerlambat.inputTanggal2("Jul 1, 2023","Aug 31, 2023");
        extentTest.log(LogStatus.PASS,"User input date and press enter, izinTerlamabat");
    }

    @Then("User get reset Validation, izinTerlamabat")
    public void user_get_reset_Validation(){
        izinTerlambat.sd();
        Assert.assertEquals(izinTerlambat.validReset(),izinTerlambat.currDate());
        System.out.printf(izinTerlambat.validReset());
        extentTest.log(LogStatus.PASS,"User get reset Validation, izinTerlamabat");
    }

    @And("User input name, izinTerlamabat")
    public void inptName(){
        izinTerlambat.inputName("Dummy Staff");
        extentTest.log(LogStatus.PASS,"User input name, izinTerlamabat");
    }
    @Then("User get invalid message, izinTerlamabat")
    public void invalidReset(){
        Assert.assertEquals(izinTerlambat.invalidReset(),"Dummy Staff");
        System.out.printf(izinTerlambat.invalidReset());
        extentTest.log(LogStatus.PASS,"User get invalid message, izinTerlamabat");
    }

    @And("User input new date, izinTerlamabat")
    public void inptNewDate(){
        izinTerlambat.inputDate("02-06-2023");
        extentTest.log(LogStatus.PASS,"User input new date, izinTerlamabat");
    }
    @Then("User get invalid date, izinTerlamabat")
    public void invalidDate(){
        Assert.assertEquals(izinTerlambat.invalidDate(),"Jun 2, 2023");
        System.out.printf(izinTerlambat.invalidDate());
        extentTest.log(LogStatus.PASS,"User get invalid date, izinTerlamabat");
    }

    @Then("User get name Validation, izinTerlamabat")
    public void validName(){
        Assert.assertEquals(izinTerlambat.validName(),"Dummy Staff");
        System.out.printf(izinTerlambat.validName());
        extentTest.log(LogStatus.PASS,"User get name Validation, izinTerlamabat");
    }

    @And("User input department, izinTerlamabat")
    public void inputDepart(){
        izinTerlambat.inputDepart("IT Programmer");
        extentTest.log(LogStatus.PASS,"User input department, izinTerlamabat");
    }
    @Then("User get department Validation, izinTerlamabat")
    public void departValidation(){
        Assert.assertEquals(izinTerlambat.validDepart(), "IT Programmer");
        System.out.printf(izinTerlambat.validDepart());
        extentTest.log(LogStatus.PASS,"User get department Validation, izinTerlamabat");
    }

    @When("Change page, izinTerlamabat")
    public void customPage() {
        izinTerlambat.rowPage();
        extentTest.log(LogStatus.PASS, "Change page, izinTerlamabat");
    }

    @Then("User get page Validation, izinTerlamabat")
    public void pageValidation() {
        Assert.assertEquals(izinTerlambat.validPage(), "25");
        System.out.printf(izinTerlambat.validPage());
        extentTest.log(LogStatus.PASS, "User get page Validation, izinTerlamabat");
    }
}
