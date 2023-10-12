package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public Propertyfile pdata = new Propertyfile();
	public WebDriverUtilities utilities = new WebDriverUtilities();
	public WebDriver driver;
	
	@BeforeMethod
	
	public void openApp() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pdata.getpropertyData("url"));
	}
	
	@AfterMethod
	
	public void closeApp(ITestResult res) throws Throwable {
		int status = res.getStatus();
		String name = res.getName();
		if(status == 2) {
			Photo p = new Photo();
			p.getPhoto(driver, name);
		}
		
		driver.quit();
	}
	
	
}
