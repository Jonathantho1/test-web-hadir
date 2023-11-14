package com.juaracoding;

import com.juaracoding.pages.AbsenPointPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;

public class TestAbsenPoint {

    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static AbsenPointPage absenPointPage = new AbsenPointPage();

    public TestAbsenPoint(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // #TCC.HW.001
    @Given("User click menu Management")
    public void user_click_menu_management(){
        absenPointPage.clickMenuManagement();
        extentTest.log(LogStatus.PASS,"User click menu Management");
    }
    @When("User click menu Absent Point")
    public void user_click_menu_absent_point() {
        absenPointPage.clickMenuAbsen();
        extentTest.log(LogStatus.PASS, "User click menu Absent Point");
    }
    @And("User click button tambahkan")
    public void user_click_button_tambahkan() {
        absenPointPage.clickTambahkan();
        extentTest.log(LogStatus.PASS, "User click button tambahkan");
    }
    @And("Input Nama")
    public void input_nama() {
        absenPointPage.inputName("PERMATA TEST");
        extentTest.log(LogStatus.PASS, "Input Nama");
    }
    @And("Klik Maps")
    public void klik_maps() {
        absenPointPage.clickMaps();
        extentTest.log(LogStatus.PASS, "Klik Maps");
    }
    @And("Input Deskripsi")
    public void input_deskripsi() {
        absenPointPage.inputDeskripsi("JL. KEBANGSAAN NO 12");
        extentTest.log(LogStatus.PASS, "Input Deskripsi");
    }
    @And("Klik Button Tambah")
    public void klik_button_tambah() {
        absenPointPage.clickTambah();
        extentTest.log(LogStatus.PASS, "Klik Button Tambah");
    }
    @And("Klik Button Batal")
    public void klik_button_batal() {
        absenPointPage.clickBatal();
        extentTest.log(LogStatus.PASS, "Klik Button Batal");
    }

    // #TCC.HW.002
    @And("Kosongkan Kolom Input Deskripsi")
    public void kosongkan_kolom_input_deskripsi() {
        absenPointPage.inputDeskripsi("");
        extentTest.log(LogStatus.PASS, "Input Deskripsi");
    }

    // #TCC.HW.003
    @And("Kosongkan Kolom Input Nama")
    public void kosongkan_kolom_input_nama() {
        absenPointPage.inputName("");
        extentTest.log(LogStatus.PASS, "Input Nama");
    }

    // #TCC.HW.004
    @Given("Klik Titik Tiga")
    public void klik_titik_tiga(){
        absenPointPage.clickTitikTiga();
        extentTest.log(LogStatus.PASS,"Klik Titik Tiga");
    }
    @When("Klik Edit")
    public void klik_edit() {
        absenPointPage.clickEdit();
        extentTest.log(LogStatus.PASS, "Klik Edit");
    }
    @And("Input Edit Nama")
    public void input_edit_nama() {
        absenPointPage.clearName();
        absenPointPage.inputName("Bank Central Europa");
        extentTest.log(LogStatus.PASS, "Input Edit Nama");
    }
    @And("Input Edit Deskripsi")
    public void input_edit_deskripsi() {
        absenPointPage.clearDeskripsi();
        absenPointPage.inputDeskripsi("Jalan Jakarta No 110 Kota Jakarta");
        extentTest.log(LogStatus.PASS, "Input Edit Deskripsi");
    }
    @And("Klik Button Simpan")
    public void klik_button_simpan() {
        absenPointPage.clickSimpan();
        extentTest.log(LogStatus.PASS, "Klik Button Simpan");
    }


    // #TCC.HW.005
    @When("Klik Delete")
    public void klik_delete(){
        absenPointPage.clickDelete();
        extentTest.log(LogStatus.PASS,"Klik Delete");
    }
    @And("Klik Button Ya")
    public void klik_button_ya() {
        absenPointPage.clickYa();
        extentTest.log(LogStatus.PASS, "Klik Button Ya");
    }
    @And("Klik Button Tidak")
    public void klik_button_tidak() {
        absenPointPage.clickTidak();
        extentTest.log(LogStatus.PASS, "Klik Button Tidak");
    }
    @And("Klik Titik Tiga Tutup")
    public void klik_titik_tiga_tutup() {
        absenPointPage.clickTitikTigaTutup();
        extentTest.log(LogStatus.PASS, "Klik Titik Tiga Tutup");
    }

    // #TCC.HW.006
    @Given("Input Nama Data Pada Kolom Search")
    public void input_nama_data_pada_kolom_search(){
        absenPointPage.inputSearch("Permata");
        extentTest.log(LogStatus.PASS,"Input Nama Data Pada Kolom Search");
    }
    @When("Klik Button Search")
    public void klik_button_search() {
        absenPointPage.clickSearch();
        extentTest.log(LogStatus.PASS, "Klik Button Search");
    }

    // #TCC.HW.007
    @Given("Klik Button Reset")
    public void klik_button_reset(){
        absenPointPage.clickReset();
        extentTest.log(LogStatus.PASS, "Klik Button Reset");
    }

}

