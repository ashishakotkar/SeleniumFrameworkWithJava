package com.ss.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By cookieAcceptBtn = By.id("onetrust-accept-btn-handler");
	By hamburgerIcon = By.xpath("//span[@class='susu-icon susu-icon-menu']");
	By navPanelShoes = By.xpath("//button[@data-category='men-nav-shoes']");
	By navPanelSneakers = By.xpath("//a[contains(text(),'Sneakers')]");
	By goHomeLink = By.xpath("(//img[@alt='Suitsupply'])[2]");
	By navPanelClothing = By.xpath("//button[@data-category='men-nav-clothing']");
	By navPanelSuits = By.xpath("//button[contains(text(),'Suits')]");
	By navPanelClassicSuits = By.xpath("//a[@href='https://suitsupply.com/en-nl/men/suits/classic-suits' and contains(text(),'Classic')]");
	
	public void clickcookieAcceptBtn() {
		driver.findElement(cookieAcceptBtn).click();
	}
	
	public void clickhamburgerIcon() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(hamburgerIcon).click();
	}
	
	public void clicknavPanelShoes() {
		driver.findElement(navPanelShoes).click();
	}
	
	public void clicknavPanelSneakers() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(navPanelSneakers).click();
	}
	
	public void clickgoHomeLink() {
		driver.findElement(goHomeLink).click();
	}
	
	public void clicknavPanelClothing() {
		driver.findElement(navPanelClothing).click();
	}
	
	public void clicknavPanelSuits() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(navPanelSuits).click();
	}
	
	public void clicknavPanelClassicSuits() {
		driver.findElement(navPanelClassicSuits).click();
	}

}
