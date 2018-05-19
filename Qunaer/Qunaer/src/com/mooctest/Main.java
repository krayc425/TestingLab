package com.mooctest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AndroidKeyCode;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class Main {

    /**
     * "appPackage", "com.Qunar"
     * "app-launchActivity", "com.mqunar.splash.SplashActivity"
     *  本示例脚本仅作为参考，具体请根据自己的测试机型可能出现的特殊情况进行脚本的编写调整
     */

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

        // 点击弹窗
        driver.findElementById("com.mqunar.atom.attemper:id/atom_atte_iv_close").click();

        // 首页 Tab 栏
        driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_order_default").click();
        driver.findElementById("com.mqunar.patch:id/pub_pat_id_icon_back").click();
        driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_service_default").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_uc_default").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_finding_default").click();
        sleep(10);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_home_default").click();
        sleep(3);

        // 景点门票
        driver.findElementById("com.mqunar.atom.alexhome:id/atom_alexhome_mod_sight").click();
        sleep(3);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_main_tv_city_icon").click();
        sleep(3);
        driver.findElementByXPath("//android.widget.TextView[@text='N']").click();
        sleep(3);
        driver.findElementByXPath("//android.widget.TextView[@text='南京']").click();
        sleep(5);

        // 中间 Banner
        driver.findElementByXPath("//android.widget.TextView[@text='夫子庙']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementByXPath("//android.widget.TextView[@text='必游榜单']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementByXPath("//android.widget.TextView[@text='踏青赏花']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementByXPath("//android.widget.TextView[@text='名胜古迹']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementByXPath("//android.widget.TextView[@text='一日游']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementByXPath("//android.widget.TextView[@text='总统府']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementByXPath("//android.widget.TextView[@text='中山陵']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);

        driver.context("NATIVE_APP");
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.8);
        int endx = (int) (size.width * 0.2);
        int starty = size.height / 3;
        driver.swipe(startx, starty, endx, starty, 1000);
        sleep(3);

        driver.findElementByXPath("//android.widget.TextView[@text='万达主题乐园']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementByXPath("//android.widget.TextView[@text='牛首山']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);

        driver.context("NATIVE_APP");
        size = driver.manage().window().getSize();
        startx = (int) (size.width * 0.2);
        endx = (int) (size.width * 0.8);
        starty = size.height / 3;
        driver.swipe(startx, starty, endx, starty, 1000);
        sleep(3);

        driver.findElementByXPath("//android.widget.TextView[@text='景点门票']").click();
        sleep(5);

        // 中山陵
        driver.findElementByXPath("//android.widget.TextView[@text='中山陵(5A)']").click();
        sleep(1);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_detail_titlebar_tv_share").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_img_location_icon").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_detail_titlebar_tv_collect").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_btn_sight_desc").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iv_img_title").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementByXPath("//android.widget.TextView[@text='门票']").click();
        sleep(5);

        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_booking_info_more_arrow").click();
        sleep(10);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);

        driver.findElementByXPath("//android.widget.TextView[@text='可订今日']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='可订明日']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='热销景点']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_map_icon").click();
        sleep(1);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_btn_mylocal").click();
        sleep(3);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_map_icon").click();
        sleep(1);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_tv_searchbox").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);

        // 底部
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_layout_right_sort_button").click();
        driver.findElementByXPath("//android.widget.TextView[@text='热门评论']").click();	//swipe
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_right").click();
        driver.findElementByXPath("//android.widget.TextView[@text='价格最低']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_right").click();
        driver.findElementByXPath("//android.widget.TextView[@text='价格最高']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_right").click();
        driver.findElementByXPath("//android.widget.TextView[@text='销量最高']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_right").click();
        driver.findElementByXPath("//android.widget.TextView[@text='离我最近']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_right").click();
        driver.findElementByXPath("//android.widget.TextView[@text='推荐排序']").click();

        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_layout_left_filter_button").click();
        driver.findElementByXPath("//android.widget.TextView[@text='一日游']").click();
        sleep(3);
        driver.findElementByXPath("//android.widget.TextView[@text='城市观光']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='游乐场']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='文化古迹']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='交通']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='当地游']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='周边游']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='全部一日游']").click();

        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_layout_left_filter_button").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_filter_item_icon").click();
        sleep(3);
        driver.findElementByXPath("//android.widget.TextView[@text='交通']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='餐饮']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='演出']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='运动健身']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='海洋馆']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='植物园']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='游船']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='水上玩乐']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='手工']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='室内娱乐']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='城市观光']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='体验馆']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='温泉']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='游乐场']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='自然风光']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='公园']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='展馆']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='农家度假']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='文化古迹']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='户外拓展']").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_iconfont_left").click();
        driver.findElementByXPath("//android.widget.TextView[@text='全部分类']").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);

        // 搜索框
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_main_tv_searchbox").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_tv_change_batch").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_et_search").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_btnSearch").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_main_tv_searchbox").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_ivDelete").click();
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_clear_history_btn").click();

        sleep(2);
        driver.findElementById("android:id/button1").click();

        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_suggest_nearby_scenic").click();
        sleep(3);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
        driver.findElementByXPath("//android.widget.TextView[@text='景点门票']").click();
        sleep(5);
        driver.findElementById("com.mqunar.atom.sight:id/atom_sight_list_iv_backpress").click();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);        //等待6s，待应用完全启动
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
        File app = new File(appDir, "qunaer.apk");

        //设置自动化相关参数
        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "a4dc271");
        capabilities.setCapability("platformVersion", "5.1.1");

        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath());

        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.Qunar");
        capabilities.setCapability("appActivity", "com.mqunar.splash.SplashActivity");
        capabilities.setCapability("noReset", true);
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