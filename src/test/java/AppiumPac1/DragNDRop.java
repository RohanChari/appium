package AppiumPac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class DragNDRop {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("deviceName","Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation", "true");
		dc.setCapability("appium:noReset", "true");
		dc.setCapability("appium:platformVersion","12.0");
		dc.setCapability("app","D:\\mobeta\\com.mobeta.android.demodslv_2013-01-11.apk");
		
		URL url1=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url1,dc);
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.mobeta.android.demodslv:id/activity_title\" and @text=\"Basic usage playground\"]")).click();
		WebElement source = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(3);
		WebElement target = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(7);
		
		TouchAction action= new  TouchAction(driver); 
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
			
	}

}
