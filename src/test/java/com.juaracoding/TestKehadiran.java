package com.juaracoding;


import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.Kehadiran;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestKehadiran {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static Kehadiran kehadiran = new Kehadiran();

    public TestKehadiran(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User login, Kehadiran")
    public  void usrLogin(){
        driver.get(Constant.url);
        kehadiran.loginPage("admin@hadir.com","admin@hadir");
        extentTest.log(LogStatus.PASS,"User login, Kehadiran");
    }
    @When("User click menu laporan, Kehadiran")
    public  void clickLaporan(){
        kehadiran.clickBtnLaporan();
        extentTest.log(LogStatus.PASS,"User click menu laporan, Kehadiran");
    }

    @And("User click submenu kehadiran")
    public  void clickKehadiran(){
        kehadiran.clickBtnKehadiran();
        extentTest.log(LogStatus.PASS,"User click submenu kehadiran");
    }

    @And("User input date, Kehadiran")
    public void inputDate1(){
        kehadiran.inputTanggal1("Jul 1, 2023","Aug 31, 2023");
        extentTest.log(LogStatus.PASS,"User input date, Kehadiran");
    }

    @And("User click search btn, Kehadiran")
    public void searchBtn(){
        kehadiran.searchClick();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User click search btn, Kehadiran");
    }

    @Then("User get search Validation, Kehadiran")
    public void searchValidation(){
        Assert.assertEquals(kehadiran.validSearch(),"Kehadiran");
        System.out.printf(kehadiran.validSearch());
        extentTest.log(LogStatus.PASS,"User get search Validation, Kehadiran");
    }

    @Given("User click reset button, Kehadiran")
    public void resetButton(){
        kehadiran.resetButton();
        extentTest.log(LogStatus.PASS,"User click reset button, Kehadiran");
    }
    @When("User input date and press enter, Kehadiran")
    public void inputDate2(){
        kehadiran.inputTanggal2("Jul 1, 2023","Aug 31, 2023");
        extentTest.log(LogStatus.PASS,"User input date and press enter, Kehadiran");
    }
    @Then("User get reset Validation, Kehadiran")
    public void resetValidation(){
        kehadiran.sd();
        Assert.assertEquals(kehadiran.validReset(),kehadiran.currDate());
        System.out.printf(kehadiran.validReset());
        extentTest.log(LogStatus.PASS,"User get reset Validation, Kehadiran");
    }

    @And("User input name, Kehadiran")
    public void inptName(){
        kehadiran.inputName("Mitra");
        extentTest.log(LogStatus.PASS,"User input name, Kehadiran");
    }
    @Then("User get invalid message, Kehadiran")
    public void invalidReset(){
        Assert.assertEquals(kehadiran.invalidReset(),"Mitra");
        System.out.printf(kehadiran.invalidReset());
        extentTest.log(LogStatus.PASS,"User get invalid message, Kehadiran");
    }

    @And("User input new date, Kehadiran")
    public void inptNewDate(){
        kehadiran.inputDate("02-06-2023");
        extentTest.log(LogStatus.PASS,"User input new date, Kehadiran");
    }
    @Then("User get invalid date, Kehadiran")
    public void invalidDate(){
        Assert.assertEquals(kehadiran.invalidDate(),"Jun 2, 2023");
        System.out.printf(kehadiran.invalidDate());
        extentTest.log(LogStatus.PASS,"User get invalid date, Kehadiran");
    }

    @Then("User get name Validation, Kehadiran")
    public void validName(){
        Assert.assertEquals(kehadiran.validName(),"Mitra");
        System.out.printf(kehadiran.validName());
        extentTest.log(LogStatus.PASS,"User get name Validation, Kehadiran");
    }

    @And("User click export button, Kehadiran")
    public void exportButton(){
        kehadiran.export();
        extentTest.log(LogStatus.PASS,"User click export button, Kehadiran");
    }
    @Then("User get export Validation, Kehadiran")
    public void exportValidation(){
        Assert.assertEquals(kehadiran.validExport()," ");
        System.out.printf(kehadiran.validExport());
        extentTest.log(LogStatus.PASS,"User get export Validation, Kehadiran");
    }

    @And("User input department, Kehadiran")
    public void inputDepart(){
        kehadiran.inputDepart("AMEX MERCHANT");
        extentTest.log(LogStatus.PASS,"User input department, Kehadiran");
    }
    @Then("User get department Validation, Kehadiran")
    public void departValidation(){
        Assert.assertEquals(kehadiran.validDepart(),"AMEX MERCHANT");
        System.out.printf(kehadiran.validDepart());
        extentTest.log(LogStatus.PASS,"User get department Validation, Kehadiran");
    }

    @Given("User click cancel export button")
    public void cncExport() {
        kehadiran.cancelExport();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User click cancel export button");
    }
    @And("Change page, Kehadiran")
    public void customPage() {
        kehadiran.rowPage();
        extentTest.log(LogStatus.PASS, "Change page, Kehadiran");
    }

    @Then("User get page Validation, Kehadiran")
    public void pageValidation() {
        Assert.assertEquals(kehadiran.validPage(), "25");
        System.out.printf(kehadiran.validPage());
        extentTest.log(LogStatus.PASS, "User get page Validation, Kehadiran");
    }
}
