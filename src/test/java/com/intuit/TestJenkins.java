package com.intuit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestJenkins {

    @Test
    public void testJenkins(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com/");
        System.out.println("test1");
    }
}
