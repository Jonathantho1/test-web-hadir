package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.MngRegisterUserPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class MngRegUserTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static MngRegisterUserPage mngRegisterUserPage = new MngRegisterUserPage();

    public MngRegUserTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Click menu management")
    public void click_menu_management(){
        mngRegisterUserPage.clickManagement();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS, "Klik menu management");
    }

    @And("Click menu user register")
    public void click_menu_user_register() {
        mngRegisterUserPage.clickUserRegister();
        extentTest.log(LogStatus.PASS, "Klik menu user register");
    }

    @And("Input all fields with the correct format")
    public void input_all_fields_with_correct_format() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mngRegisterUserPage.uploadEmployeePhoto("C:\\Users\\User\\Pictures\\WhatsApp\\fotoMe.jpg");
        mngRegisterUserPage.inputEmployeeNik("1234567");
        mngRegisterUserPage.inputEmployeeEmail("anwar@gmail.com");
        mngRegisterUserPage.inputEmployeeName("Anwar");
        mngRegisterUserPage.inputPassword("juaracod168");
        mngRegisterUserPage.inputDivision("BUKALAPAK");
        mngRegisterUserPage.inputPosition("Staff");
        mngRegisterUserPage.inputUnit("SQA-TEST");
        mngRegisterUserPage.inputWorkPosition("QA");
        mngRegisterUserPage.inputSuperior("anwar");
        mngRegisterUserPage.inputContractType("Magang");
        mngRegisterUserPage.inputWorkLocation("DIKA 1");
        mngRegisterUserPage.inputShiftType("Shift");
        mngRegisterUserPage.inputWorkSchedule("BCA Life");
        mngRegisterUserPage.inputSelfie("Selfie");
        mngRegisterUserPage.inputLeaves("2");
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS, "Input semua field dengan benar");
    }

    @And("Click button submit")
    public void click_button_submit() {
        mngRegisterUserPage.clickBtnSubmit();
        DriverSingleton.delay(3);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("Successfully added to user list")
    public void successfully_added_to_user_list() {
        DriverSingleton.delay(3);
        Assert.assertEquals(mngRegisterUserPage.getTxtRegUser(), "Pendaftaran User");
        extentTest.log(LogStatus.PASS, "Berhasil menambahkan ke daftar user");
    }

    @And("Clear field unit")
    public void clear_field_unit() {
        mngRegisterUserPage.clearUnit();
    }

    @And("Clear field position")
    public void clear_field_position() {
        mngRegisterUserPage.clearPosition();
    }

    @And("Clear field type contract")
    public void clear_field_type_contract() {
        mngRegisterUserPage.clearTypeContract();
    }

    @And("Clear field work location")
    public void clear_field_work_location() {
        mngRegisterUserPage.clearWorkLocation();
    }

    @And("Clear field work schedule")
    public void clear_field_work_schedule() {
        mngRegisterUserPage.clearWorkSchedule();
    }

    @And("Clear field selfie")
    public void clear_field_selfie() {
        mngRegisterUserPage.clearSelfie();
    }

    @And("Clear field work position")
    public void clear_field_work_position() {
        mngRegisterUserPage.clearWorkPosition();
    }

    @Then("Get alert Please fill out this field nik")
    public void get_alert_please_fill_out_this_field_nik() {
        Assert.assertEquals(mngRegisterUserPage.getValidationNik(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field name")
    public void get_alert_please_fill_out_this_field_name() {
        Assert.assertEquals(mngRegisterUserPage.getValidationName(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field email")
    public void get_alert_please_fill_out_this_field_email() {
        Assert.assertEquals(mngRegisterUserPage.getValidationEmail(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field password")
    public void get_alert_please_fill_out_this_field_password() {
        Assert.assertEquals(mngRegisterUserPage.getValidationPassword(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field division")
    public void get_alert_please_fill_out_this_field_division() {
        Assert.assertEquals(mngRegisterUserPage.getValidationDivision(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field unit")
    public void get_alert_please_fill_out_this_field_unit() {
        Assert.assertEquals(mngRegisterUserPage.getValidationWorkPos(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field work position")
    public void get_alert_please_fill_out_this_field_work_position() {
        Assert.assertEquals(mngRegisterUserPage.getValidationUnit(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field work location")
    public void get_alert_please_fill_out_this_field_work_location() {
        Assert.assertEquals(mngRegisterUserPage.getValidationLocation(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field type contract")
    public void get_alert_please_fill_out_this_type_contract() {
        Assert.assertEquals(mngRegisterUserPage.getValidationContract(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field position")
    public void get_alert_please_fill_out_this_field_position() {
        Assert.assertEquals(mngRegisterUserPage.getValidationPosition(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field work schedule")
    public void get_alert_please_fill_out_this_field_work_schedule() {
        Assert.assertEquals(mngRegisterUserPage.getValidationSchedule(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @Then("Get alert Please fill out this field selfie")
    public void get_alert_please_fill_out_this_field_selfie() {
        Assert.assertEquals(mngRegisterUserPage.getValidationSelfie(), "Please fill out this field.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please fill out this field");
    }

    @And("Input registered email")
    public void input_registered_email() {
        mngRegisterUserPage.clearEmail();
        mngRegisterUserPage.inputEmployeeEmail("admin@hadir.com");
    }

    @Then("Get alert Email sudah terdaftar")
    public void get_alert_email_sudah_terdaftar() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(mngRegisterUserPage.getAlert(),"Email sudah terdaftar");
        extentTest.log(LogStatus.PASS,"Mendapatkan message");
    }

    @Then("Get alert Foto tidak boleh kosong")
    public void get_alert_foto_tidak_boleh_kosong() {
        Assert.assertEquals(mngRegisterUserPage.getAlert(),"Foto tidak boleh kosong");
        extentTest.log(LogStatus.PASS,"Mendapatkan message");
    }

    @And("Clear field employee photo")
    public void clear_field_employee_photo() {
        mngRegisterUserPage.clearEmployeePhoto();
        DriverSingleton.delay(3);
    }

    @And("Input email without symbol at")
    public void input_email_without_symbol_at() {
        mngRegisterUserPage.clearEmail();
        mngRegisterUserPage.inputEmployeeEmail("adminhadir.com");
    }

    @Then("Get alert Please include symbol at")
    public void get_alert_please_include_symbol_at() {
        Assert.assertEquals(mngRegisterUserPage.getValidationEmail(), "Please include an '@' in the email address. 'adminhadir.com' is missing an '@'.");
        extentTest.log(LogStatus.PASS, "Muncul pesan Please include an '@' in the email address");
    }

    @And("Clear field NIK")
    public void clear_field_NIK() {
        mngRegisterUserPage.clearFieldNik();
        extentTest.log(LogStatus.PASS, "Hapus isi nik");
    }

    @And("Clear field name")
    public void clear_field_name() {
        mngRegisterUserPage.clearFieldName();
        extentTest.log(LogStatus.PASS, "Hapus isi name");
    }

    @And("Input all fields except name")
    public void input_all_fields_except_name() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DriverSingleton.delay(5);
        extentTest.log(LogStatus.PASS, "Input semua field kecuali name");
    }

    @And("Clear field password")
    public void clear_field_password() {
        mngRegisterUserPage.clearPassword();
    }

    @And("Clear field division")
    public void clear_field_division() {
        mngRegisterUserPage.clearDivision();
        extentTest.log(LogStatus.PASS, "Menghapus nilai divisi");
    }
    @And("Clear field email")
    public void clear_field_email() {
        mngRegisterUserPage.clearEmail();
    }
}
