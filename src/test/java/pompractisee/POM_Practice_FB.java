package pompractisee;

import java.util.concurrent.TimeUnit;
import POM.fb_loginPage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_Practice_FB {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		// open chrome browser
		WebDriver driver= new FirefoxDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// opens the webapp
		driver.get("https://www.facebook.com/");
		fb_loginPage fbloginpage = new fb_loginPage(driver);
		fbloginpage.emailTextField("pooja");
		fbloginpage.passwordTextField("1234");
		fbloginpage.loginbutton();
		
	}

}
