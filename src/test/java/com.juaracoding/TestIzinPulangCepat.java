package com.juaracoding;


import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.IzinPulangCepat;
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

public class TestIzinPulangCepat {

    private static WebDriver driver;
    private static IzinPulangCepat izinPulangCepat = new IzinPulangCepat();
    private static ExtentTest extentTest;

    public TestIzinPulangCepat(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User login, izinPulangCepat")
    public  void usrLogin(){
        driver.get(Constant.url);
        izinPulangCepat.loginPage("admin@hadir.com","admin@hadir");
        extentTest.log(LogStatus.PASS,"User login, izinPulangCepat");
    }
    @When("User click menu laporan, izinPulangCepat")
    public  void clickLaporan(){
        izinPulangCepat.clickBtnLaporan();
        extentTest.log(LogStatus.PASS,"User click menu laporan, izinPulangCepat");
    }

    @And("User click submenu Izin Pulang Cepat")
    public  void clickizinPulangCepat(){
        izinPulangCepat.clickBtnIzinPulangCepat();
        extentTest.log(LogStatus.PASS,"User click submenu Izin Pulang Cepat");
    }

    @And("User input date, izinPulangCepat")
    public void inputDate1(){
        izinPulangCepat.inputTanggal1("Jul 1, 2023","Aug 31, 2023");
        extentTest.log(LogStatus.PASS,"User input date, izinPulangCepat");
    }

    @And("User click search btn, izinPulangCepat")
    public void searchBtn(){
        izinPulangCepat.searchClick();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User click search btn, izinPulangCepat");
    }

    @Then("User get search Validation, izinPulangCepat")
    public void searchValidation(){
        Assert.assertEquals(izinPulangCepat.validSearch(),"Izin Pulang Cepat");
        System.out.printf(izinPulangCepat.validSearch());
        extentTest.log(LogStatus.PASS,"User get search Validation, izinPulangCepat");
    }

    @Given("User click reset button, izinPulangCepat")
    public void resetButton(){
        izinPulangCepat.resetButton();
        extentTest.log(LogStatus.PASS,"User click reset button, izinPulangCepat");
    }
    @When("User input date and press enter, izinPulangCepat")
    public void inputDate2(){
        izinPulangCepat.inputTanggal2("Jul 1, 2023","Aug 31, 2023");
        extentTest.log(LogStatus.PASS,"User input date and press enter, izinPulangCepat");
    }

    @Then("User get reset Validation, izinPulangCepat")
    public void user_get_reset_Validation(){
        izinPulangCepat.sd();
        Assert.assertEquals(izinPulangCepat.validReset(),izinPulangCepat.currDate());
        System.out.printf(izinPulangCepat.validReset());
        extentTest.log(LogStatus.PASS,"User get reset Validation, izinPulangCepat");
    }

    @And("User input name, izinPulangCepat")
    public void inptName(){
        izinPulangCepat.inputName("Agung Aji Nugraha");
        extentTest.log(LogStatus.PASS,"User input name, izinPulangCepat");
    }
    @Then("User get invalid message, izinPulangCepat")
    public void invalidReset(){
        Assert.assertEquals(izinPulangCepat.invalidReset(),"Agung Aji Nugraha");
        System.out.printf(izinPulangCepat.invalidReset());
        extentTest.log(LogStatus.PASS,"User get invalid message, izinPulangCepat");
    }

    @And("User input new date, izinPulangCepat")
    public void inptNewDate(){
        izinPulangCepat.inputDate("02-06-2023");
        extentTest.log(LogStatus.PASS,"User input new date, izinPulangCepat");
    }
    @Then("User get invalid date, izinPulangCepat")
    public void invalidDate(){
        Assert.assertEquals(izinPulangCepat.invalidDate(),"Jun 2, 2023");
        System.out.printf(izinPulangCepat.invalidDate());
        extentTest.log(LogStatus.PASS,"User get invalid date, izinPulangCepat");
    }

    @Then("User get name Validation, izinPulangCepat")
    public void validName(){
        Assert.assertEquals(izinPulangCepat.validName(),"Agung Aji Nugraha");
        System.out.printf(izinPulangCepat.validName());
        extentTest.log(LogStatus.PASS,"User get name Validation, izinPulangCepat");
    }

    @And("User input department, izinPulangCepat")
    public void inputDepart(){
        izinPulangCepat.inputDepart("AMEX MERCHANT");
        extentTest.log(LogStatus.PASS,"User input department, izinPulangCepat");
    }
    @Then("User get department Validation, izinPulangCepat")
    public void departValidation(){
        Assert.assertEquals(izinPulangCepat.validDepart(),"AMEX MERCHANT");
        System.out.printf(izinPulangCepat.validDepart());
        extentTest.log(LogStatus.PASS,"User get department Validation, izinPulangCepat");
    }

    @And("Change page, izinPulangCepat")
    public void customPage() {
        izinPulangCepat.rowPage();
        extentTest.log(LogStatus.PASS, "Change page, izinPulangCepat");
    }

    @Then("User get page Validation, izinPulangCepat")
    public void pageValidation() {
        Assert.assertEquals(izinPulangCepat.validPage(), "25");
        System.out.printf(izinPulangCepat.validPage());
        extentTest.log(LogStatus.PASS, "User get page Validation, izinPulangCepat");
    }
}
