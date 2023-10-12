package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	// 1. DropDown
	
	public void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	// 2. Right clicking
	
		public void rightClick(WebDriver driver, WebElement ele) {
			Actions a = new Actions (driver);
			a.contextClick(ele).perform();
		}
		
	// 3. double click
		
		public void doubleClicking(WebDriver driver, WebElement ele) {
			Actions a = new Actions (driver);
			a.doubleClick(ele).perform();
		}
		
	// 4. Mouse over
		
		public void mouseOvering(WebDriver driver, WebElement ele) {
			Actions a = new Actions (driver);
			a.moveToElement(ele).perform();
		}
		
	// 5. Drag and drop
		
		public void dragAndDropping(WebDriver driver, WebElement ele, WebElement ele2) {
			Actions a = new Actions (driver);
			a.dragAndDrop(ele, ele2).perform();
		}
		
	// 6. alter pop up
		
		public void alterPopup (WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
	// 7. handling child browser
		
		public void childBrowser(WebDriver driver) {
			Set<String> child = driver.getWindowHandles();
			for (String b:child) {
				driver.switchTo().window(b);
			}
		}
		
	// 8. scrolling using get location
		
		public void scrollBar(WebDriver driver, int x, int y) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollby("+x+", "+y+")");
		}
		
	// 9. scrolling with WebElement
		
		public void scrollBar(WebDriver driver, WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", ele);;
		}
		
	// 10. for clicking using javaScript executor
		
		public void clicking(WebDriver driver, WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ele);
		}
		
}
