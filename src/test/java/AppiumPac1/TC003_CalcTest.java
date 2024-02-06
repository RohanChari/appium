package AppiumPac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC003_CalcTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("deviceName","Medium Phone API 32");
		dc.setCapability("udid", "emulator-5554");
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url1=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url1,dc);
		Thread.sleep(2000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		Thread.sleep(2000);
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        Thread.sleep(2000);
		
		
		
	}

}
