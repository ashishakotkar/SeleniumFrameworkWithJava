package com.ss.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoesPage {
	WebDriver driver;

	public ShoesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By filterBtn = By.xpath("//button[contains(text(),'Filter')]");
	By sortByFromPanel = By.xpath("/html/body/div[1]/div[9]/ss-side-slider/dialog/main/filters-wrapper/ss-accordion/ss-accordion-item[1]");
	By priceHighToLow = By.xpath("/html/body/div[1]/div[9]/ss-side-slider/dialog/main/filters-wrapper/ss-accordion/ss-accordion-item[1]/sort-wrapper/ss-input-wrap[4]");
	By closePanel = By.xpath("//html/body/div[1]/div[9]/ss-side-slider/dialog/ss-button");
	By firstProduct = By.xpath("(//a[@class='link' and @itemprop='url'])[1]");
	By selectSizeBtn = By.xpath("//button[@data-ga-selectsize='Select_Size']");
	By actualSize = By.xpath("//button[@data-current-size='Size 40']");
	By addToBagBtn = By.xpath("//button[contains(text(),'Add to bag')]");
	By addedToBagLink = By.xpath("//*[contains(text(),'Added to bag')]");
	
	public void clickfilterBtn() {
		driver.findElement(filterBtn).click();
	}
	
	public void clicksortByFromPanel() {
		driver.findElement(sortByFromPanel).click();
	}
	
	public void clickpriceHighToLow() {
		driver.findElement(priceHighToLow).click();
	}
	
	public void clickclosePanel() {
		driver.findElement(closePanel).click();
	}
	
	public void clickfirstProduct() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(firstProduct).click();
	}
	
	public void clickselectSizeBtn() {
		driver.findElement(selectSizeBtn).click();
	}
	
	public void clickactualSize() {
		driver.findElement(actualSize).click();
	}
	
	public void clickaddToBagBtn() {
		driver.findElement(addToBagBtn).click();
	}
	
	public void clickaddedToBagLink() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(addedToBagLink).click();
	}

}