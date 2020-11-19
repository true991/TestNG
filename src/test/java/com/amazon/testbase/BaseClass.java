package com.amazon.testbase;

import com.amazon.utils.ConfigReader;
import com.amazon.utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    /**
     * Method initializes the browser from config file
     * Sets an implicit wait for 20 seconds and navigate to specific URL
     */
    @BeforeMethod(alwaysRun = true)
    public static void setUp() {

        ConfigReader.readProperties(Constants.PROPERTIES_FILEPATH);

        switch (ConfigReader.getPropValue("browser").toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Wrong Browser name");
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropValue("url"));
    }

    /**
     * This method shut down a browser
     */
    @AfterMethod(alwaysRun = true)
    public static void tearDown() {
        if(driver!=null) {
            driver.quit();
        }
    }
}
