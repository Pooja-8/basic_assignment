package coordinates;
//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiselect {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		// open chrome browser
		WebDriver driver= new FirefoxDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://demoapp.skillrary.com/");
		//address of dropdown
		WebElement dropdown = driver.findElement(By.id("cars"));
		System.out.println(dropdown.getText());
		//select class
		Select s= new Select(dropdown);
		//s.selectByIndex(0);
		//Thread.sleep(2000);
		s.selectByValue("500");
		//driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(2000);
		//s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		//Thread.sleep(2000);
		s.deselectByIndex(0);
		//Thread.sleep(2000);
		//s.deselectByValue("199");
		//Thread.sleep(2000);
		//System.out.println(s.isMultiple());
		//List<WebElement> all = s.getAllSelectedOptions();
		//for (WebElement b: all)
		//{
		//	System.out.println(b.getText());
		//}
		
		driver.close();
		
	}

}
