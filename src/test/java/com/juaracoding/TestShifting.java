package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ShiftingPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestShifting {

    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static ShiftingPage shiftingPage = new ShiftingPage();

    public TestShifting(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // #TCC.HW.014
    @Given("User click menu Shifting")
    public void user_click_menu_shifting() {
        shiftingPage.clickMenuShifting();
        extentTest.log(LogStatus.PASS, "User click menu Shifting");
    }

    @When("User click button tambahkan Shifting")
    public void user_click_button_tambahkan_shifting() {
        shiftingPage.clickTambahkanShifting();
        extentTest.log(LogStatus.PASS, "User click button tambahkan Shifting");
    }

    @And("Input Nama Jam Kerja")
    public void input_nama_jam_kerja() {
        shiftingPage.inputNameJamKerja("Permata Bank");
        extentTest.log(LogStatus.PASS, "Input Nama Jam Kerja");
    }
    @And("Pilih Unit")
    public void Pilih_unit() {
        shiftingPage.inputUnit();
        extentTest.log(LogStatus.PASS, "Pilih Unit");
    }
    @And("Klik Unit")
    public void klik_unit() {
        shiftingPage.klikUnit();
        extentTest.log(LogStatus.PASS, "Klik Unit");
    }

    @And("Klik Logo Jam Masuk")
    public void klik_logo_jam_masuk() {
        shiftingPage.klikLogoJamMasuk();
        extentTest.log(LogStatus.PASS, "Klik Logo Jam Masuk");
    }
    @And("Pilih Jam Masuk")
    public void pilih_jam_masuk() {
        shiftingPage.pilihJamMasuk();
        extentTest.log(LogStatus.PASS, "Pilih Jam Masuk");
    }
    @And("Klik Jam Masuk")
    public void klik_jam_masuk() {
        shiftingPage.klikJamMasuk();
        extentTest.log(LogStatus.PASS, "Klik Jam Masuk");
    }
    @And("Klik Logo Jam Keluar")
    public void klik_logo_jam_keluar() {
        shiftingPage.klikLogoJamKeluar();
        extentTest.log(LogStatus.PASS, "Klik Logo Jam Keluar");
    }
    @And("Pilih Jam Keluar")
    public void pilih_jam_keluar() {
        shiftingPage.pilihJamKeluar();
        extentTest.log(LogStatus.PASS, "Pilih Jam Keluar");
    }

    @And("Klik Button Tambah Shifting")
    public void klik_button_tambah_jabatan() {
        shiftingPage.clickTambahShifting();
        extentTest.log(LogStatus.PASS, "Klik Button Tambah Jabatan");
    }

    // #TCC.HW.015
    @When("Kosongkan Kolom Nama Jam Kerja")
    public void kosongkan_kolom_nama_kerja() {
        shiftingPage.inputNameJamKerja("");
        extentTest.log(LogStatus.PASS, "Kosongkan Kolom Nama Jam Kerja");
    }

    @And("Klik Button Batal Shifting")
    public void klik_button_batal_shifting() {
        shiftingPage.clickBatalShifting();
        extentTest.log(LogStatus.PASS, "Klik Button Batal Shifting");
    }
    // #TCC.HW.016
    @When("Klik Edit Shifting")
    public void klik_edit_shifting() {
        shiftingPage.clickEditShifting();
        extentTest.log(LogStatus.PASS, "Klik Edit Shifting");
    }
    @And("Input Edit Shifting")
    public void input_edit_shifting() {
        shiftingPage.clearNameJamKerja();
        shiftingPage.inputNameJamKerja("SEA BANK");
        extentTest.log(LogStatus.PASS, "Input Edit Shifting");
    }

    // #TCC.HW.017
    @Given("Input Nama Shifting Pada Kolom Search")
    public void input_nama_shifting_pada_kolom_search() {
        shiftingPage.inputSearchShifting("BCA");
        extentTest.log(LogStatus.PASS, "Input Nama Shifting Pada Kolom Search");
    }
    // #TCC.HW.018
    @Given("Klik Button Reset Shifting")
    public void klik_button_reset_shifting() {
        shiftingPage.clickResetShifting();
        extentTest.log(LogStatus.PASS, "Klik Button Reset Shifting");
    }

}
