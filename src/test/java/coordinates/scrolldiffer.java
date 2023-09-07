package coordinates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolldiffer {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		// open chrome browser
		WebDriver driver= new FirefoxDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://www.amazon.in/");
		WebElement career= driver.findElement(By.xpath("//a[text()='Careers']"));
		Point coordinates= career.getLocation();
		int x=coordinates.getX();
		int y=coordinates.getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(\" + x + \",\" + y + \")"); 

		Thread.sleep(3000);
		career.click();
		driver.close();

	}

}
