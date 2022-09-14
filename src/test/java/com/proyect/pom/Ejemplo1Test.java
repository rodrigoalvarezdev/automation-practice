package com.proyect.pom;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Ejemplo1Test {
	private WebDriver driver;
	DemoPageObject demoPageObject;
	
	@Before
	public void setUp() {
		demoPageObject = new DemoPageObject(driver);
		driver = demoPageObject.chromeDriverConection();
		demoPageObject.visit("https://demoqa.com/text-box");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException {
		demoPageObject.ejemplo1();
		assertEquals("Name:rodri", demoPageObject.returnText());
		for (WebElement i : demoPageObject.lista()) {
			System.out.println(i.getText());
		}
		assertEquals("Name:rodri", demoPageObject.lista().get(0).getText());
		assertEquals("Email:rodri@gmail.com", demoPageObject.lista().get(1).getText());
		assertEquals("Current Address :gil", demoPageObject.lista().get(2).getText());
		assertEquals("Permananet Address :barros", demoPageObject.lista().get(3).getText());
		Thread.sleep(5000);
	}
}
