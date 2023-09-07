package coordinates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				// open chrome browser
				WebDriver driver= new ChromeDriver();
				// maximize the browser
				driver.manage().window().maximize();
				//wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// opens the webapp
				driver.get("https://demoapp.skillrary.com/ ");
				WebElement ele=driver.findElement(By.xpath("//a[@id='course']"));
				
				//creating action object
				Actions act= new Actions(driver);
				act.moveToElement(ele).perform();
				//address of selenium traininh
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
				//address of add
				WebElement plus = driver.findElement(By.xpath("//button[@id='add']"));
				act.doubleClick(plus).perform();
	
	}

}
