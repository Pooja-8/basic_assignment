package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		// driver related statements
				WebDriverManager.chromedriver().setup();
				// open chrome browser
				WebDriver driver= new ChromeDriver();
				// maximize the browser
				driver.manage().window().maximize();
				// opens the webapp
				driver.get("https://www.facebook.com/");
				driver.findElement(By.id("email")).sendKeys("pooja");
				driver.findElement(By.name("pass")).sendKeys("1234");
				driver.findElement(By.linkText("Forgotten password?")).click();
				Thread.sleep(3000);
				driver.quit();
	}

}
