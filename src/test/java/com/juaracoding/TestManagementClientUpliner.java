package com.juaracoding;

import com.juaracoding.pages.ManagementClientUplinerPage;
import com.juaracoding.pages.ManagementUserPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestManagementClientUpliner {

    private static WebDriver driver;
    private static ManagementClientUplinerPage managementClientUplinerPage = new ManagementClientUplinerPage();
    private static ManagementUserPage managementUserPage = new ManagementUserPage();
    private static ExtentTest extentTest;

    public TestManagementClientUpliner(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //TCC.HW.031
    @Given("Klik client upliner")
    public void klik_client_upliner(){
        managementClientUplinerPage.setClientUplinerButton();
        extentTest.log(LogStatus.PASS,"Klik client upliner");
    }

    @When("Klik tambahkan client upliner")
    public void klik_tambahkan_client_upliner(){
        managementClientUplinerPage.setTambahkanButton();
        extentTest.log(LogStatus.PASS,"Klik tambahkan client upliner");
    }

    @When("Input nama karyawan client upliner")
    public void input_nama_karyawan_client_upliner(){
        managementClientUplinerPage.setFullnameInput("John Doe");
        extentTest.log(LogStatus.PASS,"Input nama karyawan client upliner");
    }

    @And("Input unused email client upliner")
    public void input_unused_email_client_upliner(){
        managementClientUplinerPage.setEmailInput("JohnDoe@yahoo.com");
        extentTest.log(LogStatus.PASS,"Input unused email client upliner");
    }

    @And("Input password client upliner")
    public void input_password_client_upliner(){
        managementClientUplinerPage.setPasswordInput("123456789");
        extentTest.log(LogStatus.PASS,"Input password client upliner");
    }

    @And("Klik pilih unit client upliner")
    public void klik_pilih_unit_client_upliner(){
        managementClientUplinerPage.setUnitInput("ABC Compe");
        extentTest.log(LogStatus.PASS,"Klik pilih unit client upliner");
    }

    @And("Klik unit client upliner")
    public void klik_unit_client_upliner(){
        managementClientUplinerPage.setUnitInputButton();
        extentTest.log(LogStatus.PASS,"Klik unit client upliner");
    }

    @And("Klik tipe client upliner")
    public void klik_tipe_client_upliner(){
        managementClientUplinerPage.setTipeUplinerButton();
        extentTest.log(LogStatus.PASS,"Klik tipe client upliner");
    }

    @And("Klik dropdown tipe client upliner")
    public void klik_dropdown_tipe_client_upliner(){
        managementClientUplinerPage.setTipeUpliner();
        extentTest.log(LogStatus.PASS,"Klik dropdown tipe client upliner");
    }

    @And("Klik daftar client upliner")
    public void klik_daftar_client_upliner(){
        managementClientUplinerPage.setDaftarButton();
        extentTest.log(LogStatus.PASS,"Klik daftar client upliner");
    }

    @Then("Data client upliner terbuat")
    public void data_client_upliner_terbuat(){
        Assert.assertEquals(managementClientUplinerPage.getNama(),"John Doe");
        Assert.assertEquals(managementClientUplinerPage.getEmail(),"JohnDoe@yahoo.com");
        Assert.assertEquals(managementClientUplinerPage.getUnit(),"ABC Compe");
        Assert.assertEquals(managementClientUplinerPage.getTanggalDiBuat(),"13 Nov 2023");
        extentTest.log(LogStatus.PASS,"Data client upliner terbuat");
    }

    //TCC.HW.032
    @Then("Mendapatkan alert nama karyawan client upliner")
    public void mendapatkan_alert_nama_karyawan(){
        Assert.assertEquals(managementClientUplinerPage.setAlertFullname(),"true");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert nama karyawan client upliner");
    }

    //TCC.HW.033
    @When("input invalid format email client upliner")
    public void input_invalid_format_email_client_upliner(){
        managementClientUplinerPage.setEmailInput("JohnDoe");
        extentTest.log(LogStatus.PASS,"input invalid format email client upliner");
    }

    @Then("Mendapatkan alert email client upliner")
    public void mendapatkan_alert_email_client_upliner(){
        Assert.assertEquals(managementClientUplinerPage.setAlertEmail(),"true");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert email client upliner");
    }

    //TCC.HW.034
    @Given("input used valid email client upliner")
    public void input_used_valid_email_client_upliner(){
        managementClientUplinerPage.setEmailInput("@yahoo.com");
        extentTest.log(LogStatus.PASS,"input used valid email client upliner");
    }

    @Then("Mendapatkan alert password client upliner")
    public void mendapatkan_alert_password_client_upliner(){
        Assert.assertEquals(managementClientUplinerPage.setAlertPassword(),"true");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert password client upliner");
    }

    //TCC.HW.035
    @Given("Input password less than 8 characters")
    public void input_password_less_than_8_characters(){
        managementClientUplinerPage.setPasswordInput("123");
        extentTest.log(LogStatus.PASS,"Input password less than 8 characters");
    }

    //TCC.HW.036
    @Then("Mendapatkan alert unit client upliner")
    public void mendapatkan_alert_unit_client_upline(){
        Assert.assertEquals(managementClientUplinerPage.setAlertUnitInput(),"true");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert unit client upliner");
    }

    //TCC.HW.037
    @And("Klik dropdown tipe client upliner 2")
    public void klik_dropdown_tipe_client_upliner_2(){
        managementClientUplinerPage.setTipeUpliner2();
        extentTest.log(LogStatus.PASS,"Klik dropdown tipe client upliner 2");
    }
    @Then("Mendapatkan alert Email sudah terdaftar")
    public void mendapatkan_alert_email_sudah_terdaftar(){
        Assert.assertEquals(managementClientUplinerPage.setAlertTerdaftar(),"Email sudah terdaftar");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert Email sudah terdaftar");
    }

    //TCC.HW.038
    @Given("Klik client upliner 2")
    public void klick_client_upliner_2(){
        managementUserPage.setManagementButton();
        managementUserPage.setManagementButton();
        managementClientUplinerPage.setClientUplinerButton2();
        extentTest.log(LogStatus.PASS,"Klik client upliner 2");
    }
    @When("Klik kebab button client upliner")
    public void klik_kebab_button_client_upliner(){
        managementClientUplinerPage.setKebabButton();
        extentTest.log(LogStatus.PASS,"Klik kebab button client upliner");
    }

    @And("Klik edit client upliner")
    public void klik_edit_client_upliner(){
        managementClientUplinerPage.setEditButton();
        extentTest.log(LogStatus.PASS,"Klik edit client upliner");
    }

    @And("Upload foto client upliner")
    public void upload_foto(){
        managementClientUplinerPage.setInputPathImage("C:\\Users\\Jonathan\\Pictures\\Screenshots");
        extentTest.log(LogStatus.PASS,"Upload foto client upliner");
    }

    @And("Delete nama karyawan lama client upliner")
    public void delete_nama_karyawan_lama_client_upliner(){
        managementClientUplinerPage.setDeleteFullnameEdit();
        extentTest.log(LogStatus.PASS,"Delete nama karyawan lama client upliner");
    }

    @And("Input nama karyawan baru client upliner")
    public void input_nama_karyawan_baru_client_upliner(){
        managementClientUplinerPage.setFullnameEdit("John Tyler Doe");
        extentTest.log(LogStatus.PASS,"Input nama karyawan baru client upliner");
    }

    @And("Delete email lama client upliner")
    public void delete_email_lama_client_upliner(){
        managementClientUplinerPage.setDeleteEmailEdit();
        extentTest.log(LogStatus.PASS,"Delete email lama client upliner");
    }

    @And("Input email baru client upliner")
    public void input_email_baru_client_upliner(){
        managementClientUplinerPage.setEmailEdit("JohnDoe@yahoo.co.id");
        extentTest.log(LogStatus.PASS,"Input email baru client upliner");
    }

    @And("Delete unit lama client upliner")
    public void delete_unit_lama_client_upliner(){
        managementClientUplinerPage.setDeletePilihUnitEdit();
        extentTest.log(LogStatus.PASS,"Delete unit lama client upliner");
    }

    @And("Input unit baru client upliner")
    public void input_unit_baru_client_upliner(){
        managementClientUplinerPage.setPilihUnitEdit("AMEX MERCHANT");
        extentTest.log(LogStatus.PASS,"Input unit baru client upliner");
    }

    @And("Klik unit baru client upliner")
    public void klik_unit_baru_client_upliner(){
        managementClientUplinerPage.setUnitEdit();
        extentTest.log(LogStatus.PASS,"Klik unit baru client upliner");
    }

    @And("Klik ubah client upliner")
    public void klik_ubah_client_upliner(){
        managementClientUplinerPage.setButtonUbah();
        extentTest.log(LogStatus.PASS,"Klik ubah client upliner");
    }
    @Then("Data baru berhasil diubah")
    public void data_baru_berhasil_diubah(){
        Assert.assertEquals(managementClientUplinerPage.setNamaEdit(),"John Tyler Doe");
        extentTest.log(LogStatus.PASS,"Data baru berhasil diubah");
    }

    //TCC.HW.039
    @Then("Mendapatkan alert pada nama karyawan client upliner")
    public void mendapatkan_alert_pada_nama_karyawan_client_upliner(){
        Assert.assertEquals(managementClientUplinerPage.setFullnameEditAlert(),"true");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert pada nama karyawan client upliner");
    }

    //TCC.HW.040
    @Then("Mendapatkan alert pada nama email client upliner")
    public void mendapatkan_alert_pada_nama_email_client_upliner(){
        Assert.assertEquals(managementClientUplinerPage.setEmailEditAlert(),"true");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert pada nama email client upliner");
    }

    //TCC.HW.041
    @Given("input email tanpa at")
    public void input_email_tanpa_at(){
        managementClientUplinerPage.setEmailEdit("jonathantho13");
        extentTest.log(LogStatus.PASS,"input email tanpa at");
    }

    //TCC.HW.042
    @Given("Input used email valid format")
    public void input_used_email_valid_format(){
        managementClientUplinerPage.setEmailEdit("@gmail.com");
        extentTest.log(LogStatus.PASS,"Input used email valid format");
    }

    @Then("Mendapatkan alert pada unit client upliner")
    public void mendapatkan_alert_pada_unit_client_upliner(){
        Assert.assertEquals(managementClientUplinerPage.setPilihUnitEditAlert(),"true");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert pada unit client upliner");
    }

    @Then("Mendapatkan alert message client upliner")
    public void mendapatkan_alert_message_client_upliner(){
        Assert.assertEquals(managementClientUplinerPage.setAlertEdit(),"Terjadi kesalahan pada server");
        extentTest.log(LogStatus.PASS,"Mendapatkan alert message client upliner");
    }

    //TCC.HW.44

    @When("Klik client upliner 3")
    public void klik_client_upliner_3(){
        managementClientUplinerPage.setClientUplinerButton2();
        extentTest.log(LogStatus.PASS,"Klik client upliner 3");
    }
    @Then("Mendapatkan data client upliner")
    public void mendapatkan_data_client_upliner(){
        Assert.assertEquals(managementClientUplinerPage.getNamaMenu(),"Alif Client V3");
        Assert.assertEquals(managementClientUplinerPage.getEmailMenu(),"alifclient2@gmail.com");
        Assert.assertEquals(managementClientUplinerPage.getUnitMenu(),"AMEX MERCHANT");
        Assert.assertEquals(managementClientUplinerPage.getTipeUplinerGetMenu(),"Upliner V3");
        Assert.assertEquals(managementClientUplinerPage.getTanggalBuatMenu(),"07 Sep 2023");
        extentTest.log(LogStatus.PASS,"Mendapatkan data client upliner");
    }

    //TCC.HW.045
    @Given("Klik row per page client upliner")
    public void klik_row_per_page_client_upliner(){
        managementClientUplinerPage.setRowPerPageButton();
        extentTest.log(LogStatus.PASS,"Klik row per page client upliner");
    }

    @When("Klik angka row per page client upliner")
    public void klik_angka_row_per_page_client_upliner(){
        managementClientUplinerPage.setRowPerPage();
        extentTest.log(LogStatus.PASS,"Klik angka row per page client upliner");
    }
    @Then("Size page bertambah client upliner")
    public void size_page_bertambah_client_upliner(){
        Assert.assertEquals(managementClientUplinerPage.getOverlay(),"1-25 of 146");
        extentTest.log(LogStatus.PASS,"Size page bertambah client upliner");
    }
}
