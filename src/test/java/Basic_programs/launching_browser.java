package Basic_programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class launching_browser {

	public static void main(String[] args) throws InterruptedException {
		// driver related statements
		WebDriverManager.chromedriver().setup();
		// open chrome browser
		WebDriver driver= new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// opens the webapp
		driver.get("https://www.facebook.com/");
		// gets titel
		System.out.println(driver.getTitle());
		// printing current url
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
