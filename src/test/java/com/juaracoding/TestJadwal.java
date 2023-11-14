package com.juaracoding;

import com.juaracoding.pages.JadwalPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ShiftingPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestJadwal {

    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static JadwalPage jadwalPage = new JadwalPage();

    public TestJadwal(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // #TCC.HW.20
    @Given("User click menu Jadwal")
    public void user_click_menu_jadwal() {
        jadwalPage.clickMenuJadwal();
        extentTest.log(LogStatus.PASS, "User click menu Jadwal");
    }

    @When("User click button tambahkan Jadwal")
    public void user_click_button_tambahkan_jadwal() {
        jadwalPage.clickTambahkanJadwal();
        extentTest.log(LogStatus.PASS, "User click button tambahkan Jadwal");
    }

    @And("Pilih Tipe Jadwal")
    public void pilih_tipe_jadwal() {
        jadwalPage.pilihTipeJadwal();
        extentTest.log(LogStatus.PASS, "Pilih Tipe Jadwal");
    }
    @And("Klik Tipe Jadwal")
    public void klik_tipe_jadwal() {
        jadwalPage.klikTipeJadwal();
        extentTest.log(LogStatus.PASS, "Klik Tipe Jadwal");
    }
    @And("Input Nama Jadwal")
    public void input_nama_jadwal() {
        jadwalPage.inputNamaJadwal("Admin Juara QA");
        extentTest.log(LogStatus.PASS, "Input Nama Jadwal");
    }

    @And("Klik Button Hari Kerja")
    public void klik_button_hari_kerja() {
        jadwalPage.klikBtnHariKerja();
        extentTest.log(LogStatus.PASS, "Klik Button Hari Kerja");
    }
    @And("Pilih Hari Senin")
    public void pilih_hari_senin() {
        jadwalPage.pilihHariSenin();
        extentTest.log(LogStatus.PASS, "Pilih Hari Senin");
    }
    @And("Klik Hari Senin")
    public void klik_hari_senin() {
        jadwalPage.klikHariSenin();
        extentTest.log(LogStatus.PASS, "Klik Hari Senin");
    }
    @And("Klik Button Terapkan")
    public void klik_button_terapkan() {
        jadwalPage.klikBtnTerapkan();
        extentTest.log(LogStatus.PASS, "Klik Button Terapkan");
    }
    @And("Input Toleransi")
    public void input_toleransi() {
        jadwalPage.inputToleransi("1");
        extentTest.log(LogStatus.PASS, "Input Toleransi");
    }
    @And("Klik Button Tambah Jadwal")
    public void klik_button_tambah_jadwal() {
        jadwalPage.clickTambahJadwal();
        extentTest.log(LogStatus.PASS, "Klik Button Tambah Jadwal");
    }

    // #TCC.HW.21
    @When("Klik Detail Jadwal")
    public void klik_detail_jadwal() {
        jadwalPage.clickDetailJadwal();
        extentTest.log(LogStatus.PASS, "Klik Detail Jadwal");
    }
    @And("Klik Button Kembali")
    public void klik_button_kembali() {
        jadwalPage.clickBtnKembali();
        extentTest.log(LogStatus.PASS, "Klik Button Kembali");
    }
    // #TCC.HW.22
    @When("Input Edit Nama Jadwal")
    public void input_edit_nama_jadwal() {
        jadwalPage.clearInputNamaJadwal();
        jadwalPage.inputNamaJadwal("Juara Coding RPA");
        extentTest.log(LogStatus.PASS, "Input Edit Nama Jadwal");
    }
    // #TCC.HW.23
    @When("Klik Delete Jadwal")
    public void klik_delete_jadwal() {
        jadwalPage.clickDeleteJadwal();
        extentTest.log(LogStatus.PASS, "Klik Delete Jadwal");
    }
    // #TCC.HW.24
    @Given("Input Nama Jadwal Pada Kolom Search")
    public void input_nama_jadwal_pada_kolom_search() {
        jadwalPage.inputSearchJadwal("BCA");
        extentTest.log(LogStatus.PASS, "Input Nama Jadwal Pada Kolom Search");
    }
    // #TCC.HW.25
    @Given("Klik Button Reset Jadwal")
    public void klik_button_reset_jadwal() {
        jadwalPage.clickResetJadwal();
        extentTest.log(LogStatus.PASS, "Klik Button Reset Jadwal");
    }

}
