package AppiumPac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BitBarApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("appium:app","C:\\Users\\rushikesh.auti\\Downloads\\bitbar-sample-app.apk");	
		URL url=new URL("http://127.0.0.1:4723/wd/hub");  // you have to go on appium server;
		AndroidDriver driver= new AndroidDriver(url, dc);	
		
		Thread.sleep(2000);
		driver.findElement(By.id("com.bitbar.testdroid:id/radio0")).click();	
		Thread.sleep(1000);
        WebElement wb =	driver.findElement(By.id("com.bitbar.testdroid:id/radio1"));
        wb.click();
        wb.isEnabled();
        Thread.sleep(1000);
        driver.findElement(By.id("com.bitbar.testdroid:id/editText1")).sendKeys("rocky");

		Thread.sleep(1000);
        driver.findElement(By.id("com.bitbar.testdroid:id/button1")).click();
        Thread.sleep(2000);
		
		
	}

}
