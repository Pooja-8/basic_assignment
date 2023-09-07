package coordinates;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownsingle {

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
		//address of dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Thread.sleep(2000);
		//select class
		Select s= new Select(dropdown);
		s.selectByIndex(6);
		Thread.sleep(2000);
		s.selectByValue("search-alias=alexa-skills");
		Thread.sleep(2000);
		s.selectByVisibleText("Electronics");
		Thread.sleep(2000);
		//check type of dropdown
		System.out.println(s.isMultiple());
		List<WebElement> alloption = s.getOptions();
		System.out.println(alloption.size());
		for(WebElement b:alloption) {
			System.out.println(b.getText());
		}
	}

}
