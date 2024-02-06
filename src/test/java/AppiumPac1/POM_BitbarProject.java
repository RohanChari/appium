package AppiumPac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_BitbarProject {

	WebDriver driver;
	By radiobutton1 = By.id("com.bitbar.testdroid:id/radio0");
	By radiobutton2 = By.id("com.bitbar.testdroid:id/radio1");
	By Entername = By.id("com.bitbar.testdroid:id/editText1");
	By button = By.id("com.bitbar.testdroid:id/button1");
	By dashboard = By.id("com.bitbar.testdroid:id/textView2");
	

	public POM_BitbarProject(WebDriver driver) {
		this.driver=driver;
	
	}
//1
	public void radiobutton101() {
		driver.findElement(radiobutton1).click();
	}
//2

	public void radiobutton2nd() {
		//driver.findElement(radiobutton2).click();
		WebElement rush =driver.findElement(radiobutton2);
		rush.click();
		
		boolean isenable = rush.isEnabled();
		if(isenable)
		{
			System.out.println("It is Enabled properly");
		}else
		{
			System.out.println("It is not Enabled ");
			
		}
		
	}

	public void enterfirstname(String firstname) {
		driver.findElement(Entername).sendKeys(firstname);
	}
	
	
	//button
	public void clickonbutton() {
		driver.findElement(button).click();
	}	
	
	
	 public boolean isDisplayed() {
	        boolean isdisplayed = driver.findElement(dashboard).isDisplayed();
	        return isdisplayed;
	     }
	
}	
	
	
	
	
	
	

