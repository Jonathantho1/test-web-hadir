package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.MngRegisterUserPage;
import com.juaracoding.pages.MngSelfRegisterPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MngSelfRegTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static MngSelfRegisterPage mngSelfRegisterPage = new MngSelfRegisterPage();

    public MngSelfRegTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("Click menu self register")
    public void click_menu_self_register(){
        mngSelfRegisterPage.clickSelfRegister();
        extentTest.log(LogStatus.PASS, "Klik menu pendaftaran sendiri");
    }

    @And("Input the correct name in the search field")
    public void input_the_correct_name_in_the_search_field() {
        mngSelfRegisterPage.inputSearch("anwar");
    }

    @And("Input the correct nik in the search field")
    public void input_the_correct_nik_in_the_search_field() {
        mngSelfRegisterPage.inputSearch("31777777777772");
    }

    @And("Choose dropdown nik")
    public void choose_dropdown_nik() {
        mngSelfRegisterPage.clickDropdownName();
    }

    @And("Click button search")
    public void click_button_search() {
        mngSelfRegisterPage.clickButtonSearch();
    }

    @Then("Get valid result data name")
    public void get_valid_result_data_name() {
        DriverSingleton.delay(5);
        Assert.assertEquals(mngSelfRegisterPage.getResultName(),"anwar");
    }

    @Then("Get valid result data nik")
    public void get_valid_result_data_nik() {
        DriverSingleton.delay(5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(mngSelfRegisterPage.getResultNik(),"31777777777772");
    }

    @And("Click button reset")
    public void click_button_reset() {
        mngSelfRegisterPage.clickBtnReset();
    }

    @Then("Show all data")
    public void show_all_data() {
        Assert.assertEquals(mngSelfRegisterPage.getResultName2(),"ganjar");
    }

    @And("Click checkbox user")
    public void click_checkbox_user() {
        mngSelfRegisterPage.clickCheckboxUser();
    }

    @And("Click update dichecklist")
    public void click_update_dichecklist() {
        mngSelfRegisterPage.clickUpdateDichecklist();
    }

    @And("Fill in all user data fields")
    public void fill_in_all_user_data_fields() {
        DriverSingleton.delay(5);
        mngSelfRegisterPage.inputDivisi("Bank Jago");
        mngSelfRegisterPage.inputPosisi("Admin");
        mngSelfRegisterPage.inputJabatan("SPV");
        mngSelfRegisterPage.inputKontrak("Mitra");
        mngSelfRegisterPage.inputLokasi("DIKA 2");
        mngSelfRegisterPage.inputJadwal("Admin Juara");
    }

    @And("Click button submit update")
    public void click_button_submit_update() {
        mngSelfRegisterPage.clickBtnSubmit();
    }

    @Then("Update data failed")
    public void update_data_failed() {
        Assert.assertEquals(mngSelfRegisterPage.getTxtInformasi(),"Informasi Kerja");
    }

    @And("Click view data user")
    public void click_view_data_user() {
        mngSelfRegisterPage.clickViewUserData();
    }

    @And("Fill in all user view data fields")
    public void fill_in_all_user_view_data_fields() {
        mngSelfRegisterPage.inputDivisi2("Bank Jago");
        mngSelfRegisterPage.inputUnit("APP Jakarta");
        mngSelfRegisterPage.inputKontrak2("Magang");
        mngSelfRegisterPage.inputPosisi2("Admin");
        mngSelfRegisterPage.inputJabata2n("SPV");
        mngSelfRegisterPage.inputLokasi2("DIKA 1");
        mngSelfRegisterPage.inputJadwal2("Admin c");
    }

    @And("Click button submit view update")
    public void click_button_submit_view_update(){
        mngSelfRegisterPage.clickBtnSubmitDataView();
    }

    @Then("Update data success")
    public void update_data_success() {
        DriverSingleton.delay(3);
        Assert.assertEquals(mngSelfRegisterPage.getTxtPendUser(),"Pendaftaran Sendiri");
    }

    @And("Click delete user button")
    public void click_delete_user_button() {
        mngSelfRegisterPage.clickBtnDelUser();
    }

    @And("Click button ya")
    public void click_button_ya() {
        mngSelfRegisterPage.clickBtnYa();
    }

    @Then("Success delete data")
    public void success_delete_data() {
        DriverSingleton.delay(3);
        Assert.assertEquals(mngSelfRegisterPage.getTxtDataUser(),"Berhasil Delete User");
    }

    @Given("Click row per page")
    public void click_row_per_page(){
        DriverSingleton.delay(3);
        mngSelfRegisterPage.setRowPerPageButton();
        extentTest.log(LogStatus.PASS,"Klik row per page client upliner");
    }

    @When("Choose number row per page")
    public void choose_number_row_per_page(){
        mngSelfRegisterPage.setRowPerPage();
        extentTest.log(LogStatus.PASS,"Klik angka row per page client upliner");
    }
    @Then("Success change size page")
    public void success_change_size_page(){
        DriverSingleton.delay(3);
        Assert.assertEquals(mngSelfRegisterPage.getOverlay(),"Menampilkan 1-5 dari 13 data");
        extentTest.log(LogStatus.PASS,"Size page bertambah client upliner");
    }
}
