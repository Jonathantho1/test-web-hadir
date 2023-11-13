package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ManagementUserPage;
import com.juaracoding.pages.ManagementUserSettingPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestManagementUserSetting {

    private static WebDriver driver;
    private static ManagementUserSettingPage managementUserSettingPage = new ManagementUserSettingPage();
    private static ManagementUserPage managementUserPage = new ManagementUserPage();
    private static ExtentTest extentTest;

    public TestManagementUserSetting(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //TCC.HW.011
    @Given("Klik batal pada edit unit")
    public void klik_batal_pada_edit_unit(){
        managementUserPage.setBatalEditButton();
        extentTest.log(LogStatus.PASS,"Klik batal pada edit unit");
    }

    @And("Klik unit setting")
    public void klik_unit_setting(){
        managementUserSettingPage.setUnitSettingButton();
        extentTest.log(LogStatus.PASS,"Klik unit setting");
    }

    @And("Klik tambahkan unit setting")
    public void klik_tambahkan_unit_setting(){
        managementUserSettingPage.setTambahkanButton();
        extentTest.log(LogStatus.PASS,"Klik tambahkan unit setting");
    }

    @And("Klik nama department")
    public void klik_nama_department(){
        managementUserSettingPage.setListBox();
        extentTest.log(LogStatus.PASS,"Klik nama department");
    }

    @And("Klik department yang ingin dipilih")
    public void klik_department_yang_ingin_dipilih(){
        managementUserSettingPage.setDepartment();
        extentTest.log(LogStatus.PASS,"Klik department yang ingin dipilih");
    }

    @And("Klik tambah unit setting")
    public void klik_tambah_unit_setting(){
        managementUserSettingPage.setTambahButton();
        extentTest.log(LogStatus.PASS,"Klik tambah unit setting");
    }

    @Then("Data berhasil ditambahkan ke unit setting")
    public void data_berhasil_ditambahkan_unit_setting(){
        Assert.assertEquals(managementUserSettingPage.getNamaDepartment(),"ABC Compe");
        Assert.assertEquals(managementUserSettingPage.getTanggalBuat(),"13 Nov 2023");
        Assert.assertEquals(managementUserSettingPage.getTanggalUpdate(),"13 Nov 2023");
        extentTest.log(LogStatus.PASS,"Data berhasil ditambahkan ke unit setting");
    }

    //TCC.HW.012 / //TCC.HW.013
    @Then("Mendapatkan message")
    public void mendapatkan_message(){
        Assert.assertEquals(managementUserSettingPage.getAlert(),"Gagal Menambahkan Departemens");
        extentTest.log(LogStatus.PASS,"Mendapatkan message");
    }

    //TCC.HW.014
    @Given("Klik batal pada unit setting")
    public void klik_batal_pada_unit_setting(){
        managementUserSettingPage.setBatalButton();
        extentTest.log(LogStatus.PASS,"Klik batal pada unit setting");
    }

    @Then("Tidak ada penambahan data pada unit setting")
    public void tidak_ada_penambahan_data_pada_unit_setting(){
        Assert.assertEquals(managementUserSettingPage.getOverlay(),"1-8 of 8");
        extentTest.log(LogStatus.PASS,"Tidak ada penambahan data pada unit setting");
    }

    //TCC.HW.015 / TCC.HW.016
    @Given("Klik button selfie")
    public void klik_button_selfie(){
        managementUserSettingPage.setSelfieButton();
        extentTest.log(LogStatus.PASS,"Klik button selfie");
    }

    @When("Keluar pop up message")
    public void keluar_pop_up_message(){
        DriverSingleton.delay(5);
        Assert.assertEquals(driver.switchTo().alert().getText(),"Sukses");
        extentTest.log(LogStatus.PASS,"Keluar pop up message");
    }

    @Then("Klik ok")
    public void klik_ok(){
        DriverSingleton.delay(5);
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS,"Klik ok");
    }

    //TCC.HW.017
    @Given("Klik delete")
    public void klik_delete(){
        managementUserSettingPage.setDeleteButton();
        extentTest.log(LogStatus.PASS,"Klik delete");
    }

    @When("Klik tidak")
    public void klik_tidak(){
        managementUserSettingPage.setTidakButton();
        extentTest.log(LogStatus.PASS,"Klik tidak");
    }

    @Then("Data masih ada pada unit setting")
    public void data_masih_ada_pada_unit_setting(){
        DriverSingleton.delay(5);
        Assert.assertEquals(managementUserSettingPage.getOverlay(),"1-8 of 8");
        extentTest.log(LogStatus.PASS,"Data masih ada pada unit setting");
    }

    //TCC.HW.018
    @When("Klik ya")
    public void klik_ya(){
        managementUserSettingPage.setYaButton();
        extentTest.log(LogStatus.PASS,"Klik ya");
    }

    @Then("Data terhapus")
    public void data_terhapus(){
        Assert.assertEquals(managementUserSettingPage.getOverlay(),"1-7 of 7");
        extentTest.log(LogStatus.PASS,"Data terhapus");
    }

    //TCC.HW.019
    @Given("Klik row per page unit setting")
    public void klik_row_per_page_unit_setting(){
        managementUserSettingPage.setRowPerPageButton();
        extentTest.log(LogStatus.PASS,"Klik row per page unit setting");
    }

    @When("Klik angka row per page unit setting")
    public void klik_angka_row_per_page_unit_setting(){
        managementUserSettingPage.setRowPerPage();
        extentTest.log(LogStatus.PASS,"Klik angka row per page unit setting");
    }

    @Then("Size page berkurang")
    public void size_page_berkurang(){
        Assert.assertEquals(managementUserSettingPage.getOverlay(),"1-5 of 7");
        extentTest.log(LogStatus.PASS,"Size page berkurang");
    }
}
