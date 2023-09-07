package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class assignment {
	//declaration
	@FindBy (xpath="//a[@id='course']")
	private WebElement courseid;
	
	@FindBy (xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	//initialization
	public assignment(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

		//utilization
	public WebElement getCourseid() {
		return courseid;
	}

	

	public void Seleniumtrainingcourse() {
		seleniumtraining.click();
	}

	
	
	
	

}
