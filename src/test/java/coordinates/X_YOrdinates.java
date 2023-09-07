package coordinates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_YOrdinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// driver related statements
				WebDriverManager.chromedriver().setup();
				// open chrome browser
				WebDriver driver= new ChromeDriver();
				// maximize the browser
				driver.manage().window().maximize();
				//wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// opens the webapp
				driver.get("https://www.facebook.com/");
				WebElement ele = driver.findElement(By.id("email"));
				Point coordinates =ele.getLocation();
				System.out.println(coordinates.getX());
				System.out.println(coordinates.getY());
				
	}

}
