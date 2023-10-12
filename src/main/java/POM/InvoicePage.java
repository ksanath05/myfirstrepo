package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	
	//declaaration
	
	//address of invoice web element
	
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement InvoiceBtn;
	
	
	// initialization
	
		public InvoicePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	
	
	// utilization

		public void InvoiceButton() {
		InvoiceBtn.click();
		}


}
