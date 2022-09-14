package googleAuto;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Selecto {
	private WebDriver driver;
	private WebDriverWait wait;
	public Select oldSelect;
	By selector = By.id("oldSelectMenu");
	By multi = By.id("cars");
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demoqa.com/select-menu");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		oldSelect = new Select(driver.findElement(selector));
		oldSelect.selectByVisibleText("Black");
		Thread.sleep(2000);
		oldSelect = new Select(driver.findElement(multi));
		oldSelect.selectByVisibleText("Volvo");
		oldSelect.selectByVisibleText("Audi");
		Thread.sleep(5000);
	}

}
