package parallel_practise;

import org.testng.annotations.Test;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralle_crossbrowser {
	@Parameters({"browsername"})
	@Test
	public void fb(String browser) {
		WebDriver driver;
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			// open chrome browser
			driver= new FirefoxDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			// open chrome browser
			driver= new ChromeDriver();
		}
		
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://www.facebook.com/");

}}
