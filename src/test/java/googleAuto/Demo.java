package googleAuto;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	private WebDriver driver;
	private WebDriverWait wait;
	By button = By.id("visibleAfter");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void testClick() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(button));
			driver.findElement(button).click();
			System.out.println("boton clickeado");
				
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
