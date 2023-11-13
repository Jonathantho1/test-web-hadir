package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Constant;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLInputElement;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","F:\\JuaraCoding\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://staging-hadir.ptkta.com/authentication/login");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@hadir.com"); //step
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin@hadir"); //step
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-1ub5lza'][normalize-space()='Laporan']")).click();
//        driver.findElement(By.xpath("//p[normalize-space()='Kehadiran']")).click();
//        driver.findElement(By.xpath("//p[normalize-space()='Izin Pulang Cepat']")).click();
//        driver.findElement(By.xpath("//p[normalize-space()='Cuti']")).click();
        driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Izin Terlambat']")).click();

//        driver.findElement(By.xpath("//*[@id=\"mui-4\"]")).click();
//        DriverSingleton.delay(3);
//        driver.findElement(By.xpath("//*[@id=\"mui-3\"]/li[3]")).click();
//        DriverSingleton.delay(2);
//
//        String page =driver.findElement(By.xpath("//*[@id=\"mui-4\"]")).getText();
//        System.out.println(page);


//        Izin Pulang Cepat
//        js.executeScript("window.scrollBy(0,5000)");

        driver.findElement(By.xpath("//div[@id='__next']/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div")).click();
        DriverSingleton.delay(3);
        driver.findElement(By.xpath("//ul[@id='mui-2']/li[3]")).click();
        DriverSingleton.delay(2);

        String page =driver.findElement(By.xpath("//div[@id='__next']/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div")).getText();
        System.out.println(page);

        //*[@id="mui-13"]
        //*[@id="mui-12"]/li[3]

//        Izin terlambat
        //*[@id="mui-17"]
        //*[@id="mui-16"]/li[3]

//        Cuti
        //*[@id="mui-21"]
        //*[@id="mui-20"]/li[3]








    }
}