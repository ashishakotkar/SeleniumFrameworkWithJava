package com.ss.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuitPage {
	WebDriver driver;

	public SuitPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By filter = By.xpath("//button[contains(text(),'Filter')]");
	By color = By.xpath("/html/body/div[1]/div[9]/ss-side-slider/dialog/main/filters-wrapper/ss-accordion/ss-accordion-item[2]");
	By blue = By.xpath("/html/body/div[1]/div[9]/ss-side-slider/dialog/main/filters-wrapper/ss-accordion/ss-accordion-item[2]/ss-grid/ss-card[8]");
	By close = By.xpath("//html/body/div[1]/div[9]/ss-side-slider/dialog/ss-button");
	By firstProduct = By.xpath("(//a[@class='link' and @itemprop='url'])[1]");
	By selectSizeBtn = By.xpath("//button[@data-sourcepid='P6736']");
	By selectSize = By.xpath("//button[@data-current-size='Size 44']");
	By addToBagBtn = By.xpath("//button[contains(text(),'Add to bag')]");
	By addedToBagLink = By.xpath("//*[contains(text(),'Added to bag')]");
	
	public void clickfilter() {
		driver.findElement(filter).click();
	}
	
	public void clickcolor() {
		driver.findElement(color).click();
	}
	
	public void clickblue() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(blue).click();
	}
	
	public void clickclose() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(close).click();
	}
	
	public void clickfirstProduct() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(firstProduct).click();
	}
	
	public void clickselectSizeBtn() {
		driver.findElement(selectSizeBtn).click();
	}
	
	public void clickselectSize() {
		driver.findElement(selectSize).click();
	}
	
	public void clickaddToBagBtn() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(addToBagBtn).click();
	}
	
	public void clickaddedToBagLink() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(addedToBagLink).click();
	}
}