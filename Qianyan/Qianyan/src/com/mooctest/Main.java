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
     * "appPackage", "com.zhy.qianyan"
     * "app-launchActivity", "com.zhy.qianyan.MainActivity"
     *  本示例脚本仅作为参考，具体请根据自己的测试机型可能出现的特殊情况进行脚本的编写调整
     */

    /**
     * 所有和AppiumDriver相关的操作都必须写在该函数中
     *
     * @param driver
     */
    public void test(AppiumDriver driver) {
        try {
            Thread.sleep(6000);        //等待6s，待应用完全启动
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); //设置尝试定位控件的最长时间为8s,也就是最多尝试8s

        /*
         * 余下的测试逻辑请按照题目要求进行编写
         */

        // 左滑
        driver.context("NATIVE_APP");
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.8);
        int endx = (int) (size.width * 0.20);
        int starty = size.height / 2;
        driver.swipe(startx, starty, endx, starty, 1000);
        driver.swipe(startx, starty, endx, starty, 1000);
        driver.swipe(startx, starty, endx, starty, 1000);

        // 进入
        driver.findElementByXPath("//android.view.View[@index='2']").click();
        driver.findElementById("android:id/button2").click();

        // 登录
        driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='注册/登录']").click();
        WebElement phoneText = driver.findElementByXPath("//android.widget.EditText[@text='请输入手机号码']");
        phoneText.click();
        phoneText.sendKeys("18795963603");
        WebElement pwText = driver.findElementByXPath("//android.widget.EditText[@index='6']");
        pwText.click();
        pwText.sendKeys("111111");
        driver.hideKeyboard();
        driver.findElementByXPath("//android.view.View[@index='9']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='登录']").click();

        // 抽屉栏测试
        driver.findElementByXPath("//android.widget.TextView[@text='我的垃圾箱']").click();
        driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='系统通知']").click();
        driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='关于我们']").click();
        driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='我的主页']").click();
        driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();

        driver.findElementByXPath("//android.widget.TextView[@text='推荐给好友']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='微信']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='推荐给好友']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='朋友圈']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='推荐给好友']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='QQ']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='推荐给好友']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='QQ空间']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='推荐给好友']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='取消']").click();

        driver.findElementByXPath("//android.widget.TextView[@text='反馈问题']").click();

        WebElement feedBackText = driver.findElementByXPath("//android.widget.EditText[@text='我们用情在做一款产品，我们用心倾听您的建议，我们不断改善，只为更长久的与您同行！']");;
        feedBackText.click();
        feedBackText.sendKeys("Test");
        driver.findElementByXPath("//android.widget.TextView[@text='提交']").click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // 我的关注
        driver.findElementByXPath("//android.widget.TextView[@text='我的关注']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='用户']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='话题']").click();
        driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();
        driver.findElementByXPath("//android.widget.ImageView[@index='0']").click();

        // 足印
        driver.findElementByXPath("//android.widget.TextView[@text='足印']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='最新']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='热门']").click();

        // 主页各页面
        driver.findElementByXPath("//android.widget.TextView[@text='发现']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='文集']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='浅记']").click();
    }

    /**
     * AppiumDriver的初始化逻辑必须写在该函数中
     *
     * @return
     */
    public AppiumDriver initAppiumTest() {
        AppiumDriver driver = null;
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, "qianyan.apk");

        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "a4dc271");
        capabilities.setCapability("platformVersion", "5.1.1");

        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath());

        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.zhy.qianyan");
        capabilities.setCapability("appActivity", ".MainActivity");
        
        //初始化
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
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