package googleAuto;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA {
	private WebDriver driver;
	private WebDriverWait wait;
	By name = By.id("userName");
	By email = By.id("userEmail");
	By direccion = By.id("currentAddress");
	By otraDireccion = By.id("permanentAddress");
	By btn = By.id("submit");
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testNombre() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
			driver.findElement(name).sendKeys("rodri");
			driver.findElement(email).sendKeys("rodri@gmail.com");
			driver.findElement(direccion).sendKeys("mi direccion");
			driver.findElement(otraDireccion).sendKeys("mi otra direccion");
			driver.findElement(btn).click();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
