package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Ejemplo2Test {
	private WebDriver driver;
	DemoPageObject demoPageObject;
	@Before
	public void setUp() throws Exception {
		demoPageObject = new DemoPageObject(driver);
		driver = demoPageObject.chromeDriverConection();
		demoPageObject.visit("https://demoqa.com/droppable");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		demoPageObject.drop();
		Thread.sleep(3000);
	}

}
