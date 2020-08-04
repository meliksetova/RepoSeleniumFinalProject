package Drivers;

import Utils.ScreenShotHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    private static WebDriver driver;

    public static void initDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static void closeDriver() {
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void maximize(){ driver.manage().window().maximize();}

    @After
    public static void quitDriver(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenShotHelper.takeWebScreenShot(scenario.getName());
        }
        driver.quit();
    }



}
