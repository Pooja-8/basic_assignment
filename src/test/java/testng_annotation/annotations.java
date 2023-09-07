package testng_annotation;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class annotations {
	WebDriver driver;
	
@BeforeMethod
public void open() {
	WebDriverManager.firefoxdriver().setup();
	// open chrome browser
	driver= new FirefoxDriver();
	// maximize the browser
	driver.manage().window().maximize();
	//wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

	@Test
	public void fb() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(priority = -1)
	public void amazon() {
		driver.get("https://www.amazon.in");
	}
	@AfterMethod
	public void closeing() {
		driver.close();
	}

	
}
