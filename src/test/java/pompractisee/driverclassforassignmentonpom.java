package pompractisee;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.assignment;
import POM.assignment2continue;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverclassforassignmentonpom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		// open chrome browser
		WebDriver driver= new FirefoxDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://demoapp.skillrary.com/");
		Actions a= new Actions(driver);
		assignment skillerydemologin = new assignment(driver);
		a.moveToElement(courseid).perform();
		assignment2continue skillerydemoaddtocartpage = new assignment2continue(driver);

	}

}
