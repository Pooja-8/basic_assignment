package coordinates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// open chrome browser
		WebDriver driver= new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		//address of source
		WebElement ele1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		//address of destination
		WebElement ele2= driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		//creating action object
		Actions act= new Actions(driver);
		//drag from block 1 to block 4
		act.dragAndDrop(ele1, ele2).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
