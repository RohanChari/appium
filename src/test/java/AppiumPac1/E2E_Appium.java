package AppiumPac1;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class E2E_Appium {
   
	//IOSDriver driver;
	AndroidDriver  driver;
	@Test(dataProvider = "dp")

  public void f(String name) throws InterruptedException {
		
		 
		  Thread.sleep(3000);
		  driver.findElement(By.id("com.bitbar.testdroid:id/radio1")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("com.bitbar.testdroid:id/editText1")).sendKeys(name);
		  Thread.sleep(1000);
          driver.findElement(By.id("com.bitbar.testdroid:id/button1")).click();
	
		
		Thread.sleep(1000);
		boolean isdisplayed= driver.findElement(By.id("com.bitbar.testdroid:id/textView2")).isDisplayed();
		
		if(isdisplayed) {                                         	
			
			
			System.out.println("Passed");
		}
		else {
			
			System.out.println("Error");
	}			
  }
		
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "Medium Phone API 32");
		dc.setCapability("skipServerInstallation", "true");
		dc.setCapability("noReset", "true");
		dc.setCapability("platformVersion", "12.0");
		dc.setCapability("app","D:\\bitbar\\bitbar-sample-app.apk"); 
		URL url=new URL("http://127.0.0.1:4723/wd/hub");  
	    driver= new AndroidDriver(url, dc);        //AndroidDriver driver= new AndroidDriver(url, dc);
  }

  
  
  @AfterMethod
  public void afterMethod() {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	  new Object[] {"rockie"},
    };
  }
  
}
