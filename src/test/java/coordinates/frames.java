package coordinates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		// open chrome browser
		WebDriver driver= new FirefoxDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://www.snapdeal.com/");
		WebElement ele= driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("22334455");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("kurta");
		driver.close();
	}

}
