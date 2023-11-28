package com.ss.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By removeFromCartBtn = By.xpath("//*[@class='product-card__remove-icon']");
	By emptyCartMsg = By.xpath("//h1[@class='cart__empty-title']");
	
	public void clickremoveFromCartBtn() throws InterruptedException {
		driver.findElement(removeFromCartBtn).click();
		Thread.sleep(5000);
	}
	
	public String getemptyCartMsg() {
		return driver.findElement(emptyCartMsg).getText();
	}

}
