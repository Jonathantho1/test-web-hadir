package com.juaracoding.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webDriver.gecko.driver","F:\\JuaraCoding\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
