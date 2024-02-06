package AppiumPac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Scroll {

	public static void main(String[] args) throws MalformedURLException {
	
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("deviceName","Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation", "true");
		dc.setCapability("appium:noReset", "true");
		dc.setCapability("appium:platformVersion","12.0");
		dc.setCapability("app","D:\\apidemos\\ApiDemos-debug.apk");
		
		URL url1=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url1,dc);
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		AndroidElement list= (AndroidElement)driver.findElement(By.id("android:id/text1"));
		MobileElement listitems= (MobileElement)driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UiScrollabe(new UiSelector()).scrollIntoView("+"new UiSelector().discription(\"Switch\"));"));	
		
	}

}
