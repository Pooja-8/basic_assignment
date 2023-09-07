package coordinates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonassignementrigtclick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// open chrome browser
		WebDriver driver= new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://www.amazon.in/ ");
		WebElement ele=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		//creating action object
		Actions act= new Actions(driver);
		act.contextClick(ele).perform();

	}

}
