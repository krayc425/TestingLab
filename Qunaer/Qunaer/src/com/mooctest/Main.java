package com.mooctest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AndroidKeyCode;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	 * @param driver
	 */
	public void test(AppiumDriver driver) {
		    	try {
			Thread.sleep(6000);		//等待6s，待应用完全启动
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); //设置尝试定位控件的最长时间为8s,也就是最多尝试8s
      /*
    	 * 余下的测试逻辑请按照题目要求进行编写
    	 */

	}
	
	/**
	 * AppiumDriver的初始化逻辑必须写在该函数中
	 * @return
	 */
	public AppiumDriver initAppiumTest() {
		
		AppiumDriver driver=null;
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apk");
        File app = new File(appDir, "qunaer.apk");
        
        //设置自动化相关参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        
        //设置安卓系统版本
        capabilities.setCapability("platformVersion", "4.4");
        //设置apk路径
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //设置app的主包名和主类名
        capabilities.setCapability("appPackage", "com.Qunar");
        capabilities.setCapability("appActivity", "com.mqunar.splash.SplashActivity");
        //设置使用unicode键盘，支持输入中文和特殊字符
        capabilities.setCapability("unicodeKeyboard","true");
        //设置用例执行完成后重置键盘
        capabilities.setCapability("resetKeyboard","true");
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