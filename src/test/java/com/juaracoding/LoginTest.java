package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constans;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();

    public LoginTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter URL HW valid login page")
    public void user_enter_url_hw_login_page(){
        driver.get(Constans.URL);
        extentTest.log(LogStatus.PASS, "Input URL Hadir Web yang benar");
    }

    @When("User click button enter")
    public void user_click_button_enter(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.RETURN).perform();
        extentTest.log(LogStatus.PASS, "Klik tombol enter pada keyboard");
    }

    @Then("User on the login page")
    public void user_on_the_login_page() {
        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(loginPage.getLoginText(), "Login");
        extentTest.log(LogStatus.PASS, "Menampilkan halaman login");
    }

    @Given("User enter URL HW invalid login page")
    public void user_enter_url_hw_invalid_login_page(){
        driver.get("https://staging-hadir.ptkta.com/authentication");
        extentTest.log(LogStatus.PASS, "Input URL Hadir Web yang salah");
    }

    @Then("User failed to enter the login page")
    public void user_failed_to_enter_the_login_page() {
        Assert.assertEquals(loginPage.getTxt404(), "404\n" +
                "This page could not be found.");
        extentTest.log(LogStatus.PASS, "Gagal menampilkan halaman login");
    }

    @When("User input valid email")
    public void user_input_valid_email() {
        loginPage.inputEmail("admin@hadir.com");
        extentTest.log(LogStatus.PASS, "Memasukkan email valid");
    }

    @And("User input valid password")
    public void user_input_valid_password() {
        loginPage.inputPassword("admin@hadir");
        extentTest.log(LogStatus.PASS, "Memasukkan password valid");
    }

    @And("User click button Login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Klik tombol masuk");
    }

    @Then("User Login success")
    public void user_login_success() {
        Assert.assertEquals(loginPage.getDashboardText(), "Dashboard");
        extentTest.log(LogStatus.PASS, "Berhasil masuk ke halaman dashboard");
    }

    @When("User input invalid email")
    public void user_input_invalid_email() {
        loginPage.inputEmail("admn@hair.com");
        extentTest.log(LogStatus.PASS, "Memasukkan email invalid");
    }

    @And("User input invalid password")
    public void user_input_invalid_password() {
        loginPage.inputPassword("admin@hadir");
        extentTest.log(LogStatus.PASS, "Memasukkan password invalid");
    }

    @Then("Get alert user not found")
    public void get_alert_user_not_found() {
        DriverSingleton.delay(3);
        Assert.assertEquals(loginPage.getTxtUserNotFound(), "Akun tidak ditemukan");
        extentTest.log(LogStatus.PASS, "Mendapatkan alert Akun tidak ditemukan");
    }

    @Then("Get alert wrong email or password")
    public void get_alert_wrong_email_or_password() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(loginPage.getTxtWrongEmail(), "");
        extentTest.log(LogStatus.PASS, "Mendapatkan alert Email atau password salah");
    }

    @When("User on the dashboard page")
    public void user_on_the_dashboard_page() {
        driver.get(Constans.URL);
        loginPage.inputEmail("admin@hadir.com");
        loginPage.inputPassword("admin@hadir");
        loginPage.clickBtnLogin();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DriverSingleton.delay(5);
        Assert.assertEquals(loginPage.getDashboardText(), "Dashboard");
        extentTest.log(LogStatus.PASS, "Berada di halaman dashboard");
    }

    @When("User click menu user profile")
    public void user_click_menu_user_profile() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.clickMenuUserProfile();
    }

    @And("User click button Logout")
    public void user_click_button_logout() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);DriverSingleton.delay(3);
        loginPage.clickBtnLogout();
    }
}
