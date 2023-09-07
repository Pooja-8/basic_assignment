package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserdatadriven {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		// create object for proprty file
				Properties prop= new Properties(); 
				// creating an object for physical file
				FileInputStream fis= new FileInputStream(".//src//test//resources//Data.properties");
				prop.load(fis);
				String appurl = prop.getProperty("url");
				String username = prop.getProperty("username");
				String password = prop.getProperty("password");
				String browser = prop.getProperty("browser");
				
				WebDriver driver;
				if (browser.equals("firefox")) {
					
				
				WebDriverManager.firefoxdriver().setup();
				// open chrome browser
				driver= new FirefoxDriver();
	}
	else
	{
		WebDriverManager.edgedriver().setup();
		// open chrome browser
		driver= new EdgeDriver();
	}
		
				// maximize the browser
				driver.manage().window().maximize();
				//wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// opens the webapp
				driver.get(appurl);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
				driver.close();

	}

}
