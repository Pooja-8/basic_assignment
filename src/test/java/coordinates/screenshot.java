package coordinates;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		// open chrome browser
		WebDriver driver= new FirefoxDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("./Screenshots/flipkart.png");
		// copy from src to dest
		FileUtils.copyFile(src, des);
		driver.quit();
		
		

	}

}
