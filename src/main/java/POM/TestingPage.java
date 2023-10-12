package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	// declaration
	
	// address of facebook webelement at the bottom
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbIcon;
	
	// initialization
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	// utilization
	
	public void fbIconWebElement() {
		fbIcon.click();
	}

	public WebElement getFbIcon() {
		return fbIcon;
	}


}
