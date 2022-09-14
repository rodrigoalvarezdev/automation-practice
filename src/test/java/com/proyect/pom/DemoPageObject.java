package com.proyect.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoPageObject extends Base {
	
	By nameLocator = By.id("userName");
	By emailLocator = By.id("userEmail");
	By cAdressLocator = By.id("currentAddress");
	By pAdressLocator = By.id("permanentAddress");
	By btnSubmitLocator = By.id("submit");
	By outputLocator = By.id("name");
	By classNameOuput = By.className("mb-1");
	By drag = By.id("draggable");
	By drop = By.id("droppable");
	
	
	public DemoPageObject(WebDriver driver) {
		super(driver);
	}
	
	public void ejemplo1() {
		writeInput("rodri", nameLocator);
		writeInput("rodri@gmail.com", emailLocator);
		writeInput("gil", cAdressLocator);
		writeInput("barros", pAdressLocator);
		click(btnSubmitLocator);
		System.out.println(getText(outputLocator));
	}
	
	public String returnText() {
		return getText(outputLocator);
	}
	
	public List<WebElement> lista() {
		return findElements(classNameOuput);
	}
	
	public void drop() {
		dropDrag(drag, drop);
	}
}
