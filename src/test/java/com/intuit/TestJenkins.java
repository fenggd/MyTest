package com.intuit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestJenkins {

    @Test
    public void testJenkins() throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com/");
        Thread.sleep(10000);
        System.out.println("test1");
    }
}