import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Example {


    static public void test(WebDriver driver) {
    	driver.get("http://flight.tuniu.com/");
    	driver.findElement(By.id("J_AirFormRound")).click();
    	driver.findElement(By.id("J_AirFormSingle")).click();
    	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[3]/div/a")).click();
    	driver.findElement(By.id("J_FormDestCity")).click();
    	driver.findElement(By.id("J_FormDestCity")).sendKeys("上");
    	driver.findElement(By.id("J_FormDestCity")).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
    	driver.findElement(By.id("J_FormDepartCity")).click();
    	driver.findElement(By.id("J_FormDepartCity")).sendKeys("北");
    	driver.findElement(By.id("J_FormDepartCity")).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
    	driver.findElement(By.id("J_FormAdult")).click();
    	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/div[1]/div[2]/ul/li")).click();
    	driver.findElement(By.id("J_FormShowAdvance")).click();
    	driver.findElement(By.id("J_FormSeat")).click();
    	driver.findElement(By.xpath("//*[@id=\'J_FormSeatWrap\']/ul/li")).click();
    	driver.findElement(By.id("J_Search")).click();
    	
    	driver.get("http://flight.tuniu.com/");
    	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/ul/li[6]/div/div/a[2]")).click();
    	driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div[1]/div[2]/div[2]/div/span[2]/a")).click();
    	driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div[1]/div[2]/div[2]/div/span[1]/a")).click();
    	driver.findElement(By.id("changeCity")).click();
    	driver.findElement(By.name("departCityName")).click();
    	driver.findElement(By.name("departCityName")).sendKeys("上海");
    	sleep(3);
    	driver.findElement(By.name("departCityName")).sendKeys(Keys.RETURN);
    	driver.findElement(By.name("destCityName")).click();
    	driver.findElement(By.name("destCityName")).sendKeys("香港");
    	sleep(3);
    	driver.findElement(By.name("destCityName")).sendKeys(Keys.RETURN);
    	sleep(5);
    	driver.findElement(By.name("adultQuantity")).click();
    	driver.findElement(By.name("adultQuantity")).sendKeys("1");
    	driver.findElement(By.id("searchIntl")).click();
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
