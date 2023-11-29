package com.juaracoding;

import com.juaracoding.pages.ManagementUnitPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestManagementUnit {
    private static WebDriver driver;
    private static ManagementUnitPage managementUnitPage = new ManagementUnitPage();
    private static ExtentTest extentTest;

    public TestManagementUnit(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //TCC.HW.001
    @Given("Klik management button")
    public void klik_management_button(){
        managementUnitPage.setManagementButton();
        extentTest.log(LogStatus.PASS,"Klik management button");
    }

    @When("Klik unit button")
    public void klik_unit_button(){
        managementUnitPage.setUnitButton();
        extentTest.log(LogStatus.PASS,"Klik unit button");
    }

    @And("Input nama department pada search")
    public void input_nama_department_pada_search(){
        managementUnitPage.setSearch("AMEX MERCHANT");
        extentTest.log(LogStatus.PASS,"Input nama department pada search");
    }

    @And("Klik search")
    public void klik_search(){
        managementUnitPage.setSearchButton();
        extentTest.log(LogStatus.PASS,"Klik search");
    }

    @And("Menampilkan nama department")
    public void menampilkan_nama_department(){
        Assert.assertEquals(managementUnitPage.getNamaDepartment(),"AMEX MERCHANT");
        extentTest.log(LogStatus.PASS,"Menampilkan nama department");
    }

    @And("Menampilkan tanggal rilis")
    public void menampilkan_tanggal_rilis(){
        Assert.assertEquals(managementUnitPage.getTanggalBuat(),"11 Jan 2023");
        extentTest.log(LogStatus.PASS,"Menampilkan tanggal rilis");
    }


    @Then("Menampilkan tanggal update")
    public void menampilkan_tanggal_update(){
        Assert.assertEquals(managementUnitPage.getTanggalUpdate(),"21 Aug 2023");
        extentTest.log(LogStatus.PASS,"Menampilkan tanggal update");
    }

    //TCC.HW.002
    @Given("Klik reset")
    public void klik_reset(){
        managementUnitPage.setReset();
        extentTest.log(LogStatus.PASS,"Klik reset");
    }

    @Then("Balik ke tampilan default")
    public void balik_ke_tampilan_default(){
        Assert.assertEquals(managementUnitPage.getDefaultDepartment(),"ABC Compe");
        extentTest.log(LogStatus.PASS,"Balik ke tampilan default");
    }

    //TCC.HW.003
    @Given("Klik row per page")
    public void klik_row_per_page(){
        managementUnitPage.setRowPerPage();
        extentTest.log(LogStatus.PASS,"Klik row per page");
    }

    @When("Klik angka row per page")
    public void klik_angka_row_per_page(){
        managementUnitPage.setNumRowPerPage();
        extentTest.log(LogStatus.PASS,"Klik angka row per page");
    }

    @Then("Size page bertambah")
    public void size_page_bertambah(){
        Assert.assertEquals(managementUnitPage.getDataCount(),"1-25 of 71");
        extentTest.log(LogStatus.PASS,"Size page bertambah");
    }

    //TCC.HW.004
    @Given("Klik tambahkan")
    public void klik_tambahkan(){
        managementUnitPage.setTambahkanButton();
        extentTest.log(LogStatus.PASS,"Klik tambahkan");
    }

    @When("Input nama department")
    public void input_nama_department(){
        managementUnitPage.sendTambahkan("AAA Compe");
        extentTest.log(LogStatus.PASS,"Input nama department");
    }

    @And("Klik tambah")
    public void klik_tambah(){
        managementUnitPage.setTambahButton();
        extentTest.log(LogStatus.PASS,"Klik tambah");
    }

    @Then("Nama department yang diinput muncul")
    public void nama_department_yang_diinput_muncul(){
        Assert.assertEquals(managementUnitPage.setTxtNamaDepartment(),"AAA Compe");
        extentTest.log(LogStatus.PASS,"Nama department yang diinput muncul");
    }

    //TCC.HW.005
    @And("Klik batal")
    public void klik_batal(){
        managementUnitPage.setBatalButton();
        extentTest.log(LogStatus.PASS,"Klik batal");
    }

    @Then("Data baru batal dimasukkan")
    public void data_baru_batal_dimasukkan(){
        Assert.assertEquals(managementUnitPage.getDataCount(),"1-25 of 72");
        extentTest.log(LogStatus.PASS,"Data baru batal dimasukkan");
    }
    //TCC.HW.006
    @Then("Mendapatkan alert")
    public void mendapatkan_alert(){
        Assert.assertEquals(managementUnitPage.getTambahkanInput(),"true");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert");
    }

    //TCC.HW.007
    @Given("Input nama department yang sudah ada dalam database")
    public void input_nama_department_yang_sudah_ada_dalam_database(){
        managementUnitPage.sendTambahkan("AAA Compe");
        extentTest.log(LogStatus.PASS,"Input nama department yang sudah ada dalam database");
    }
    @Then("Tetap dalam tampilan Tambah Departements")
    public void tetap_dalam_tampilan_tambah_departements(){
        Assert.assertEquals(managementUnitPage.getTitle(), "Tambah Departements");
        extentTest.log(LogStatus.PASS,"Tetap dalam tampilan Tambah Departements");
    }

    //TCC.HW.008
    @Given("Klik kebab menu pada data yang ingin di edit")
    public void klik_kebab_menu_pada_data_yang_ingin_di_edit(){
        managementUnitPage.setKebabButton();
        extentTest.log(LogStatus.PASS,"Klik kebab menu pada data yang ingin di edit");
    }
    @When("Klik edit")
    public void klik_edit(){
        managementUnitPage.setEditButton();
        extentTest.log(LogStatus.PASS,"Klik edit");
    }

    @And("Input edit nama department")
    public void input_edit_nama_department(){
        managementUnitPage.inputEdit("ABB Compe");
        extentTest.log(LogStatus.PASS,"Input edit nama department");
    }

    @And("Klik simpan")
    public void klik_simpan(){
        managementUnitPage.setSimpanButton();
        extentTest.log(LogStatus.PASS,"Klik simpan");
    }

    @Then("Nama department berhasil di update")
    public void nama_department_berhasil_di_update(){
        Assert.assertEquals(managementUnitPage.getEditData(),"ABB Compe");
        extentTest.log(LogStatus.PASS,"Nama department berhasil di update");
    }

    //TCC.HW.009
    @And("Klik batal pada edit")
    public void klik_batal_pada_edit(){
        managementUnitPage.setBatalEditButton();
        extentTest.log(LogStatus.PASS,"Klik batal pada edit");
    }

    @Then("Nama department tidak di update")
    public void nama_department_tidak_di_update(){
        Assert.assertEquals(managementUnitPage.getEditData(),"ABB Compe");
        extentTest.log(LogStatus.PASS,"Nama department tidak di update");
    }

    //TCC.HW.010
    @And("Hapus inputan")
    public void hapus_inputan(){
        managementUnitPage.inputEdit("");
        extentTest.log(LogStatus.PASS,"Hapus inputan");
    }
}
