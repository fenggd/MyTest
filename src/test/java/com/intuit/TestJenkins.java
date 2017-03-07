package com.intuit;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestJenkins {

    @Test
    public void testJenkins() throws InterruptedException, Exception {
//        System.setProperty("webdriver.firefox.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
        driver.get("https://www.baidu.com/");
        Thread.sleep(10000);
        driver.quit();
        System.out.println("test1");
    }
}