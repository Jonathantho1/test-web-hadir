package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import org.openqa.selenium.WebDriver;

public class MainApp {
    private static WebDriver driver;
    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        // String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(Constants.URL);

        //step
        LoginPage loginPage = new LoginPage();
        loginPage.loginform("admin@hadir.com", "admin@hadir");
        System.out.println("login valid");
        //loginPage.logout();
        //loginPage.loginform("Adminn", "admin124");
        //System.out.println("login invalid");



        DriverSingleton.delay(2);
        DriverSingleton.closeObjectInstance();
    }
}