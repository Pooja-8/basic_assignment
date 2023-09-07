package coordinates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// open chrome browser
		WebDriver driver= new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()= 'Create new account']")).click();
		WebElement radio =driver.findElement(By.xpath("//input[@value='1']"));
		radio.click();
		if(radio.isSelected()) {
			System.out.println("if block");
		}
		else
		{
			System.out.println("else block");
		}
	}

}
