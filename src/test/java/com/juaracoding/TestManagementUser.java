package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ManagementUserPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestManagementUser {
    private static WebDriver driver;
    private static ManagementUserPage managementUserPage = new ManagementUserPage();
    private static ExtentTest extentTest;

    public TestManagementUser(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //TCC.HW.001
    @Given("Klik management button")
    public void klik_management_button(){
        managementUserPage.setManagementButton();
    }

    @When("Klik unit button")
    public void klik_unit_button(){
        managementUserPage.setUnitButton();
    }

    @And("Input nama department pada search")
    public void input_nama_department_pada_search(){
        managementUserPage.setSearch("AMEX MERCHANT");
    }

    @And("Klik search")
    public void klik_search(){
        managementUserPage.setSearchButton();
    }

    @And("Menampilkan nama department")
    public void menampilkan_nama_department(){
        Assert.assertEquals(managementUserPage.getNamaDepartment(),"AMEX MERCHANT");
    }

    @And("Menampilkan tanggal rilis")
    public void menampilkan_tanggal_rilis(){
        Assert.assertEquals(managementUserPage.getTanggalBuat(),"11 Jan 2023");
    }


    @Then("Menampilkan tanggal update")
    public void menampilkan_tanggal_update(){
        Assert.assertEquals(managementUserPage.getTanggalUpdate(),"21 Aug 2023");
    }

    //TCC.HW.002
    @Given("Klik reset")
    public void klik_reset(){
        managementUserPage.setReset();
    }

    @Then("Balik ke tampilan default")
    public void balik_ke_tampilan_default(){
        managementUserPage.getDefaultDepartment();
    }

    //TCC.HW.003



    //TCC.HW.004
    @Given("Klik tambahkan")
    public void klik_tambahkan(){
        DriverSingleton.delay(3);
        managementUserPage.setTambahkanButton();
    }

    @When("Input nama department")
    public void input_nama_department(){
        managementUserPage.sendTambahkan("AAA Compe");
    }

    @And("Klik tambah")
    public void klik_tambah(){
        managementUserPage.setTambahButton();
    }

    @Then("Nama department yang diinput muncul")
    public void nama_department_yang_diinput_muncul(){
        Assert.assertEquals(managementUserPage.setTxtNamaDepartment(),"AAA Compe");
    }

    //TCC.HW.005
    @And("Klik batal")
    public void klik_batal(){
        managementUserPage.setBatalButton();
    }

    @Then("Data baru batal dimasukkan")
    public void data_baru_batal_dimasukkan(){
        DriverSingleton.delay(3);

        Assert.assertEquals(managementUserPage.getDataCount(),"1-10 of 72");
    }
}
