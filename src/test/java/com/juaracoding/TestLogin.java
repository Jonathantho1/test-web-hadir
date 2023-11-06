package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();

    private static ExtentTest extentTest;

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //TCC.HRM.001
    @Given("User enter url HADIR")
    public void user_enter_url_hadir(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User enter url HADIR");
    }

    @When("Input password yang terdaftar")
    public void input_password_yang_terdaftar(){
        loginPage.inputUsername("admin@hadir.com");
        extentTest.log(LogStatus.PASS,"Input password yang terdaftar");
    }

    @And("User input valid password")
    public void user_input_valid_password(){
        loginPage.inputPassword("admin@hadir");
        extentTest.log(LogStatus.PASS,"User input valid password");
    }

    @And("Klik tombol Masuk")
    public void klik_tombol_masuk(){
        loginPage.loginBtn();
        extentTest.log(LogStatus.PASS,"Klik tombol Masuk");
    }

    @Then("User dapat masuk ke halaman dashboard")
    public void user_dapat_masuk_ke_halaman_dashboard(){
        Assert.assertEquals(loginPage.getlogoHadir(),"Dashboard");
        extentTest.log(LogStatus.PASS,"User dapat masuk ke halaman dashboard");
    }

}
