package coordinates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textfieldsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Dimension size = ele.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.close();
		}

}
