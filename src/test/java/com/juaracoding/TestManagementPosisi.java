package com.juaracoding;

import com.juaracoding.pages.ManagementPosisiPage;
import com.juaracoding.pages.ManagementUserPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestManagementPosisi {

    private static WebDriver driver;
    private static ManagementPosisiPage managementPosisiPage = new ManagementPosisiPage();
    private static ExtentTest extentTest;

    public TestManagementPosisi(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //TCC.HW.020
    @Given("Klik posisi")
    public void klik_posisi(){
        managementPosisiPage.setPosisiButton();
        extentTest.log(LogStatus.PASS,"Klik posisi");
    }

    @When("Input data search")
    public void input_data_search(){
        managementPosisiPage.setInputSearch("ABC HRD");
        extentTest.log(LogStatus.PASS,"Input data search");
    }

    @And("Klik search posisi")
    public void klik_search_posisi(){
        managementPosisiPage.setSearchButton();
        extentTest.log(LogStatus.PASS,"Klik search posisi");
    }

    @Then("Mendapatkan data input")
    public void mendapatkan_data_input(){
        Assert.assertEquals(managementPosisiPage.getNamaDivisi(),"ABC HRD");
        Assert.assertEquals(managementPosisiPage.getTanggalBuat(),"03 Nov 2023");
        Assert.assertEquals(managementPosisiPage.getTanggalUpdate(),"11 Nov 2023");
        extentTest.log(LogStatus.PASS,"Klik search posisi");
    }

    //TCC.HW.021
    @Given("Klik reset posisi")
    public void klik_reset_posisi(){
        managementPosisiPage.setResetButton();
        extentTest.log(LogStatus.PASS,"Klik reset posisi");
    }

    @Then("Balik ke default data")
    public void balik_ke_default_data(){
        Assert.assertEquals(managementPosisiPage.getOverlay(),"1-10 of 142");
        extentTest.log(LogStatus.PASS,"Balik ke default data");
    }

    //TCC.HW.022
    @Given("Klik row per page posisi")
    public void klik_row_per_page_posisi(){
        managementPosisiPage.setRowPerPageButton();
        extentTest.log(LogStatus.PASS,"Klik row per page posisi");
    }

    @When("Klik angka row per page posisi")
    public void klik_angka_row_per_page_posisi(){
        managementPosisiPage.setRowPerPage();
        extentTest.log(LogStatus.PASS,"Klik angka row per page posisi");
    }

    @Then("Size page bertambah posisi")
    public void size_page_bertambah_posisi(){
        Assert.assertEquals(managementPosisiPage.getOverlay(),"1-25 of 142");
        extentTest.log(LogStatus.PASS,"Size page bertambah posisi");
    }

    //TCC.HW.023
    @Given("Klik tambahkan posisi")
    public void klik_tambahkan_posisi(){
        managementPosisiPage.setTambahkanButton();
        extentTest.log(LogStatus.PASS,"Klik tambahkan posisi");
    }

    @When("Input nama posisi")
    public void input_nama_posisi(){
        managementPosisiPage.setNamaPosition("ABC IT Support");
        extentTest.log(LogStatus.PASS,"Input nama posisi");
    }

    @And("Klik nama departement")
    public void klik_nama_department(){
        managementPosisiPage.setListBox();
        extentTest.log(LogStatus.PASS,"Klik nama departement");
    }

    @And("Klik departement yang ingin dipilih")
    public void klik_departement_yang_ingin_dipilih(){
        managementPosisiPage.setListBoxDepartment();
        extentTest.log(LogStatus.PASS,"Klik departement yang ingin dipilih");
    }

    @And("Klik tambah posisi")
    public void klik_tambah_posisi(){
        managementPosisiPage.setTambahButton();
        extentTest.log(LogStatus.PASS,"Klik tambah posisi");
    }

    @Then("Posisi baru bertambah")
    public void posisi_baru_bertambah(){
        Assert.assertEquals(managementPosisiPage.getOverlay(),"1-25 of 143");
        extentTest.log(LogStatus.PASS,"Posisi baru bertambah");
    }

    //TW.HW.025
    @Then("Tetap dalam page tambah position")
    public void tetap_dalam_page_tambah_position(){
        Assert.assertEquals(managementPosisiPage.getTitleTambahkan(),"Tambah Position");
        extentTest.log(LogStatus.PASS,"Tetap dalam page tambah position");
    }

    //TW.HW.026

    @And("Klik departement yang ingin dipilih 2")
    public void klik_departement_yang_ingin_dipilih_2(){
        managementPosisiPage.setListBoxDepartment2();
        extentTest.log(LogStatus.PASS,"Klik departement yang ingin dipilih 2");
    }

    @Then("Mendapatkan alert nama divisi")
    public void mendapatkan_alert_nama_divisi(){
        Assert.assertEquals(managementPosisiPage.setNamaPositionAlert(),"true");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert nama divisi");
    }

    //TW.HW.027
    @Given("Klik batal tambahkan posisi")
    public void klik_batal_tambahkan_posisi(){
        managementPosisiPage.setBatalButton();
        extentTest.log(LogStatus.PASS,"Klik batal tambahkan posisi");
    }

    @Then("Data tidak ada perubahan")
    public void data_tidak_ada_perubahan(){
        Assert.assertEquals(managementPosisiPage.getOverlay(),"1-25 of 144");
        extentTest.log(LogStatus.PASS,"Data tidak ada perubahan");
    }

    @Given("Klik data kebab button")
    public void klik_data_kebab_button(){
       managementPosisiPage.setKebabButton();
       extentTest.log(LogStatus.PASS,"Klik data kebab button");
    }

    @When("Klik edit posisi")
    public void klik_edit_posisi(){
        managementPosisiPage.setEditButton();
        extentTest.log(LogStatus.PASS,"Klik edit posisi");
    }

    @And("Delete nama posisi")
    public void delet_nama_posisi(){
        managementPosisiPage.setDeleteNamaPosisiEdit();
        extentTest.log(LogStatus.PASS,"Delete nama posisi");
    }

    @And("Input nama yang berbeda")
    public void input_nama_yang_berbeda(){
        managementPosisiPage.setNamaPosisiEdit("ABC IT Team");
        extentTest.log(LogStatus.PASS,"Input nama yang berbeda");
    }

    @And("Klik simpan posisi")
    public void klik_simpan_posisi(){
        managementPosisiPage.setSimpanButtonEdit();
        extentTest.log(LogStatus.PASS,"Klik simpan posisi");
    }

    @Then("Nama posisi berubah")
    public void nama_posisi_berubah(){
        Assert.assertEquals(managementPosisiPage.getNamaDivisiBaru(),"ABC IT Team");
        extentTest.log(LogStatus.PASS,"Nama posisi berubah");
    }

    //TCC.HW.029
    @Then("Tetap di dalam tampilan edit posisi")
    public void tetap_di_dalam_tampilan_edit_posisi(){
        Assert.assertEquals(managementPosisiPage.setAlertNamaPosisiEdit(),"true");
        extentTest.log(LogStatus.PASS,"Tetap di dalam tampilan edit posisi");
    }

    //TCC.HW.030
    @Given("Klik batal posisi")
    public void klik_batal_posisi(){
        managementPosisiPage.setBatalButtonEdit();
        extentTest.log(LogStatus.PASS,"Klik batal posisi");
    }

    @Then("Data tidak berubah")
    public void data_tidak_berubah(){
        Assert.assertEquals(managementPosisiPage.getNamaDivisiBaru(),"ABC IT Team");
        extentTest.log(LogStatus.PASS,"Data tidak berubah");
    }
}