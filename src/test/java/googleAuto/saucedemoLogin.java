package googleAuto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemoLogin {
	private WebDriver driver;
	By inputName = By.id("user-name"),
		inputPassword = By.id("password"),
		btnLogin = By.id("login-button"),
		titleProductList = By.className("title");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testLogin() throws InterruptedException {
		driver.findElement(inputName).sendKeys("standard_user");
		driver.findElement(inputPassword).sendKeys("secret_sauce");
		driver.findElement(btnLogin).click();
		Thread.sleep(5000);
		assertEquals(driver.findElement(titleProductList).getText(), "PRODUCTS");
	}

}
