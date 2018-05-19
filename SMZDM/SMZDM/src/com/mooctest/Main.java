package com.mooctest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AndroidKeyCode;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;


public class Main {

    /**
     * 所有和AppiumDriver相关的操作都必须写在该函数中
     *
     * @param driver
     */
    public void test(AppiumDriver driver) {
        sleep(6);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //设置尝试定位控件的最长时间为8s,也就是最多尝试8s
        /*
         * 余下的测试逻辑请按照题目要求进行编写
         */

        // 1.
        swipeLeft(driver);
        swipeLeft(driver);
        swipeLeft(driver);
        driver.findElementById("com.smzdm.client.android:id/iv_start").click();

        // 2.
        driver.findElementByXPath("//android.widget.TextView[@text='白菜专区']").click();
        driver.findElementById("com.smzdm.client.android:id/tv_all_care").click();

        // 3.
        driver.findElementById("com.smzdm.client.android:id/action_share").click();
        driver.findElementById("com.smzdm.client.android:id/share_sina_ll").click();
        sleep(5);
        goBack(driver);
        driver.findElementById("com.smzdm.client.android:id/action_share").click();
        driver.findElementById("com.smzdm.client.android:id/share_wx_circle_ll").click();
        driver.findElementById("com.smzdm.client.android:id/action_share").click();
        driver.findElementById("com.smzdm.client.android:id/share_wx_ll").click();
        driver.findElementById("com.smzdm.client.android:id/action_share").click();
        driver.findElementById("com.smzdm.client.android:id/qq_shar_ll").click();
        sleep(2);
        goBack(driver);
        driver.findElementById("com.smzdm.client.android:id/action_share").click();
        driver.findElementById("com.smzdm.client.android:id/qqzone_shar_ll").click();
        sleep(2);
        goBack(driver);
        driver.findElementById("com.smzdm.client.android:id/action_share").click();
        driver.findElementById("com.smzdm.client.android:id/share_copy_ll").click();
        sleep(10);
        driver.findElementById("com.smzdm.client.android:id/action_share").click();
        driver.findElementById("com.smzdm.client.android:id/shar_cancel").click();

        driver.findElementById("com.smzdm.client.android:id/btn_follow").click();
        goBack(driver);

        driver.findElementById("com.smzdm.client.android:id/iv_arrow_more").click();
        driver.findElementByXPath("//android.widget.TextView[@text='好价']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='全部']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='好文']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='原创']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='轻晒单']").click();
        driver.findElementByXPath("//android.widget.ToggleButton[@text='最新']").click();
        sleep(1);
        goBack(driver);
        sleep(1);
        goBack(driver);

        // 4.
        driver.findElementById("com.smzdm.client.android:id/action_search").click();
        driver.findElementById("com.smzdm.client.android:id/iv_search_up").click();
        driver.findElementById("com.smzdm.client.android:id/action_search").click();
        WebElement search = driver.findElementById("com.smzdm.client.android:id/edit_text_search");
        search.click();
        search.sendKeys("笔记本");
        driver.findElementById("com.smzdm.client.android:id/iv_search").click();
        sleep(5);

        // 5.
        driver.findElementById("com.smzdm.client.android:id/iv_subscribe").click();
        driver.findElementById("com.smzdm.client.android:id/iv_close").click();
        driver.findElementByXPath("//android.widget.TextView[@text='综合']").click();
        driver.findElementByXPath("//android.widget.RadioButton[@text='综合排序']").click();
        driver.findElementByXPath("//android.widget.RadioButton[@text='最新排序']").click();
        sleep(1);
        driver.findElementByXPath("//android.widget.TextView[@text='筛选']").click();
        driver.findElementById("com.smzdm.client.android:id/iv_collapse").click();
        driver.findElementById("com.smzdm.client.android:id/ll_filter").click();
        driver.findElementByXPath("//android.widget.CheckedTextView[@text='电脑数码']").click();
        driver.findElementById("com.smzdm.client.android:id/tv_confirm").click();
        sleep(1);
        driver.findElementByXPath("//android.widget.TextView[@text='好价']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='好文']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='好物']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='用户']").click();
    }

    public void swipeLeft(AppiumDriver driver) {
        driver.context("NATIVE_APP");
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.8);
        int endx = (int) (size.width * 0.2);
        int starty = size.height / 3;
        driver.swipe(startx, starty, endx, starty, 1000);
    }

    public void swipeRight(AppiumDriver driver) {
        driver.context("NATIVE_APP");
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.2);
        int endx = (int) (size.width * 0.8);
        int starty = size.height / 3;
        driver.swipe(startx, starty, endx, starty, 1000);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void goBack(AppiumDriver driver) {
        driver.sendKeyEvent(AndroidKeyCode.BACK);
    }

    /**
     * AppiumDriver的初始化逻辑必须写在该函数中
     *
     * @return
     */
    public AppiumDriver initAppiumTest() {
        AppiumDriver driver = null;
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apk");
        File app = new File(appDir, "Smzdm.apk");

        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");

        //设置安卓系统版本
        capabilities.setCapability("platformVersion", "5.1");
        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath());

        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.smzdm.client.android");
        capabilities.setCapability("appActivity", "com.smzdm.client.android.activity.WelComeActivity");
        //设置使用unicode键盘，支持输入中文和特殊字符
        capabilities.setCapability("unicodeKeyboard", "true");
        //设置用例执行完成后重置键盘
        capabilities.setCapability("resetKeyboard", "true");

        //初始化
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return driver;
    }

    public void start() {
        test(initAppiumTest());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }


}