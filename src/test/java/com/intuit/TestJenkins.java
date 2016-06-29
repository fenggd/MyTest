package com.intuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestJenkins {

    @Test
    public void testJenkins() throws InterruptedException {
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(dc);
        driver.get("https://www.baidu.com/");
        Thread.sleep(10000);
        driver.quit();
        System.out.println("test1");
    }
}