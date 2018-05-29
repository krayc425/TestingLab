import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Example {

    static public void test(WebDriver driver) {
    	driver.get("http://flights.ctrip.com/");
    	driver.findElement(By.xpath("//*[@id='changecityid']")).click();
    	driver.findElement(By.id("radio_S")).click();
    	driver.findElement(By.id("radio_D")).click();
    	driver.findElement(By.id("ReturnDepartDate1TextBox")).click();
    	driver.findElement(By.id("ReturnDepartDate1TextBox")).sendKeys("2018-06-26");
    	driver.findElement(By.id("DepartDate1TextBox")).click();
    	driver.findElement(By.id("DepartDate1TextBox")).sendKeys("2018-06-25");
    	driver.findElement(By.id("ArriveCity1TextBox")).click();
    	driver.findElement(By.id("ArriveCity1TextBox")).sendKeys("Shanghai");
    	driver.findElement(By.id("DepartCity1TextBox")).click();
    	driver.findElement(By.id("DepartCity1TextBox")).sendKeys("Nanjing");
    	driver.findElement(By.id("search_btn")).click();
    	sleep(10);
    	driver.findElement(By.cssSelector("#flight_MU2881 > table > tbody > tr > td.book.middle > button")).click();
    	sleep(10);
    	driver.findElement(By.cssSelector("#flight_MU2882 > div.search_table_header_wrap > div.search_table_header_section.voyage_return > table > tbody > tr > td.book.middle > button")).click();
    	driver.findElement(By.id("btnReSearch")).click();
    }

    private static void sleep(int seconds) {
    	try {
    		Thread.sleep(seconds * 1000);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    static public void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
    	WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}
