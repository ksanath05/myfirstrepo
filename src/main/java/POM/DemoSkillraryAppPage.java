package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryAppPage {
	
	// declaration
	
	// address course webelement
	
	@FindBy(id="course")
	private WebElement Coursebtn;
	
	// address feedback webelement
	
		@FindBy(xpath="//a[text()='FEEDBACK']")
		private WebElement feedBackbtn;
		
	// address select category dropdown
		
		@FindBy(name="addresstype")
		private WebElement selectDd;
	
	// iniialization
		
		public DemoSkillraryAppPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	
	// utilization
		
		public WebElement getCoursebtn() {
			return Coursebtn;
		}
		
		public WebElement getSelectDd() {
			return selectDd;
		}
		
		public void feedBackButton() {
			feedBackbtn.click();
		}
		
		
}
