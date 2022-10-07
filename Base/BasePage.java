package com.demo.nopcommerce.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;
    FileInputStream file;

    public WebDriver initialiseDriver(String browserName){  //we can use method name openBrowser as well
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if (browserName.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else {
            System.out.println("Browser not matched");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        return driver;

    }
    public Properties initialiseProperties() throws IOException {
        Properties prop = new Properties();
        FileInputStream file =new FileInputStream("C:\\Users\\SAGAR\\IdeaProjects\\PageObjectModelHW\\src\\test\\resources\\TestData\\config.properties");
        prop.load(file);

        return prop;

    }
}
