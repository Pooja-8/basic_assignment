package testNG_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	@org.testng.annotations.DataProvider 
	public Object [][] getData(){
		Object[][] a=new Object[3][2];
		a[0][0]= "asdf";
		a[0][1]="1233";
		
		a[1][0]= "afsdf";
		a[1][1]="12r33";
		
		a[2][0]= "asmdf";
		a[2][1]="12h33";
		
		return a;
		
	}
	
	@Test(dataProvider="getData")
	public void demo(String username, String password) {
		WebDriverManager.firefoxdriver().setup();
		// open chrome browser
		WebDriver driver= new FirefoxDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
