package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_links_display {

	public static void main(String[] args) {
		// driver related statements
		WebDriverManager.chromedriver().setup();
		// open chrome browser
		WebDriver driver= new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// opens the webapp
		driver.get("https://www.facebook.com/");
		List<WebElement> alllinks =driver.findElements(By.tagName("a"));
		for(WebElement b: alllinks) {
			//System.out.println(b.getSize());
			System.out.println(b.getText());
			
			
		}
		driver.close();
		
	}

}
