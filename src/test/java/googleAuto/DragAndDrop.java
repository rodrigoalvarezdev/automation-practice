package googleAuto;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	private WebDriver driver;
	private WebDriverWait wait;
	public Select select;
	public Actions action = new Actions(driver);
	
	By drag = By.id("draggable");
	By drop = By.id("droppable");
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void test() {
		//action.dragAndDrop(driver.findElement(drag),driver.findElement(drop)).build().perform();
	}
	
}
