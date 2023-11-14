package com.juaracoding;

import com.juaracoding.pages.AbsenPointPage;
import com.juaracoding.pages.JabatanPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestJabatan {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static JabatanPage jabatanPage = new JabatanPage();

    public TestJabatan() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // #TCC.HW.008
    @Given("User click menu Jabatan")
    public void user_click_menu_jabatan() {
        jabatanPage.clickMenuJabatan();
        extentTest.log(LogStatus.PASS, "User click menu Jabatan");
    }

    @When("User click button tambahkan jabatan")
    public void user_click_button_tambahkan_jabatan() {
        jabatanPage.clickTambahkanJabatan();
        extentTest.log(LogStatus.PASS, "User click button tambahkan jabatan");
    }

    @When("Input Nama Jabatan")
    public void input_nama_jabatan() {
        jabatanPage.inputNameJabatan("Sub Unit Head");
        extentTest.log(LogStatus.PASS, "Input Nama Jabatan");
    }

    @And("Input Level Jabatan")
    public void input_level_jabatan() {
        jabatanPage.inputLevelJabatan("97");
        extentTest.log(LogStatus.PASS, "Input Level Jabatan");
    }
    @And("Klik Button Tambah Jabatan")
    public void klik_button_tambah_jabatan() {
        jabatanPage.clickTambahJabatan();
        extentTest.log(LogStatus.PASS, "Klik Button Tambah Jabatan");
    }


    // #TCC.HW.009
    @When("Kosongkan Kolom Input Nama Jabatan")
    public void kosongkan_kolom_input_nama_jabatan() {
        jabatanPage.inputNameJabatan("");
        extentTest.log(LogStatus.PASS, "Kosongkan Kolom Input Nama Jabatan");
    }
    @And("Klik Button Batal Jabatan")
    public void klik_button_batal_jabatan() {
        jabatanPage.clickBatalJabatan();
        extentTest.log(LogStatus.PASS, "Klik Button Batal Jabatan");
    }

    // #TCC.HW.010
    @And("Kosongkan Kolom Input Level Jabatan")
    public void kosongkan_kolom_input_level_jabatan() {
        jabatanPage.inputLevelJabatan("");
        extentTest.log(LogStatus.PASS, "Kosongkan Kolom Input Level Jabatan");
    }

    // #TCC.HW.011
    @And("Input Edit Level")
    public void input_edit_level() {
        jabatanPage.clearLevelJabatan();
        jabatanPage.inputLevelJabatan("1");
        extentTest.log(LogStatus.PASS, "Input Edit Level");
    }

    // #TCC.HW.012
    @Given("Input Level Jabatan Pada Kolom Search")
    public void input_level_jabatan_pada_kolom_search() {
        jabatanPage.inputSearchJabatan("9");
        extentTest.log(LogStatus.PASS, "Input Level Jabatan Pada Kolom Search");
    }

    // #TCC.HW.013
    @Given("Klik Button Reset Jabatan")
    public void klik_button_reset_jabatan() {
        jabatanPage.clickResetJabatan();
        extentTest.log(LogStatus.PASS, "Klik Button Reset Jabatan");
    }
}
