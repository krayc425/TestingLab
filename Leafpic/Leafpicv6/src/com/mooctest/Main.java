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


        driver.findElementByXPath("//android.widget.ImageButton[@index='0']").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_drawer_hidden").click();
        driver.findElementByXPath("//android.widget.ImageButton[@index='0']").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_drawer_Wallpapers").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_drawer_Donate").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/ll_drawer_Setting").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/ll_drawer_About").click();
        driver.findElementById("org.horaapps.leafpic:id/about_author_donald_mail_item").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/about_author_donald_googleplus_item").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/about_author_donald_github_item").click();
        goBack(driver);
        sleep(3);
        driver.findElementById("org.horaapps.leafpic:id/about_author_gilbert_mail_item").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/about_author_gilbert_googleplus_item").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/about_author_gilbert_github_item").click();
        goBack(driver);
        sleep(3);
        driver.findElementById("org.horaapps.leafpic:id/ll_about_report_bug").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/ll_about_support_translate").click();
        goBack(driver);
        sleep(4);
        driver.findElementById("org.horaapps.leafpic:id/ll_about_support_rate").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_about_support_github").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/ll_about_support_donate").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/ll_about_license").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/ll_about_libs").click();
        driver.findElementByXPath("//android.widget.Button[@text='关闭']").click();

        goBack(driver);
        sleep(5);

        driver.findElementById("org.horaapps.leafpic:id/ll_drawer_Default").click();
        driver.findElementById("org.horaapps.leafpic:id/search_action").click();
        driver.findElementByXPath("//android.widget.ImageButton[@index='0']").click();

        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='设置']").click();

        driver.findElementById("org.horaapps.leafpic:id/ll_n_columns").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();

        driver.findElementById("org.horaapps.leafpic:id/ll_excluded_album").click();
        driver.findElementById("org.horaapps.leafpic:id/UnExclude_icon").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/ll_security").click();
        goBack(driver);
        driver.findElementById("org.horaapps.leafpic:id/ll_basic_theme").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_dark_basic_theme").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_dark_amoled_basic_theme").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_white_basic_theme").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_primaryColor").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_accentColor").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();
        driver.findElementById("org.horaapps.leafpic:id/ll_custom_thirdAct").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();
        sleep(3);
        driver.findElementById("org.horaapps.leafpic:id/ll_map_provider").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='转到上一层级']").click();

        List<WebElement> albums = driver.findElementsById("org.horaapps.leafpic:id/album_preview");
        albums.get(0).click();

        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='隐藏']").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='重命名']").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='删除']").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='设为预览']").click();

        driver.findElementById("org.horaapps.leafpic:id/filter_menu").click();
        driver.findElementByXPath("//android.widget.TextView[@text='视频']").click();
        driver.findElementById("org.horaapps.leafpic:id/filter_menu").click();
        driver.findElementByXPath("//android.widget.TextView[@text='图像']").click();
        driver.findElementById("org.horaapps.leafpic:id/filter_menu").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Gif 动态图']").click();
        driver.findElementById("org.horaapps.leafpic:id/filter_menu").click();
        driver.findElementByXPath("//android.widget.TextView[@text='全部']").click();

        driver.findElementById("org.horaapps.leafpic:id/sort_action").click();
        driver.findElementByXPath("//android.widget.TextView[@text='名称']").click();
        driver.findElementById("org.horaapps.leafpic:id/sort_action").click();
        driver.findElementByXPath("//android.widget.TextView[@text='日期']").click();
        driver.findElementById("org.horaapps.leafpic:id/sort_action").click();
        driver.findElementByXPath("//android.widget.TextView[@text='大小']").click();
        driver.findElementById("org.horaapps.leafpic:id/sort_action").click();
        driver.findElementByXPath("//android.widget.TextView[@text='类型']").click();
        driver.findElementById("org.horaapps.leafpic:id/sort_action").click();
        driver.findElementByXPath("//android.widget.TextView[@text='As number']").click();
        driver.findElementById("org.horaapps.leafpic:id/sort_action").click();
        driver.findElementByXPath("//android.widget.TextView[@text='升序排列']").click();

        driver.findElementById("org.horaapps.leafpic:id/photo_preview").click();
        driver.findElementById("org.horaapps.leafpic:id/action_share").click();
        driver.findElementByXPath("//android.widget.TextView[@text='取消']").click();
        driver.findElementById("org.horaapps.leafpic:id/action_delete").click();
        driver.findElementByXPath("//android.widget.Button[@text='取消']").click();
        driver.findElementById("org.horaapps.leafpic:id/action_rotate").click();
        driver.findElementByXPath("//android.widget.TextView[@text='向右旋转 90°']").click();
        driver.findElementById("org.horaapps.leafpic:id/action_rotate").click();
        driver.findElementByXPath("//android.widget.TextView[@text='向左旋转 90°']").click();
        driver.findElementById("org.horaapps.leafpic:id/action_rotate").click();
        driver.findElementByXPath("//android.widget.TextView[@text='旋转 180°']").click();

        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='编辑']").click();
        driver.findElementById("org.horaapps.leafpic:id/crop_aspect_ratio_1_1").click();
        driver.findElementById("org.horaapps.leafpic:id/crop_aspect_ratio_3_4").click();
        driver.findElementById("org.horaapps.leafpic:id/crop_aspect_ratio_original").click();
        driver.findElementById("org.horaapps.leafpic:id/crop_aspect_ratio_3_2").click();
        driver.findElementById("org.horaapps.leafpic:id/crop_aspect_ratio_16_9").click();
        driver.findElementById("org.horaapps.leafpic:id/state_scale").click();
        driver.findElementById("org.horaapps.leafpic:id/state_aspect_ratio").click();
        driver.findElementById("org.horaapps.leafpic:id/state_rotate").click();
        driver.findElementById("org.horaapps.leafpic:id/wrapper_reset_rotate").click();
        driver.findElementById("org.horaapps.leafpic:id/wrapper_rotate_by_angle").click();
        driver.findElementById("org.horaapps.leafpic:id/menu_crop").click();
        sleep(3);

        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='设为...']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='取消']").click();

        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='排序']").click();
        goBack(driver);

        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='复制到']").click();
        sleep(4);
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='移动到']").click();
        sleep(4);
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='详情']").click();
        driver.findElementByXPath("//android.widget.Button[@text='确定']").click();
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='使用...编辑']").click();
        goBack(driver);
        driver.findElementByXPath("//android.widget.ImageView[@content-desc='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='更多选项']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='使用...打开']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='取消']").click();

        goBack(driver);
        sleep(4);
        driver.findElementById("org.horaapps.leafpic:id/fab_camera").click();
        goBack(driver);
        sleep(4);
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
        File app = new File(appDir, "Leafpicv6.apk");

        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");

        //设置安卓系统版本
        capabilities.setCapability("platformVersion", "5.1");
        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath());

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