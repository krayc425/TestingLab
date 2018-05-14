package com.glen.demo;

import io.appium.java_client.AppiumDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;

public class ContactsTest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        //设置 apk 的路径
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, "ContactManager.apk");
        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        //设置安卓系统版本 capabilities.setCapability("platformVersion", "4.3"); //设置 apk 路径
        capabilities.setCapability("app", app.getAbsolutePath());
        //设置 app 的主包名和主类名
        capabilities.setCapability("appPackage", "com.example.android.contactmanager");
        capabilities.setCapability("appActivity", ".ContactManager");
        //初始化
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void addContact() {
        WebElement el = driver.findElementByAccessibilityId("Add Contact");
        el.click();
        List<WebElement> textFieldsList =
                driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByAccessibilityId("Save").click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}