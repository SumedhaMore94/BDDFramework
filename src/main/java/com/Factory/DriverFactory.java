package com.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public WebDriver driver;

    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    /**
     * This method used to initialize the ThreadLocal driver on the basis of given browser value
     *
     * @param browser
     * @return
     */

    public WebDriver initDriver(String browser) {
        System.out.println("Browser value is : " + browser);
        if (browser.equals("chrome")) {
            threadDriver.set(driver = new ChromeDriver());
        } else if (browser.equals("firefox")) {
            threadDriver.set(driver = new FirefoxDriver());
        } else if (browser.equals("safari")) {
            threadDriver.set(driver = new SafariDriver());
        } else {
            System.out.println("Please pass the Browser value : " + browser);
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();

    }

    /**
     * This is used to get the driver with ThreadLocal
     * @return
     */
    public static synchronized WebDriver getDriver() {
        return threadDriver.get();
    }
}
