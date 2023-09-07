package testNG_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertion {
	@Test
	public void assertions() {
		WebDriverManager.firefoxdriver().setup();
		// open chrome browser
		WebDriver driver= new FirefoxDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://demoapp.skillrary.com/");
		String title = driver.getTitle();
		//hard assert
		//Assert.assertequals(title, "adads");
		//soft assert
		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "adbas");
		System.out.println(driver.getCurrentUrl());
		
	}

}
