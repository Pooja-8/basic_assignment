package coordinates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Isenabled {

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
		driver.findElement(By.id("email")).sendKeys("pooja");
		driver.findElement(By.id("pass")).sendKeys("1233");
		WebElement ele = driver.findElement(By.xpath("//button[@name='login']"));
		if (ele.isEnabled())
		{
			System.out.println("its present");
			ele.click();
		}
		else
		{
			System.out.println("its not present");
		}
	}

}
