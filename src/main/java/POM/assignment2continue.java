package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class assignment2continue {
	//declaration
	@FindBy (xpath="//button[@id='add']")
	private WebElement addbtn;
	
	@FindBy (xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	//iniliation
	public assignment2continue(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	public WebElement getAddbtn() {
		return addbtn;
	}

	
	public void Addtocartclick() {
		 addtocart.click();;
	}

	
	

	
}
