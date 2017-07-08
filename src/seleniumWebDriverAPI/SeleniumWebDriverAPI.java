package seleniumWebDriverAPI;

//dependencies: Selenium Client & WebDriver Language Bindings http://www.seleniumhq.org/download/
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumWebDriverAPI {

	public static void main (String[] args) {
		
		boolean incognito = true; //modify for incognito mode

		WebDriver driver = getChromeDriver(incognito); //should be part of test fixtures (@BeforeClass -> setUp() method)
		driver.get("https://www.google.com");

		WebElement element = driver.findElement(By.className("gb_P"));
		
		System.out.println(element.getText());
		element.click();
		
		/**
		element.submit();
		element.clear();
		element.sendKeys(Keys.BACK_SPACE);
		element.sendKeys(Keys.TAB);
		element.sendKeys(Keys.ENTER);
		element.sendKeys("Something written in a string");;
		
		driver.switchTo().window("windowName");
		driver.switchTo().frame("frameName");
		
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
		
		WebElement source = driver.findElement(...);
		WebElement target = driver.findElement(...);
		(new Actions(driver)).dragAndDrop(source, target); //interesting org.openqa.selenium.interactions.Actions
		
		driver.navigate().to("http://example.com");
		 */
		
		delay2sec();
		driver.navigate().back();
		delay2sec();
		driver.navigate().forward();
		delay2sec();
		driver.quit(); //should be part of test fixtures (@AfterClass -> tearDown() method)
		
	}
	
	//for normal window
	private static ChromeDriver getChromeDriver(boolean incognito) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\marcb\\Desktop\\Applications4Work\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Programming\\dependencies\\seleniumAndDownloader\\chromedriver.exe");
		if(incognito == false) {
			return new ChromeDriver();
		} else {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("-incognito");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			return new ChromeDriver(capabilities);
		}
	}

	
	private static void delay2sec() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
