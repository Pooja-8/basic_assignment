package coordinates;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// open chrome browser
		WebDriver driver= new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://www.google.com/");
		//address of search
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("phone");
		Thread.sleep(2000);
		//address of list
		List<WebElement> list = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		for(WebElement alllist:list)
			System.out.println(alllist.getText());
		
	}

}
