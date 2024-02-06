package AppiumPac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC004_Settings {

	public static void main(String[] args) throws MalformedURLException {
	
		final DesiredCapabilities capabilities =new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Medium Phone API 32");
		capabilities.setCapability("appPackage", "com.android.settings");
		capabilities.setCapability("appActivity", ".Settings");;
		
		URL url1=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url1,capabilities);
		
		
		
		
	}

}
